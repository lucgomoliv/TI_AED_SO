package app;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import estruturadedados.Fila;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Escalonador
 */
public class Escalonador {

    // region variaveis

    private int prioridadeMinima, prioridadeMaxima;
    private Fila[] filasDeProcessos;
    private int quantum;
    private int i;
    private FileWriter file;
    private Thread CPU0;
    private Thread CPU1;
    private boolean cpu0bool;
    private boolean cpu1bool;

    // endregion

    // region getSets
    public Fila[] getFilasDeProcessos() {
        return this.filasDeProcessos;
    }

    /*
     * public Fila[] getFilasDeProntos() { return this.filasDeProntos; }
     */

    public int getPrioridadeMinima() {
        return this.prioridadeMinima;
    }

    private boolean setPrioridadeMinima(int prioridadeMinima) {
        if (prioridadeMinima <= this.prioridadeMaxima) {
            this.prioridadeMinima = prioridadeMinima;
            return true;
        } else
            return false;
    }

    public int getPrioridadeMaxima() {
        return this.prioridadeMaxima;
    }

    private boolean setPrioridadeMaxima(int prioridadeMaxima) {
        if (prioridadeMaxima >= this.prioridadeMinima) {
            this.prioridadeMaxima = prioridadeMaxima;
            return true;
        } else
            return false;
    }

    public int getQuantum() {
        return this.quantum;
    }

    public boolean setQuantum(int quantum) {
        if (quantum > 0) {
            this.quantum = quantum;
            return true;
        } else
            return false;
    }
    // endregion

    // region construtores
    /**
     * Construtores atribuem nulo para filas de processos se dados estiverem errados
     */

    // @note construtores
    /**
     * Construtor com vários processos sendo passados como parâmetros
     * 
     * @param prioridadeMinima prioridade mínima
     * @param prioridadeMaxima prioridade máxima
     * @param quantum          quantidade de tempo para execução para cada processo
     * @param processos        processos
     */
    public Escalonador(int prioridadeMinima, int prioridadeMaxima, int quantum, Processo... processos) {
        if (!(setPrioridadeMaxima(prioridadeMaxima) && setPrioridadeMinima(prioridadeMinima) && setQuantum(quantum)))
            filasDeProcessos = null;
        filasDeProcessos = new Fila[prioridadeMaxima - prioridadeMinima];
        for (Processo processo : processos)
            addProcesso(processo);
    }

    /**
     * Construtor sem processos
     * 
     * @param prioridadeMinima prioridade mínima
     * @param prioridadeMaxima prioridade máxima
     * @param quantum          quantidade de tempo para execução para cada processo
     */
    public Escalonador(int prioridadeMinima, int prioridadeMaxima, int quantum) {
        if (!(setPrioridadeMaxima(prioridadeMaxima) && setPrioridadeMinima(prioridadeMinima) && setQuantum(quantum)))
            filasDeProcessos = null;
        filasDeProcessos = new Fila[prioridadeMaxima - prioridadeMinima + 1];
        for (int i = 0; i < filasDeProcessos.length; i++)
            filasDeProcessos[i] = new Fila();
    }
    // endregion

    /**
     * Adiciona um processo a lista de processos, retornando um valor booleano se a
     * operção foi bem sucedida ou não
     * 
     * @param processo processo
     * @return true ou false
     */
    public boolean addProcesso(Processo processo) {
        if (processo.getPrioridade() - 1 < i)
            i = processo.getPrioridade() - 1;
        return filasDeProcessos[processo.getPrioridade() - 1].adicionarElemento(processo);
    }

    /**
     * Retorna a fila de acordo com a prioridade passada retornando null se a
     * prioridade não existir
     * 
     * @param prioridade
     * @return uma Fila ou null
     */
    public Fila filaPorPrioridade(int prioridade) {
        try {
            return filasDeProcessos[prioridade - 1];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fila não existe");
            return null;
        }
    }

    /**
     * Executa todos os processos na fila de processos
     * 
     * @param main JFrame que contém o método log
     * @throws InterruptedException
     */
    // @note executar
    public void executar(JFrameNovo main) throws InterruptedException {
        cpu0bool = true;
        cpu1bool = true;
        try {
            file = new FileWriter("log.txt");
            PrintWriter gravarArq = new PrintWriter(file);
            Semaphore semaphore = new Semaphore(2);
            for (i = 0; i < filasDeProcessos.length; ++i) {
                while (!filasDeProcessos[i].isEmpty()) {
                    Processo processo = (Processo) filasDeProcessos[i].retirarElemento();
                    semaphore.acquire();
                    if (cpu0bool) {
                        cpu0bool = false;
                        CPU0 = new Thread(() -> {
                            try {
                                main.execAgora(CPU0, processo);
                                gravarArq.printf(
                                        timeNow() + ": Processamento inciado para o PID: " + processo.getPid() + "\n");
                                processo.executar();
                                Thread.sleep(quantum);
                                cpu0bool = true;
                                semaphore.release();
                                gravarArq.printf(timeNow() + ": Processamento finalizado para o PID: "
                                        + processo.getPid() + "\n");
                                if (processo.getCiclos() != 0) {
                                    aplicarRegra(processo);
                                    addProcesso(processo);
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        CPU0.setName("CPU0");
                        CPU0.start();
                    } else if (cpu1bool) {
                        cpu1bool = false;
                        CPU1 = new Thread(() -> {
                            try {
                                main.execAgora(CPU1, processo);
                                gravarArq.printf(
                                        timeNow() + ": Processamento inciado para o PID: " + processo.getPid() + "\n");
                                processo.executar();
                                Thread.sleep(quantum);
                                cpu1bool = true;
                                semaphore.release();
                                gravarArq.printf(timeNow() + ": Processamento finalizado para o PID: "
                                        + processo.getPid() + "\n");
                                if (processo.getCiclos() != 0) {
                                    aplicarRegra(processo);
                                    addProcesso(processo);
                                }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        CPU1.setName("CPU1");
                        CPU1.start();
                    }
                    main.atualizar();
                }
            }
            file.close();
        } catch (IOException ex) {
            System.out.println("Não foi possivel criar o arquivo " + ex);
        }

    }

    /**
     * Rebaixa o processo em uma unidade de prioridade (Regra de negócio, consultar
     * a documentação para saber mais)
     * 
     * @param processo
     */
    public void rebaixarProcesso(Processo processo) {
        if (processo.getPrioridade() < 20)
            processo.setPrioridade(processo.getPrioridade() + 1);
    }

    /**
     * Promove o processo em uma unidade de prioridade (Regra de negócio, consultar
     * a documentação para saber mais)
     * 
     * @param processo
     */
    public void promoverProcesso(Processo processo) {
        if (processo.getPrioridade() > 1)
            processo.setPrioridade(processo.getPrioridade() - 1);
    }

    /**
     * Retorna o tempo atual
     * 
     * @return uma cadeia de caracteres no formato hh:mm:ss.SSS
     */
    private String timeNow() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int millis = now.get(ChronoField.MILLI_OF_SECOND);

        return (hour + ":" + minute + ":" + second + "." + millis);
    }

    /**
     * Define a prioridade do processo de acordo com os ciclos atual do processo
     * 
     */

    private void aplicarRegra(Processo processo) {
        if (processo.ciclosAtual == 10) { // Promoção
            promoverProcesso(processo);
            processo.ciclosAtual = 0;

        } else if (processo.ciclosAtual % 4 == 0) { // Rebaixamento
            rebaixarProcesso(processo);
            processo.ciclosAtual++;
        } else {
            processo.ciclosAtual++;
        }
    }

    /**
     * Abre o arquivo de Log
     * 
     */
    public void abrirLog() {
        try {
            java.awt.Desktop.getDesktop().open(new File("log.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Escalonador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException e) {
            try {
                new File("log.txt").createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro ao criar o arquivo");
            }
            abrirLog();
        }
    }

}
