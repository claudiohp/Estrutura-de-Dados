package teste;

import lista.ListaDupla;
import lista.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto p =  new Produto();
		p.setNome("1");
		Produto p2 =  new Produto();
		p2.setNome("2");
		
		ListaDupla lista = new ListaDupla();
		
		lista.addInicioListaDE(p);;
		System.out.println(lista.toString()); 
		lista.addInicioListaDE(p2);;
		
		System.out.println(lista.toString()); 
				
	}

}
