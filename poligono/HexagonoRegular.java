public class HexagonoRegular extends PoligonoRegular {
    
    @Override
    public double calcularArea() {
        
        double lado = this.getMedidaLado();
        
        return (3 * Math.sqrt(3) / 2) * lado * lado;
        
    }
}