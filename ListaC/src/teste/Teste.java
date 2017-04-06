package teste;

import listaC.ListaC;

public class Teste {
	
	public static void main(String[] args) {

		ListaC myList = new ListaC();
		
		myList.insertHead(15);
		System.out.println(myList.toString());
		
		myList.insertHead(85);
		System.out.println(myList.toString());
		
		myList.insertTail(2);
		System.out.println(myList.toString());
		
		myList.insertTail(63);
		System.out.println(myList.toString());
		
		myList.insertPosition(2, 5);
		System.out.println(myList.toString());
		
		myList.insertPosition(3, 75);
		System.out.println(myList.toString());
		
		myList.removeHead();
		System.out.println(myList.toString());
		
		myList.removeTail();
		System.out.println(myList.toString());
		
		myList.remove(1);
		System.out.println(myList.toString());
	}
	
	
}
