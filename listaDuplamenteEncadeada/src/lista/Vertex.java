package lista;

public class Vertex {

	private Produto elemento;
	private Vertex anterior;
	private Vertex proximo;

	public Vertex(Produto elemento, Vertex anterior, Vertex proximo) {
		super();
		this.elemento = elemento;
		this.anterior = anterior;
		this.proximo = proximo;
	}

	public Produto getElemento() {
		return elemento;
	}

	public void setElemento(Produto elemento) {
		this.elemento = elemento;
	}

	public Vertex getAnterior() {
		return anterior;
	}

	public void setAnterior(Vertex anterior) {
		this.anterior = anterior;
	}

	public Vertex getProximo() {
		return proximo;
	}

	public void setProximo(Vertex proximo) {
		this.proximo = proximo;
	}

}
