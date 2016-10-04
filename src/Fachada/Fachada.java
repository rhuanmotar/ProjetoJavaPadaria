
 
package Fachada;

import Beans.Funcionario;
import Beans.Produto;
import controladores.ControladorFuncionario;
import controladores.ControladorProduto;


public class Fachada implements IFachada {
    
    private static ControladorFuncionario inserirFucnionario;
    private static ControladorProduto inserirProduto;

    @Override
    public void inserir(Funcionario funcionario) {
        
    }

    @Override
    public void procurar(String CpfFuncionario) {
        
    }

    @Override
    public void remover(String CpfFuncionario) {
        
    }

    @Override
    public void inserir(Produto produto) {
        
    }

    @Override
    public void procurar(int idproduto) {
        
    }

    @Override
    public void remover(int idproduto) {
        
    }

    @Override
    public void mostrarLucro(double receita) {
    
    }
    
}
