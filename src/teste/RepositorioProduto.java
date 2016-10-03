package teste;

public class RepositorioProduto {
    
    private int indice;
    private Produto [] produto;
    private int tamanho = 1; 
	public RepositorioProduto(int tamanho){ 
		this.tamanho = tamanho; 
		this.indice = 1; 
		this.produto = new Produto[this.tamanho]; 
	}

public void inserir(Produto produto){
	 this.produto[indice] = produto;
	 this.indice = this.indice + 1;
}

public Produto procurar (int idproduto){
	Produto procurar = null;
	
	for(int i=0; i<this.indice; i++){
		Produto aux = this.produto[i];
		
		if(aux.getId().equals(idproduto)) {
                    procurar = aux;
                } else {
                }
	}
	return procurar;
}

public void remover(int idproduto){
	for(int i=0; i<this.indice; i++){
		Produto aux = this.produto[i];
		if(aux.getId().equals(idproduto)){
			this.produto[i] = this.produto[indice - 1];
			this.produto[indice -1] = null;
			this.indice = this.indice -1;
							
		}
	}
}

    public Produto procurar(String idproduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
