package lista;

public class ListaEncadeada {
	
	private Node primeiro;
	private Node ultimo;
	private int countSize;
	
	//adiciona no final
	public void add(Produto conteudo){
		if(this.countSize == 0){
			this.addInicio(conteudo);
		} else {
			Node novoNo = new Node(conteudo, null);
			
			this.ultimo.setProximo(novoNo);
			this.ultimo = novoNo;
			
			this.countSize++;
			
		}
	}
	
	//adiciona em posicao especifica
	public void add(int posicao, Produto conteudo){
		
		if(posicao == 0){
			this.addInicio(conteudo);
		} else if(posicao == this.countSize-1){
			this.add(conteudo);
		} else{
			Node anterior = this.getNode(posicao - 1);
			Node novo = new Node(conteudo, anterior.getProximo());
			anterior.setProximo(novo);
			
			this.countSize++;
		}
	}
	
	public Node getNode(int posicao){
		
		Node tempNode = this.primeiro;
		
		for(int i = 0; i <= posicao; i++){
			tempNode = tempNode.getProximo();
		}
		
		return tempNode;
		
	}
	
	//adiciona no inicio
	public void addInicio(Produto conteudo){
		                   //armazenado, próximo
		Node no = new Node(conteudo, this.primeiro);
		
		this.primeiro = no;
		
		if(this.countSize == 0){
			this.ultimo = no;
		}
		
		countSize++;
		
	}
	
	public void remove(int posicao){
		
	}
	
	public void removeInicio(){
		
	}
	
	public void removeFinal(){
		
	}
	
	public void trocar(int posAtual, int posFinal){
		
	}
	
	public int tamanho(){
		return 0;
	}

	public String toString() {
		return "";
	}
	
	

}





















