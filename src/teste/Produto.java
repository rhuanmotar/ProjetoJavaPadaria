package teste;

public class Produto {
   
   private String id; 
   private String nome;
   private double preco;
   
   public Produto (String id, String nome,  double preco) {
       
       this.nome = nome;
       this.id = id;
       this.preco = preco;
     
   }

    public String getNome() {
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

     public String getId() {
        return id;
    }

        public void setId(String id) {
        this.id = id;
    }

        public double getPreco() {
        return preco;
    }

        public void setPreco(double preco) {
        this.preco = preco;
    }
    
}