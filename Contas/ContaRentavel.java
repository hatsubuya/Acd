public class ContaRentavel extends ContaBancaria {
    
    public void creditaJuros() {
        
        if (saldo < 400) {
            
            saldo += saldo * 0.04;
            
        } 
        else {
            
            saldo += saldo * 0.02;
            
        }
    }

    public void debitaTaxa() {
        
    }

    public double valorEmprestimo() {
        
        return saldo * 2;
        
    }

    public void setNumConta(int numConta) {
        
        this.numConta = numConta;
        
    }

    public void deposita(double valor) {
        
        saldo += valor;
        
    }

    public double retornaSaldo() {
        
        return saldo;
        
    }

    public int retornaNumConta() {
        
        return numConta;
        
    }

    public String toString() {
        
        return "Conta Rentável [Número: " + numConta + ", Saldo: " + saldo + "]";
        
    }
}