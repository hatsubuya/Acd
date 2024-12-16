public class Retangulo {
    
    private float largura;
    
    private float comprimento;

    
    public Retangulo(float largura, float comprimento) {
        
        setLargura(largura);
        
        setComprimento(comprimento);
        
    }

    
    public float getLargura() {
        
        return largura;
        
    }

    
    public void setLargura(float largura) {
        
        if (largura > 0.0 && largura < 20.0) {
            
            this.largura = largura;
            
        } else{
            
            this.largura = 1.0f;
            
        }
    }

    
    public float getComprimento() {
        
        return comprimento;
        
    }

    
    public void setComprimento(float comprimento) {
        
        if (comprimento > 0.0 && comprimento < 20.0) {
            
            this.comprimento = comprimento;
            
        } 
        else {
            
            this.comprimento = 1.0f;
        }
    }

    
    public float calcularPerimetro() {
        
        return 2 * (largura + comprimento);
        
    }

    
    public float calcularArea() {
        
        return largura * comprimento;
        
    }
}