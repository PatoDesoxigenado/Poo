package PooLista;

public class ListaPoo {

	public static void main(String[] args) {
	
		Lista l = new Lista();
		
		for(int i= 0; i < 5; i++) {
			
			l.addBloco(i);
			
		}
		
		l.mostraLista();
		
		System.out.print("Valor Encontrado -> ");
		System.out.println(l.localizaBloco(2).getValor());
		
	
	}

}
