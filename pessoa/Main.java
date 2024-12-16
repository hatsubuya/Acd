/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
        ArrayList<Pessoa> comunidade = new ArrayList<>();
        
        int op;
        
        String cpf;
        
        String nome;
        
        String matricula;
        
        double salario;

        do{
            System.out.println("Menu:");
            System.out.println("1.Cadastrar Aluno");
            System.out.println("2.Cadastrar Docente");
            System.out.println("3.Cadastrar Pessoa");
            System.out.println("4.Listar membros cadastrados");
            System.out.println("5.Sair");
            
            System.out.print("Sua escolha: ");
            op = scanner.nextInt();
            
            scanner.nextLine();

            switch (op) {
                
                case 1:
                    
                    System.out.print("digite o nome: ");
                    nome = scanner.nextLine();
                    
                    System.out.print("digite o cpf ");
                    cpf = scanner.nextLine();
                    
                    System.out.print("Matrícula do Aluno: ");
                    matricula = scanner.nextLine();
                    
                    comunidade.add(new Aluno(nome, cpf, matricula));
                    break;

                case 2:
                    
                    System.out.print("digite o nome: ");
                    nome = scanner.nextLine();
                    
                    System.out.print("digite o cpf: ");
                    cpf = scanner.nextLine();
                    
                    System.out.print("Salário do Docente: ");
                    salario = scanner.nextDouble();
                    
                    scanner.nextLine();
                    
                    System.out.print("NIdI do Docente: ");
                    matricula = scanner.nextLine();
                    
                    comunidade.add(new Docente(nome, cpf, salario, matricula));
                    
                    break;

                case 3:
                    
                    System.out.print("Nome da Pessoa: ");
                    nome = scanner.nextLine();
                    
                    System.out.print("CPF da Pessoa: ");
                    cpf = scanner.nextLine();
                    
                    comunidade.add(new Pessoa(nome, cpf));
                    
                    break;

                case 4:
                    
                    Collections.sort(comunidade);
                    
                    System.out.println("cadastrados:");
                    
                    for (Pessoa pessoa : comunidade) {
                        
                        System.out.println(pessoa);
                    }
                    
                    break;

                case 5:
                    
                    System.out.println("Saindo...");
                    
                    scanner.close();
                    
                    return;

                default:
                
                    System.out.println("Opção inválida. Tente novamente.");
                    
            }
            
        }while(op!=5);
	}
}
