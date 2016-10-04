
package controladores;


public class ControladorFinanceiro {
    
    private double gasto;
    
    public double mostrarGasto(double salario){
    
        double SomaSalario = 0;
        SomaSalario = SomaSalario +salario;
        double gasto = SomaSalario;
        return this.gasto;
        }
    public double mostrarLucro(double receita){
    
        double lucro = receita - gasto;
        return lucro;
    }
}
