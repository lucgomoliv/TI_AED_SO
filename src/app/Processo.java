package app;

import java.util.Objects;

import estruturadedados.IDado;

/**
 * Processo
 */
public class Processo implements IDado {

    private static int nextPid = 0;    
    private int pid;
    private String nome;
    private int prioridade;
    private int ciclos;
    public int ciclosAtual = 0;

    // region construtores
    // Construtor cria um processo com pid -1 caso haja algum erro com os dados
    // passados
    public Processo(int pid, String nome, int prioridade, int ciclos) {
        if (!(setPrioridade(prioridade) && setCiclos(ciclos)))
            this.pid = -1;
            setNome(nome);
            this.pid = pid;
    }

    public Processo(String nome, int prioridade, int ciclos){
        if (!(setPrioridade(prioridade) && setCiclos(ciclos)))
            this.pid = -1;
            setNome(nome);
            this.pid = nextPid++;
    }
    // endregion

    // region gerais
    /**
     * Retorna o PID do processo
     * 
     * @return pid do processo
     */
    public int getPid() {
        return this.pid;
    }

    /**
     * Retorna o nome do processo
     * 
     * @return nome do processo
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Atribui o nome passado para o processo
     * 
     * @param nome nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a prioridade do processo
     * 
     * @return a prioridade do processo
     */
    public int getPrioridade() {
        return this.prioridade;
    }

    /**
     * Atribui uma nova prioridade para o processo e retorna uma valor booleano indicando se a operação foi bem sucedida ou não
     * 
     * @param prioridade prioridade
     * @return true ou false
     */
    public boolean setPrioridade(int prioridade) {
        if (prioridade >= 1) {
            this.prioridade = prioridade;
            return true;
        } else
            return false;
    }

    /**
     * Retorna a quantidade de ciclos do processo
     * @return a quantidade de ciclos do processo
     */
    public int getCiclos() {
        return this.ciclos;
    }

    /**
     * Atribui uma nova quantidade de ciclos para o processo e retorna uma valor booleano indicando se a operação foi bem sucedida ou não
     * @param ciclos quantidade de ciclos
     * @return true ou false
     */
    public boolean setCiclos(int ciclos) {
        if (ciclos > 0) {
            this.ciclos = ciclos;
            return true;
        } else
            return false;
    }

    /**
     * Compara um processo com outro para ver se são iguais de acordo com o seu PID
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Processo)) {
            return false;
        }
        Processo processo = (Processo) o;
        return pid == processo.pid;
    }

    /**
     * Retorna um número hash que representa os dados do processo
     */
    @Override
    public int hashCode() {
        return Objects.hash(pid, nome, prioridade, ciclos);
    }

    /**
     * Retorna uma cadeia de caracteres com as informações do processo
     */
    @Override
    public String toString() {
        return "PID='" + getPid() + "'" + ", nome='" + getNome();
    }

    /**
     * Compara o processo com outro processo para saber quem é maior ou menor de acordo com o seu PID
     */
    @Override
    public int compareTo(IDado o) {
        Processo processo = (Processo) o;
        if (processo.getPid() > this.pid)
            return 1;
        else if (processo.getPid() < this.pid)
            return -1;
        else
            return 0;
    }

    @Override
    public int getID() {
        return this.pid;
    }
    // endregion

    /**
     * Executa a função do processo
     * @param quantum quantidade de tempo que o processo tem para executar
     * @throws InterruptedException
     */
    public void executar() throws InterruptedException { // @note executar
        ciclos--;
    }
}