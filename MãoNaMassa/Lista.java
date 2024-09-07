package MãoNaMassa;

public class Lista {
    public Bloco inicio;

    public void addBloco(int valor) {
        Bloco novo = new Bloco();
        novo.setValor(valor);

        novo.prox = inicio;
        inicio = novo;
    }

    public void mostraLista() {
        Bloco aux = this.inicio;

        while (aux != null) {
            System.out.println(aux.getValor());
            aux = aux.prox;
        }
    }

    public Bloco localizarBloco(int i) {
        Bloco aux = this.inicio;
        int cont = 0;

        while (aux != null && cont < i) {
            aux = aux.prox;
            cont++;
        }

        return aux;
    }

    public static void main(String[] args) {
        Lista lata = new Lista();

        for (int i = 0; i < 5; i++) {
            lata.addBloco(i);
        }

        lata.mostraLista();

        System.out.println("Procurando número " + 6 + ':');
        
        if (lata.localizarBloco(6) == null) {
            System.out.println("Número não existe na lista");
        } else {
            System.out.println(lata.localizarBloco(6).getValor());
        }
    }
}
