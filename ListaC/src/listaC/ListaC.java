package listaC;

public class ListaC {

	private Node head;
	private Node tail;
	private int countSize = 0;

	// m�todo inserir a cabe�a um conte�do inteiro
	public void insertHead(int content) {

		// Instanciar a Classe N� passando como parametro o ultimo, conteudo e
		// cabe�a.
		Node newNode = new Node(this.tail, content, this.head);

		// Se o contador receber 0 ent�o ele insere ao inicio ou no final um
		// novo n�.
		if (this.countSize == 0) {
			this.head = newNode;
			this.tail = newNode;

			/*
			 * Caso ele n�o seja vazio, o primeiro aponta para um novo n�. E o
			 * primeiro recebe um novo n�. Para circular os dados o ultimo deve
			 * receber o proximo referenciando a cabe�a.Incrementa.
			 */
		} else {
			this.head.setPrevious(newNode);
			this.head = newNode;
			this.tail.setNext(head);

		}

		countSize++;

	}

	// m�todo para inserir ao final um conte�do inteiro.
	public void insertTail(int content) {

		// Se posi��o for 0 recebe o m�todo adiciona na cabe�a.
		if (this.countSize == 0) {
			this.insertHead(content);

			/*
			 * Instanciar a Classe N� passando como parametro o ultimo, conteudo
			 * e cabe�a. o ultimo aponta para o pr�ximo n� e o ultimo recebe um
			 * novo n�. o novo n� q no m�todo � o ultimo, aponta para a cabe�a
			 * para circular. Incrementa.
			 */
		} else {

			Node newNode = new Node(this.tail, content, this.head);
			this.tail.setNext(newNode);
			this.tail = newNode;
			newNode.setNext(head);
			this.countSize++;

		}

	}

	// m�todo para inserir a uma posi��o.
	public void insertPosition(int position, int content) {

		// se a posi��o for vazia recebe a cabe�a.
		if (position == 0) {
			this.insertHead(content);

			// se a posi��o for igual ao contador insere ao final um conte�do.
		} else if (position == this.countSize) {
			this.insertTail(content);
			/*
			 * 
			 */
		} else {

			Node temp1 = this.getNode(position - 1);
			Node temp2 = temp1.getNext();

			Node newNode = new Node(temp1, content, temp2);
			temp1.setNext(newNode);
			temp2.setPrevious(newNode);
			temp1.setNext(head);
			temp2.setPrevious(tail);
			this.countSize++;
		}

	}

	public Node getNode(int position) {

		Node temp = this.head;

		for (int i = 0; i < position; i++) {
			temp = temp.getNext();
		}

		return temp;
	}

	// remove da cabe�a
	public void removeHead() {

		// Se o contador for 0 imprima que a lista est� vazia.
		if (this.countSize == 0) {
			System.out.println("A lista est� vazia");

			/*
			 * N� tempor�rio sem valor atribuido, recebe o primeiro. Primeiro
			 * recebe temporario apontando para o proximo. Tempor�rio aponta o
			 * proximo como vazio e a cabe�a aponta pro anterior removendo. Se o
			 * contador for 0 ultimo recebe vazio.
			 * 
			 */
		} else {
			Node temp = this.head;
			this.head = temp.getNext();

			temp.setNext(null);
			head.setPrevious(null);

			this.countSize--;

			if (countSize == 0) {
				this.tail = null;
			
			//Verificar uma forma de o tail apontar para o primeiro na quest�o da remo��o.
			} else {
				
			}
		}
	}

	public void removeTail() {

		if (countSize <= 1) {
			this.removeHead();
		} else {
			Node temp = this.tail.getPrevious();
			temp.setNext(null);
			this.tail.setPrevious(null);
			this.tail = temp;

			this.countSize--;
		}
	}

	public void remove(int position) {

		if (position == 0) {
			this.removeHead();
		} else if (position == countSize - 1) {
			this.removeTail();
		} else {

			Node node = this.getNode(position);
			Node temp1 = node.getPrevious();
			Node temp2 = node.getNext();

			temp1.setNext(temp2);
			temp2.setPrevious(temp1);

			node.setNext(null);
			node.setPrevious(null);

			this.countSize--;
		}
	}

	public String toString() {

		Node temp = this.head;
		String list = "";

		for (int i = 0; i < countSize; i++) {
			list += temp.getContent() + " ";
			temp = temp.getNext();
		}

		return list;
	}

}
