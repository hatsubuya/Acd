public class ContaBancariaSimplificada {
    
    private String nomeDoCorrentista;
    
    private float saldo;
    
    private boolean contaEEspecial;

    
    public ContaBancariaSimplificada(String nomeDoCorrentista, float saldo, boolean contaEEspecial) {
        
        this.nomeDoCorrentista = nomeDoCorrentista;
        
        this.saldo = saldo;
        
        this.contaEEspecial = contaEEspecial;
        
    }

    
    public void abreConta(String nome, float deposito, boolean eEspecial) {
        
        this.nomeDoCorrentista = nome;
        
        this.saldo = deposito;
        
        this.contaEEspecial = eEspecial;
    }


    public void abreContaSimples(String nome) {
        
        this.nomeDoCorrentista = nome;
        
        this.saldo = 0.0f; 
        
        this.contaEEspecial = false;
    }

    
    public void deposita(float valor) {
        
        if (valor > 0) {
            
            this.saldo += valor;
            
        }
        
        else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    
    public void retira(float valor) {
        
        if (valor > 0 && valor <= saldo) {
            
            this.saldo -= valor;
            
        }
        
        else {
            
            System.out.println("saldo insuficiente.");
        }
    }


    public void mostraDados() {
        
        System.out.println("Nome do Correntista: " + nomeDoCorrentista);
        
        System.out.println("Saldo: R$ " + saldo);
        
        System.out.println("Conta Especial: " + (contaEEspecial ? "Sim" : "Não"));
    }

    public void adicionarRendimentos() {
        
        if (contaEEspecial) {
            
            saldo += saldo * 0.015f;
            
            System.out.println("rendimento aplicado, novo saldo:" + saldo);
            
        }
         else {
             
            System.out.println("Não há rendimentos para contas simples");
        }
    }
}