package app;

import estruturadedados.Fila;

/**
 * Escalonador
 */
public class Escalonador {

    // region variaveis

    private int prioridadeMinima, prioridadeMaxima;
    private Fila[] filasDeProcessos;
    private Fila filaDeEspera;
    private int quantum;

    // endregion

    // region getSets
    public Fila[] getFilasDeProcessos() {
        return this.filasDeProcessos;
    }

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
    // Construtor atribui nulo para filas de processos se dados estiverem errados
    public Escalonador(int prioridadeMinima, int prioridadeMaxima, int quantum, Processo... processos) { // @note
                                                                                                         // construtor
        if (!(setPrioridadeMaxima(prioridadeMaxima) && setPrioridadeMinima(prioridadeMinima) && setQuantum(quantum)))
            filasDeProcessos = null;
        filasDeProcessos = new Fila[prioridadeMaxima - prioridadeMinima];
        for (Processo processo : processos)
            addProcesso(processo);
        filaDeEspera = new Fila();
    }

    // Construtor atribui nulo para filas de processos se dados estiverem errados
    public Escalonador(int prioridadeMinima, int prioridadeMaxima, int quantum) {
        if (!(setPrioridadeMaxima(prioridadeMaxima) && setPrioridadeMinima(prioridadeMinima) && setQuantum(quantum)))
            filasDeProcessos = null;
        filasDeProcessos = new Fila[prioridadeMaxima - prioridadeMinima];
        filaDeEspera = new Fila();
    }
    // endregion

    public boolean addProcesso(Processo processo) {
        return filasDeProcessos[processo.getPrioridade() - 1].adicionarElemento(processo);
    }

    // Retorna a fila de acordo com a prioridade
    public Fila filaPorPropriedade(int prioridade) {
        return filasDeProcessos[prioridade - 1];
    }

    // Executa todos os processos na fila de processos
    public void executar() throws InterruptedException { //@note executar
        for (Fila fila : filasDeProcessos) {
            while (!fila.isEmpty()) {
                Processo processo = (Processo) fila.retirarElemento();
                processo.executar(quantum);
                processo.wait();
                if (processo.getCiclos() != 0) {
                    filaDeEspera.adicionarElemento(processo);
                    rebaixarProcesso(processo);
                }
            }
        }

        while (!filaDeEspera.isEmpty())
            addProcesso((Processo) filaDeEspera.retirarElemento());
    }

    public void rebaixarProcesso(Processo processo) {
        if (processo.getPrioridade() < 20)
            processo.setPrioridade(processo.getPrioridade() + 1); // Regra de negócio, consulte a documentacao
    }

    public void promoverProcesso(Processo processo) {
        if (processo.getPrioridade() > 1)
            processo.setPrioridade(processo.getPrioridade() - 1); // Regra de negócio, consulte a documentacao
    }
}