
package stack;

import java.util.NoSuchElementException;

public class LinkedStack {
	
	private Node top;
	private int size;
	public LinkedStack(){
		this.top = null;
		this.size =0;
	}
	
	public int size(){
		return this.size;
	}
	
	/**
	 * Método para conferir se a lista está vazia.
	 * @return
	 */
	public boolean isEmpty(){
		return (top == null);
	}
	
	/**
	 * Push = empilha
	 */
	public void push(int content){
		Node oldTop = top;
		//Node newNode = new Node(content);
		//top = newNode;
		top = new Node(content);
		top.setNext(oldTop);
		
		size++;
	}
	/**
	 * Desimpilha a lista e retorna o valor.
	 * Pop = desempilha
	 */
	public int pop(){
			if(isEmpty()){
				throw new NoSuchElementException("Stack is empty.");
			}
			Node oldTop = top;
			int content = oldTop.getContent();
			top = oldTop.getNext();
			oldTop.setNext(null);
			
			size--;
			return content;
	}
	
	/**
	 *  Observa: Não desimpilha
	 * @return
	 */
	public int peek(){
		
		if(isEmpty()){
			throw new NoSuchElementException("Stack is empty.");
		}
		
		return top.getContent();
	}
	
	@Override
	public String toString() {
		
		String s = "";
		Node temp = top;
		for(int i = 1; i < this.size; i++){
			s += temp.getContent() + "\n";
			temp = temp.getNext();
		}
		return s;
	}
}

