package MãoNaMassa;

public class Bloco {
    private int valor;
    Bloco prox;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        Bloco novo = new Bloco();
        novo.valor = 15;

        int b = setValor(novo.valor);

        System.out.println(b);
    }
}
