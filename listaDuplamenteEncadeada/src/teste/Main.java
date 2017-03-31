package teste;

import lista.ListaDupla;
import lista.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Claudio");	
		Produto p2 = new Produto("Luiza");	
		
		ListaDupla l1 = new ListaDupla();
		
		l1.addInicioListaDE(p1);
		l1.addInicioListaDE(p2);
		
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
