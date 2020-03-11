package estruturadedados;

/**
 * Fila
 */
public class Fila {

    private Elemento ultimo, primeiro;

    public Fila(){
        this.ultimo = this.primeiro = new Elemento(null);
    }

    // Adiciona um elemento no final da fila
    public boolean add(IDado dado){
        this.ultimo.proximo = ultimo = new Elemento(dado);
        return true;
    }

    // Retira o primeiro elemento da fila
    public IDado retirar(){
        if(this.primeiro == this.ultimo) return null;
        Elemento aux = this.primeiro.proximo;
        this.primeiro.proximo = aux.proximo;
        if(aux == this.ultimo) this.primeiro = this.ultimo;
        return aux.dado;
    }

    // Retorna true se a fila está vazia
    public boolean isEmpty(){
        if(this.primeiro.proximo == null) return true;
        else return false;
    }
}