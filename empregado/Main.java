import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Empregado empregadoAssalariado = new Assalariado("João", "1234", 3000.0);
        
        Empregado empregadoHorista = new Horista("Maria", "5678", 15.0);

        int op = 0;
        
        int paga;
        
        double salario;
        
        double valorHora;
        
        String nomeHorista;
        
        
        do{
            System.out.println("Menu:");
            System.out.println("1.Cadastrar Horista");
            System.out.println("2.Cadastrar Assalariado");
            System.out.println("3.Realizar Autenticacao");
            System.out.println("4.Ver Pagamento");
            System.out.println("5.Sair");
            System.out.print("sua escolha");
            
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    
                    System.out.print("digite o nome: ");
                    nomeHorista = scanner.next();
                    
                    System.out.print("digite a senha: ");
                    String senhaHorista = scanner.next();
                    
                    System.out.print("Digite o valor da hora: ");
                    valorHora = scanner.nextDouble();
                    
                    Horista horista = new Horista(nomeHorista, senhaHorista, valorHora);
                   
                    break;
                }
                
                case 2: {
                    
                    System.out.print("Digite o nome do Assalariado: ");
                    String nomeAssalariado = scanner.next();
                    
                    System.out.print("Digite a senha: ");
                    String senhaAssalariado = scanner.next();
                    
                    System.out.print("Digite o salário: ");
                    salario = scanner.nextDouble();
                    
                    Assalariado assalariado = new Assalariado(nomeAssalariado, senhaAssalariado, salario);
            
                    break;
                }
                case 3: {
                    
                
                    System.out.print("Digite o nome para autenticação: ");
                    String nomeAutenticar = scanner.next();
                    
                    System.out.print("Digite a senha: ");
                    String senhaAutenticar = scanner.next();
                    
                    
                    if (empregadoAssalariado.getNome().equals(nomeAutenticar) && empregadoAssalariado.getSenha().equals(senhaAutenticar)) {
                        
                        System.out.println("Autenticação bem-sucedida para " + nomeAutenticar);
                        
                    }
                    
                    else if (empregadoHorista.getNome().equals(nomeAutenticar) && empregadoHorista.getSenha().equals(senhaAutenticar)) {
                        
                        System.out.println("Autenticação bem-sucedida para " + nomeAutenticar);
                        
                    }
                    
                    else {
                        
                        System.out.println("nao autenticado");
                    }
                    
                    break;
                }
                
                case 4: {
                    
                    System.out.println("1. Ver pagamento de Horista \n 2. Ver pagamento de Assalariado \n Escolha uma opção: ");
                    
                    paga = scanner.nextInt();
                    
                    switch (paga) {
                        
                        case 1:
                            
                            System.out.println("pagamento do horista: " + empregadoHorista.valorPagto());
                            
                            break;
                            
                        case 2:
                            
                            System.out.println("pagamento do assalariado: " + empregadoAssalariado.valorPagto());
                            
                            break;
                            
                        default:
                        
                            System.out.println("opcao invalida");
                    }
                    
                    break;
                }
                
                case 5:
                    
                    System.out.println("Saindo...");
                    
                    break;
                    
                default:
                
                    System.out.println("opcao invalida");
            }
        } while (op != 5);

        
    }
}