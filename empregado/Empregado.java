public class Empregado implements Autentificavel, Pagavel {

    private String nome;
    
    private String senha;


    public Empregado(String nome, String senha) {
        
        this.nome = nome;
        
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
      
        return this.senha.equals(senha);
        
    }


    @Override
    public double valorPagto() {
        
        return 3000.00;
    }

    public String getNome() {
        
        return nome;
        
    }

    public String getSenha() {
        
        return senha;
        
    }
}