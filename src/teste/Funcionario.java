     
package teste;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;
    
    public Funcionario (String nome, String cpf, String endereco, double salario ){
    
    this.nome = nome;
    this.cpf = cpf;
    this.endereco = endereco;
    this.salario = salario;
}

    public Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public String getNome() {
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public String getCpf() {
        return cpf;
    }

       public void setCpf(String cpf) {
        this.cpf = cpf;
    }

        public String getEndereco() {
        return endereco;
    }

        public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
