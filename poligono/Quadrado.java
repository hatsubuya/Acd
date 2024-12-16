public class Quadrado extends PoligonoRegular {
    
    @Override
    public double calcularArea() {
        
        double lado = this.getMedidaLado();
        
        return lado * lado;
        
    }
}