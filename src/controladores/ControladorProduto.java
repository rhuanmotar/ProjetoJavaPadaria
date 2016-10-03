package controladores;

import teste.Produto;
import teste.RepositorioFuncionario;
import teste.RepositorioProduto;

public class ControladorProduto {
    
   RepositorioProduto rep = new RepositorioProduto(0);
	public void inserirProduto(Produto produto){ 
		
		rep.inserir(produto);
	}
	public Produto consultarProduto(String idproduto) {
		   Produto produto = rep.procurar(idproduto);
				
	if(produto == null){
	return null;
	}
        else{
	return produto;
				}
			}	
}                         

    
