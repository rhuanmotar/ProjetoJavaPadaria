/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Beans.Funcionario;
import Beans.Produto;

/**
 *
 * @author Rhuan Mota
 */
public interface IFachada {
   
    void inserir(Funcionario funcionario);
    
    void procurar (String CpfFuncionario);
    
    void remover(String CpfFuncionario);
    
    void inserir(Produto produto);
    
    void procurar (int idproduto);
    
    void remover(int idproduto);
    
    void mostrarLucro(double receita);
    
}
