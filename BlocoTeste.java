public class BlocoTeste {

    int valor;
    BlocoTeste prox;
    public static void main(String[] args) {
        BlocoTeste inicio = new BlocoTeste();
        inicio.valor = 5;

        BlocoTeste b1 = new BlocoTeste();
        b1.valor = 6;
        
        BlocoTeste b2 = new BlocoTeste();
        b2.valor = 7;

        inicio.prox = b1;
        b1.prox = b2;

        BlocoTeste aux = inicio;

        while (aux != null) {
            System.out.println(aux.valor);
            aux = aux.prox;
        }

        System.out.println("\nNova Lista");

        int cont = 0; int limite = 3;

        BlocoTeste novo = new BlocoTeste();
        novo.valor = 15;

        aux = inicio;
        while (aux != null && cont < limite - 1) {
            cont++;
            aux = aux.prox;
        }

        if (aux != null) {
            novo.prox = aux.prox;
            aux.prox = novo;
        }

        aux = inicio;
        while (aux != null){
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }
}