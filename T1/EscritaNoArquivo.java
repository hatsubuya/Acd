import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaNoArquivo 
{
    
    private BufferedWriter escritor;

    
    public EscritaNoArquivo(String nomeDoArquivo) throws IOException 
    {
        this.escritor = new BufferedWriter(new FileWriter(nomeDoArquivo, true)); // O parâmetro 'true' permite adicionar conteúdo ao final do arquivo
    }

    
    public void escreverLinha(String conteudo) throws IOException 
    {
        escritor.write(conteudo);
        escritor.newLine();
    }

    
    public void fecharArquivo() throws IOException 
    {
        
        if (escritor != null) 
        {
            escritor.close();
        }
    }


}
