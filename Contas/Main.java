/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
        List<ContaBancaria> contas = new ArrayList<>();
        
        int op;
        
        int numContaCorrente;
        
        int numEmprestimo;
        
        int numContaRentavel;
        
        int numContaEspecial;
        
        int numBusca;
        
        int numTaxa;
        
        int numJuros;
        
        int numDebito;
        
        int numDeposito;
        
        double valorDeposito;

        do {
            System.out.println("Menu:");
            System.out.println("1.Nova Conta Corrente");
            System.out.println("2.Nova Conta Rentável");
            System.out.println("3.Nova Conta Especial");
            System.out.println("4.Depositar");
            System.out.println("5.Debitar");
            System.out.println("6.Creditar Juros");
            System.out.println("7.Debitar Taxa");
            System.out.println("8.Buscar Conta");
            System.out.println("9.Listar Todas as Contas");
            System.out.println("10.Valor para o Financiamento");
            System.out.println("0.Sair");
            
            System.out.print("sua escolha: ");
            op = scanner.nextInt();

            switch (op) {
                
                case 1:
                    
                    System.out.print("digite o numero da conta: ");
                    numContaCorrente = scanner.nextInt();
                    
                    ContaBancaria contaCorrente = new ContaCorrente();
                    
                    contaCorrente.setNumConta(numContaCorrente);
                    
                    contas.add(contaCorrente);
                    
                    break;
                    
                case 2:
                    
                    System.out.print("digite o numero da conta: ");
                    numContaRentavel = scanner.nextInt();
                    
                    ContaBancaria contaRentavel = new ContaRentavel();
                    
                    contaRentavel.setNumConta(numContaRentavel);
                    
                    contas.add(contaRentavel);
   
                    break;
                    
                case 3:
                    
                    System.out.print("digite o numero da conta: ");
                    numContaEspecial = scanner.nextInt();
                    
                    ContaBancaria contaEspecial = new ContaEspecial();
                    
                    contaEspecial.setNumConta(numContaEspecial);
                    
                    contas.add(contaEspecial);
                    
                    break;
                    
                case 4:
                    
                    System.out.print("Digite o número da conta para depósito: ");
                    numDeposito = scanner.nextInt();
                    
                    System.out.print("Digite o valor a ser depositado: ");
                    valorDeposito = scanner.nextDouble();
                    
                    for (ContaBancaria c : contas) {
                        
                        if (c.retornaNumConta() == numDeposito) {
                            
                            c.deposita(valorDeposito);
                            
                            System.out.println("Depósito realizado com sucesso!");
                            
                            break;
                        }
                        
                    }
                    
                    break;
                    
                case 5:
                    
                    System.out.print("Digite o número da conta para débito: ");
                    numDebito = scanner.nextInt();
                    
                    for (ContaBancaria c : contas) {
                        
                        if (c.retornaNumConta() == numDebito) {
                            
                            c.debitaTaxa();
                            
                            System.out.println("Taxa debitada com sucesso!");
                            
                            break;
                        }
                    }
                    break;
                    
                case 6:
                    
                    System.out.print("Digite o número da conta para creditar juros: ");
                    numJuros = scanner.nextInt();
                    
                    for (ContaBancaria c : contas) {
                        
                        if (c.retornaNumConta() == numJuros) {
                            
                            c.creditaJuros();
                           
                            break;
                        }
                    }
                    
                    break;
                    
                case 7:
                    
                    System.out.print("digite o numero da conta: ");
                    numTaxa = scanner.nextInt();
                    
                    for (ContaBancaria c : contas) {
                        
                        if (c.retornaNumConta() == numTaxa) {
                            
                            c.debitaTaxa();
                            
                            break;
                        }
                    }
                    
                    break;
                    
                case 8:
                    
                    System.out.print("digite o numero da conta: ");
                    numBusca = scanner.nextInt();
                    
                    for (ContaBancaria c : contas) {
                        
                        if (c.retornaNumConta() == numBusca) {
                            
                            System.out.println(c.toString());
                            
                            break;
                        }
                    }
                    
                    break;
                    
                case 9:
                    
                    System.out.println("litando todas as contas:");
                    
                    for (ContaBancaria c : contas) {
                        
                        System.out.println(c.toString());
                        
                    }
                    break;
                    
                case 10:
                    
                    System.out.print("digite o numero da conta: ");
                    numEmprestimo = scanner.nextInt();
                    
                    for (ContaBancaria c : contas) {
                        
                        if (c.retornaNumConta() == numEmprestimo) {
                            
                            System.out.println("valor do emprestimo: " + c.valorEmprestimo());
                            
                            break;
                            
                        }
                    }
                    
                    break;
                    
                case 0:
                    
                    System.out.println("Saindo...");
                    
                    break;
                    
                default:
                
                    System.out.println("opcao invalida");
            }
            
        } while (op != 0);
   
	}
}
