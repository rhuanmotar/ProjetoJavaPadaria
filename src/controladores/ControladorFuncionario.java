package controladores;

import Beans.Funcionario;
import Repositório.RepositorioFuncionario;

public class ControladorFuncionario {

    
    RepositorioFuncionario ref = new RepositorioFuncionario(0);
	public void inserirFuncionario(Funcionario funcionario){ 
		
		ref.inserir(funcionario);
	}
	public Funcionario consultarFuncionario(String CpfFuncionario) {
		   Funcionario funcionario = ref.procurar(CpfFuncionario);
				
	if(funcionario == null){
	return null;
	}
        else{
	return funcionario;
				}
			}	
}                         

    
