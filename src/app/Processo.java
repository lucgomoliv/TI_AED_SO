package app;

import java.util.Objects;

import estruturadedados.IDado;

/**
 * Processo
 */
public class Processo extends Thread implements IDado {

    static int nextPid = 0;
    private int pid;
    private String nome;
    private int prioridade;
    private int ciclos;

    // region construtores
    // Construtor cria um processo com pid -1 caso haja algum erro com os dados
    // passados
    public Processo(String nome, int prioridade, int ciclos) {
        if(!(setPrioridade(prioridade) && setCiclos(ciclos))) this.pid = -1;
        setNome(nome);
        this.pid = nextPid;
        nextPid++;
    }
    // endregion

    // region gerais
    public int getPid() {
        return this.pid;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public boolean setPrioridade(int prioridade) {
        if (prioridade >= 1) {
            this.prioridade = prioridade;
            return true;
        } else
            return false;
    }

    public int getCiclos() {
        return this.ciclos;
    }

    public boolean setCiclos(int ciclos) {
        if (ciclos > 0) {
            this.ciclos = ciclos;
            return true;
        } else
            return false;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(pid, nome, prioridade, ciclos);
    }

    @Override
    public String toString() {
        return "{" + " pid='" + getPid() + "'" + ", nome='" + getNome() + "'" + ", prioridade='" + getPrioridade() + "'"
                + ", ciclos='" + getCiclos() + "'" + "}";
    }

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

    public void executar(int quantum) throws InterruptedException { // @note executar
        if (ciclos >= quantum) {
            Thread.sleep(quantum);
            ciclos -= quantum;
        } else {
            Thread.sleep(ciclos);
            ciclos = 0;
        }
        Thread.currentThread().notify();
    }
}