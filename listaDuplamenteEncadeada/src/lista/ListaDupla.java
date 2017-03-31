package lista;

public class ListaDupla {

	private Vertex primeiro;
	private Vertex ultimo;
	private int countSize;

	public void addInicioListaDE(Produto elemento) {

		Vertex vert = new Vertex(null, elemento, this.primeiro);

		if (this.countSize == 0) {
			this.primeiro = vert;
			this.ultimo = this.primeiro;

		} else {

			this.primeiro.setAnterior(vert);
			this.primeiro = vert;

			countSize++;
		}
	}

	public void addListaDE(Produto elemento, int posicao) {

		if (posicao == 0) {
			this.addInicioListaDE(elemento);

		} else if (posicao == countSize) {
			this.addListaFinalDE(elemento);

		} else {

			Vertex vert1 = this.getVertex(posicao - 1);
			Vertex vert2 = vert1.getProximo();

			Vertex vert = new Vertex(vert1, elemento, vert2);
			vert1.setProximo(vert);
			vert2.setAnterior(vert);

			countSize++;
		}
	}

	public Vertex getVertex(int posicao) {

		Vertex vert = this.primeiro;

		for (int i = 0; i <= posicao; i++) {
			vert = vert.getProximo();

		}
		return vert;
	}

	public void addListaFinalDE(Produto elemento) {

		if (countSize == 0) {
			this.addInicioListaDE(elemento);
		} else {

			Vertex vert = new Vertex(this.ultimo, elemento, null);
			this.ultimo.setProximo(vert);
			this.ultimo = vert;
			countSize++;
		}

	}

	public void removeInicioListaDE() {

		if (this.countSize == 0) {
			System.out.println("A lista está vazia.");
		} else {

			Vertex vert = this.primeiro;
			this.primeiro = vert.getProximo();

			vert.setProximo(null);
			this.primeiro.setAnterior(null);

			this.countSize--;

			if (countSize == 0) {
				this.ultimo = null;
			}

		}
	}

	public void removeListaDE(int posicao) {

		if (posicao == 0) {
			this.removeInicioListaDE();
		} else if (posicao == countSize - 1) {
			this.removeFinalDE();
		} else {

			Vertex vert = this.getVertex(posicao);
			Vertex vert1 = vert.getAnterior();
			Vertex vert2 = vert.getProximo();
			vert1.setProximo(vert2);
			vert2.setAnterior(vert1);
			vert.setProximo(null);
			vert.setAnterior(null);
			countSize--;

		}
	}

	public void removeFinalDE() {

		if (this.countSize <= 1) {
			this.removeInicioListaDE();
		} else {

			Vertex vert = ultimo.getAnterior();
			vert.setProximo(null);
			ultimo.setAnterior(null);
			this.ultimo = vert;

			this.countSize--;
		}
	}

	public String toString() {

		Vertex vert = this.primeiro;
		String list = "";

		for (int i = 0; i < countSize; i++) {
			list += vert.getElemento() + " ";
			vert = vert.getProximo();
		}

		return "";
	}
}
