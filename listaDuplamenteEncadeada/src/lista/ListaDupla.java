package lista;

public class ListaDupla {

	private Vertex primeiro;
	private Vertex ultimo;
	private int countSize;
	
	public void addInicioListaDE(Produto elemento) {

		Vertex vert = new Vertex(elemento, this.primeiro, null);

		if (this.countSize == 0) {
			this.primeiro = vert;
			this.ultimo = vert;

		} else {
			this.primeiro.setAnterior(vert);
			this.primeiro = vert;
		}
		countSize++;

	}
	// if (this.countSize == 0) {
	// this.primeiro = vert;
	// } else () {
	// this.primeiro.setProximo(vert);
	// this.ultimo.setAnterior(vert);
	// countSize++;
	// }
	// }

	public void addListaDE(Produto elemento, int posicao) {
		
		Vertex vert = new Vertex(elemento, null, null);
		
		if(posicao == 0){
			this.addInicioListaDE(elemento);
		} else{
			
		}
	}

	public void addFinalDE(Produto elemento) {
		
		Vertex vert = new Vertex(elemento, null, null);
		
		if (countSize == 0) {
			this.addInicioListaDE(elemento);
		} else {
			this.ultimo.setProximo(vert);
			vert.setAnterior(this.ultimo);
			this.ultimo = vert;
			countSize++;
		}

	}

	public void removeInicioListaDE() {

	}

	public void removeListaDE() {

	}

	public void removeFinalDE() {

	}

}
