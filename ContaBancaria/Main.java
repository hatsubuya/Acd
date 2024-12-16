/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    ContaBancariaSimplificada[] contas = new ContaBancariaSimplificada[10];
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    int op = 12;
	    
	    int op2 = 12;
	    
	    int i=0;

        String nome;
        
        float saldo=0;
    
        int sp=0;
        
        boolean special=false;
        
        String buffer;
	 
	   
	    
		while (op != 0) {
		    
            System.out.println("menu de opcoes \n 1 - Abrir Conta Especial \n 2 - Abrir Conta Simples \n 3 - Depositar /n 4 - Retirar /n 5 - Adicionar Rendimentos /n 6 - Mostrar Dados da Conta /n 0 - Sair");
        
            op = scanner.nextInt();
            
            buffer = scanner.nextLine();
            
            switch (op) {
                
                case 1:
                    
                    System.out.println("Por favor digite o seu nome");
                    nome = scanner.nextLine();
                    
                    System.out.println("por favor digite o valor do deposito");
                    saldo = scanner.nextFloat();
                    
                    System.out.println("escolha uma opcoa: \n 1- conta especial \n 2 - conta comum ");
                    sp = scanner.nextInt();
                    
                    if(sp==1)
                    {
                        special = true;
                    }
                    
                    contas[i] = new ContaBancariaSimplificada("",0,false);
                    
                    contas[i].abreConta(nome,saldo,special);
                    
                    i++;
                    
                    break;
                    
                case 2:
                    
                    System.out.println("Por favor digite o seu nome");
                    nome = scanner.nextLine();
                    
                    contas[i] = new ContaBancariaSimplificada("",0,false);
                    
                    contas[i].abreContaSimples(nome);
                    
                    i++;
                    
                    break;
                    
                case 3:
                    
                    System.out.println("escolha uma das contas cadastradas para efetuar o deposito:");
                    
                    for(int j =0;j<i;j++)
                    {
                         System.out.print((j+1)+"-");
                    
                        contas[j].mostraDados();
                        
                    }
                    
                    System.out.println("sua escolha:");
                    op2 = scanner.nextInt();
            
                    buffer = scanner.nextLine();
                    
                    
                    System.out.println("total de saldo a depositar");
                    saldo = scanner.nextInt();
            
                    buffer = scanner.nextLine();
                    
                    
                    contas[op2-1].deposita(saldo);
                    
                    break;
                    
                case 4:
                    
                    System.out.println("escolha uma das contas cadastradas para efetuar o saque:");
                    
                    for(int j =0;j<i;j++)
                    {
                         System.out.print((j+1)+"-");
                    
                        contas[j].mostraDados();
                        
                    }
                    
                    System.out.println("sua escolha:");
                    op2 = scanner.nextInt();
            
                    buffer = scanner.nextLine();
                    
                    
                    System.out.println("total de saldo a ser sacado");
                    saldo = scanner.nextInt();
            
                    buffer = scanner.nextLine();
                    
                    contas[op2-1].retira(saldo);
                    
                    break;
                    
                case 5:
                    
                    System.out.println("escolha uma das contas cadastradas para efetuar o calculo de Rendimentos:");
                    
                    for(int j =0;j<i;j++)
                    {
                         System.out.print((j+1)+"-");
                    
                        contas[j].mostraDados();
                        
                    }
                    
                    System.out.println("sua escolha:");
                    op2 = scanner.nextInt();
            
                    buffer = scanner.nextLine();
                    
                    
                    contas[op2-1].adicionarRendimentos();
                    
                    break;
                    
                case 6:
                    
                    for(int j =0;j<i;j++)
                    {
                    
                        contas[j].mostraDados();
                    }
                    
                    break;
                    
                case 0:
                    
                    System.out.println("Saindo...");
                    
                    break;
                    
                default:
                
                    System.out.println("Opção inválida");
                    
                    break;
            }
        }
	}
}
