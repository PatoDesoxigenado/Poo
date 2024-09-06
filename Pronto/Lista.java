package Pronto;


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
		
		while(aux != null) {
			System.out.println(aux.getValor());
			aux = aux.prox;
		}
		
	}
	
	public Bloco localizaBloco(int i) {
		Bloco aux = this.inicio;
		int cont = 0;
		
		while(aux != null && cont < i) {
			aux = aux.prox; 
			cont++;
		}
		
		return aux;
		
	}
	
	
}
