/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        ArrayList<Livro> livros = new ArrayList<>();
        
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        
        Data data = new Data(0,0,0);
        
        int[] dd = new int[3];
        
        String titulo;
        
        String autor;
        
        String nome;
        
        String email;
        
        int i=1;

        int op;
        
        int liv =0;
        
        int pes = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1.Novo Empréstimo");
            System.out.println("2.imprimir Empréstimo");
            System.out.println("3.Novo Livro");
            System.out.println("4.Nova Pessoa");
            System.out.println("5.Visualizar/imprimir todos os empréstimos");
            System.out.println("0.Sair do Programa");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            
            scanner.nextLine();

            switch (op) {
                
                case 1:
                    
                     if (pessoas.isEmpty()||livros.isEmpty()) {
                         
                        System.out.println("não ha pessoas ou livros cadastrados ainda");
                    }
                    
                    else{
                        
                        System.out.println("Pessoas cadastradas:");
                        
                            for (int k = 0; k < pessoas.size(); k++) {
                                
                            System.out.println((k) + ": " + pessoas.get(k));
                        }
                        
                        System.out.print("escolha o numero da opcao desejada: ");
                        pes = scanner.nextInt();
                        
                
                        
                        System.out.println("Livros cadastrados:");
                        
                        for (int k = 0; k < livros.size(); k++) {
                            
                            System.out.println((k) + ": " + livros.get(k));
                        }
                        
                        System.out.print("escolha o numero da opcao desejada: ");
                        liv = scanner.nextInt();
                        
                        
                        System.out.print("digite o dia: ");
                        dd[0] = scanner.nextInt(); 
                        
                        System.out.print("digite o mes: ");
                        dd[1] = scanner.nextInt(); 
                        
                        System.out.print("digite o ano: ");
                        dd[2] = scanner.nextInt();
                        
                        data.setDia(dd[0]);
                        
                        data.setMes(dd[1]);
                         
                        data.setAno(dd[2]);
                        
                        
                        emprestimos.add(new Emprestimo(pessoas.get(pes),livros.get(liv),data));
                        
                        
                    }
                    
                   
                    
                    break;
                    
                case 2:
                    
                    if (!emprestimos.isEmpty()) {
                        
                        Emprestimo primeiroEmprestimo = emprestimos.get(0);  
                        System.out.println("Pessoa: " + primeiroEmprestimo.getPessoa());
                        System.out.println("Livro: " + primeiroEmprestimo.getLivro());
                        System.out.println("Data: " + primeiroEmprestimo.getData());
                        }
                        else {
                        System.out.println("nehum empréstimos registrado.");
                        }
                    
                    break;
                    
                case 3:
                    
                    System.out.print("Digite o nome do livro");
                    titulo = scanner.nextLine();
                    
                    System.out.print("Digite o nome do autor");
                    autor = scanner.nextLine();
                    
                    
                    livros.add(new Livro(titulo, autor));
                    
                    break;
                
                case 4:
                    
                    System.out.print("Digite o nome da pessoa");
                    nome = scanner.nextLine();
                    
                    System.out.print("Digite o email da pessoa");
                    email = scanner.nextLine();
                    
                    
                    pessoas.add(new Pessoa(nome, email));
                    
                    break;
                    
                case 5:
                    
                    for (Emprestimo emprestimo : emprestimos) {
                        
                        System.out.println(emprestimo);
                        
                        i++;
                    }
                    
                    break;
                    
                    
                case 0:
                    
                    System.out.println("Saindo...");
                    
                    break;
                    
                    
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);
	}
}
