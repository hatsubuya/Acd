public class Emprestimo {
    
    private Pessoa pessoa;
    
    private Livro livro;
    
    private Data data;

    
    public Emprestimo(Pessoa pessoa, Livro livro, Data data) {
        
        this.pessoa = pessoa;
        
        this.livro = livro;
        
        this.data = data;
    }

    
    public Pessoa getPessoa() {
        
        return pessoa;
        
    }

    public void setPessoa(Pessoa pessoa) {
        
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        
        return livro;
    }

    public void setLivro(Livro livro) {
        
        this.livro = livro;
    }

    public Data getData() {
        
        return data;
    }

    public void setData(Data data) {
        
        this.data = data;
    }
    
    public String toString() {
        
        return "Pessoa: " + pessoa.toString() + ", Livro: " + livro.toString()+ ", Data: " + data.toString();
    }
}
