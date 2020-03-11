package estruturadedados;

/**
 * Elemento
 */
public class Elemento {

    public IDado dado;
    public Elemento proximo;

    public Elemento(IDado dado){
        this.dado = dado;
        this.proximo = null;
    }
}