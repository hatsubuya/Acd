public class TrianguloEquilatero extends PoligonoRegular {
    
    @Override
    public double calcularArea() {
        
        double lado = this.getMedidaLado();
        
        return (Math.sqrt(3) / 4) * lado * lado;
        
    }
}
