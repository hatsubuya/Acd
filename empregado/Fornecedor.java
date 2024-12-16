public class Fornecedor implements Autentificavel {
    
    private String senha;

    
    public Fornecedor(String senha) {
        
        this.senha = senha;
        
    }

    
    @Override
    public boolean autentica(String senha) {
        
        return this.senha.equals(senha);
        
    }
}