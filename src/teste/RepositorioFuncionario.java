package teste;

public class RepositorioFuncionario {
    
    
    private int indice;
    private Funcionario[] funcionario;
    private int tamanho = 0; 
	public RepositorioFuncionario(int tamanho){ 
		this.tamanho = tamanho; 
		this.indice = 1; 
		this.funcionario = new Funcionario[this.tamanho]; 
	}

    public RepositorioFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public void inserir(Funcionario funcionario){
	 this.funcionario[indice] = funcionario;
	 this.indice = this.indice + 1;
}

public Funcionario procurar (String CpfFuncionario){
	Funcionario procurar = null;
	
	for(int i=0; i<this.indice; i++){
		Funcionario aux = this.funcionario[i];
		
		if(aux.getCpf().equals(CpfFuncionario))
			procurar = aux;
	}
	return procurar;
}

public void remover(String CpfFuncionario){
	for(int i=0; i<this.indice; i++){
		Funcionario aux = this.funcionario[i];
		if(aux.getCpf().equals(CpfFuncionario)){
			this.funcionario[i] = this.funcionario[indice - 1];
			this.funcionario[indice -1] = null;
			this.indice = this.indice -1;
							
		}
	}
}
}

 
   