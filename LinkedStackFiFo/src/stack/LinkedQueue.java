package stack;

import java.util.NoSuchElementException;

public class LinkedQueue {

	private Node first;
	private Node last;
	private int size;

	private boolean isEmpty() {
		return (first == null);
	}

	public int size() {
		return this.size;
	}

	/**
	 * Adiciona um elemento na fila. De fato que, o ultimo recebe o valor, logo
	 * ele será o primeiro. Caso esteja vazia vai receber o primeiro sendo
	 * ultimo. Enfileirar
	 * 
	 * @param content
	 */
	public void enqueue(int content) {

		Node oldLast = this.last;
		this.last = new Node(content);
		this.last.setNext(null);

		if (isEmpty()) {
			this.first = this.last;

		} else {
			oldLast.setNext(last);
		}

		this.size++;
	}

	/**
	 * Desenfileirar
	 * 
	 * @param content
	 */
	public int dequeue() {

		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}

		Node oldFirst = this.first;
		this.first = oldFirst.getNext();
		oldFirst.setNext(null);

		this.size--;

		if (isEmpty()) {
			this.first = this.last = null;
		}

		return oldFirst.getContent();
	}

	public int peek() {

		if (isEmpty()) {
			throw new NoSuchElementException("Queue is empty");
		}

		return first.getContent();
	}

	@Override
	public String toString() {

		String s = "";
		Node temp = first;
		for (int i = 1; i < this.size; i++) {
			s += temp.getContent() + " ";
			temp = temp.getNext();
		}

		return s;
	}
}
