public abstract class ContaBancaria implements EmprestimoFinanciavel {
    
    protected int numConta;
    
    protected double saldo;

    public abstract void creditaJuros();
    
    public abstract void debitaTaxa();
    
    public abstract void setNumConta(int numConta);
    
    public abstract void deposita(double valor);
    
    public abstract double retornaSaldo();
    
    public abstract int retornaNumConta();
    
    public abstract String toString();
}