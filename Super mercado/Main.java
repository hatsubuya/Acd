import java.util.ArrayList;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         
        int op;
        
        int op2;
        
        int val;
        
        String nome;
        
        String cpf;
        
        boolean compra=false;
        
        Cliente cliente =  new Cliente("glass","cannon");
    
        Produto arroz = new Produto(Descricao.ARROZ, 5.99, 100);
        
        Produto feijao = new Produto(Descricao.FEIJAO, 7.49, 50);
        
        Produto farinha = new Produto(Descricao.FARINHA, 3.49, 80);
        
        Produto leite = new Produto(Descricao.LEITE, 2.99, 150);
        
        Item arrozq = new Item(0);
        
        Item feijaoq = new Item(0);
        
        Item farinhaq = new Item(0);
        
        Item leiteq = new Item(0);
        
        Scanner scanner = new Scanner(System.in);
        
        Pedido pedido = new Pedido();

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1) Novo Pedido");
            System.out.println("2) Realizar Pagamento");
            System.out.println("0) Sair");
            op = scanner.nextInt();
            scanner.nextLine();
            
            switch(op)
            {
                case 1:
                    
                    System.out.println("digite o nome");
                    nome = scanner.nextLine();
                    
                    cliente.setNome(nome);
                    
                    System.out.println("digite o cpf");
                    cpf = scanner.nextLine();
                    
                    cliente.setCpf(cpf);
                    
                    do{
                        
                        System.out.println("1-"+arroz.toString()+"\n"+"2-"+feijao.toString()+"\n"+"3-"+farinha.toString()+"\n"+"4-"+leite.toString()+"\n"+"0-Sair"+"\n"+"sua escolha");
                        op2 = scanner.nextInt();
                        
                        switch(op2)
                        {
                            case 1:
                                
                                System.out.println("porfavor digite a quantidade");
                                val = scanner.nextInt();
                                
                                arrozq.setQuantidade(val);
                                
                                compra=true;
                                
                                if(!arroz.desconto(arrozq.getQuantidade()))
                                {
                                    arrozq.setQuantidade(arrozq.getQuantidade()-val);
                                    
                                    compra=false;
                                }
                                
                                break;
                                
                            case 2:
                                
                                System.out.println("porfavor digite a quantidade");
                                val = scanner.nextInt();
                                
                                feijaoq.setQuantidade(val);
                                
                                compra=true;
                                
                                if(!feijao.desconto(feijaoq.getQuantidade()))
                                {
                                    arrozq.setQuantidade(feijaoq.getQuantidade()-val);
                                    
                                    compra=false;
                                }
                                
                                break;
                                
                            case 3:
                                
                                System.out.println("porfavor digite a quantidade");
                                val = scanner.nextInt();
                                
                                farinhaq.setQuantidade(val);
                                
                                compra=true;
                                
                                if(!farinha.desconto(farinhaq.getQuantidade()))
                                {
                                    farinhaq.setQuantidade(farinhaq.getQuantidade()-val);
                                    
                                    compra=false;
                                }
                                
                                break;
                                
                            case 4:
                                
                                System.out.println("porfavor digite a quantidade");
                                val = scanner.nextInt();
                                
                                leiteq.setQuantidade(val);
                                
                                compra=true;
                                
                                if(!leite.desconto(leiteq.getQuantidade()))
                                {
                                    leiteq.setQuantidade(leiteq.getQuantidade()-val);
                                    
                                    compra=false;
                                }
                                
                                break;
                                
                            case 0:
                                
                                System.out.println("voltando ao menu principal....");
                                
                                break;
                                
                            default:
                            
                                System.out.println("Opcao invalida");
                                
                                break;
                            
                        }
                       
                        
                    }while(op2!=0);
                    
                    break;
                    
                case 2:
                    
                    if(compra==true)
	                {
	                    double total = arroz.total(arrozq.getQuantidade()) + feijao.total(feijaoq.getQuantidade()) + farinha.total(farinhaq.getQuantidade()) + leite.total(leiteq.getQuantidade());
	                    
	                    System.out.println("o total foi de: "+total+" R$ "+" porfavor digite a forma de pagamento:");
                        val = scanner.nextInt();
                        
                        if(pedido.Pagar(val))
                        {
                            
                            
                            System.out.println(cliente.toString()+"\n"+"Forma de pagamento:"+pedido.getPagamento()+"\n"+"Valor total:"+total);
                        }
                        
	                }
	                
	                else
	                {
	                    
	                    System.out.println("Nenhuma compra encontrada!! por favor efetue uma compra antes de realizar o pagamento");
	                }
	                
	                break;
	                
	            default:
	                
	                System.out.println("opção invalida por favor selecione um opção valida");
	                
	                break;

            
            }

        }while(op!=0);
        
    }
}