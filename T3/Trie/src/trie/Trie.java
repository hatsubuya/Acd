/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

/**
 *
 * @author sandr
 */
import java.io.*;

import java.util.*;

import javax.swing.*;

import java.awt.BorderLayout;

import java.awt.event.*;

import javax.swing.JList;               
import javax.swing.ListSelectionModel;  
import javax.swing.event.ListSelectionListener;  
import javax.swing.event.ListSelectionEvent;     
import java.awt.event.KeyListener;      
import java.awt.event.KeyAdapter;        
import java.util.List;

import java.awt.Color;

import java.awt.Dimension;

public class Trie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arv arv = new Arv();
        
        //String caminhoArquivo = "C:\\Users\\sandr\\Desktop\\t2\\Trie\\src\\trie\\word.txt";
        
        String caminhoArquivo = "src/trie/Recursos/word.txt";
        
        String Search = "";
        
        Scanner scanner = new Scanner(System.in);
        
        List<String> words = new ArrayList<>();
        
        JFrame janela = new JFrame("Busca");
        
        JTextField entrada = new JTextField();
        
        JList<String> completar = new JList<>();
        
        JPanel painel = new JPanel();
        
        Imagem view = new Imagem();
        
        
        
        int op =0;
        
        
        
        do{
            
            System.out.println("escolha uma das seguintes oções:\n 1- Carregar dados \n 2-Buscar stand \n 3-inserir stand \n 4-deletar stand \n 5-sair \n sua escolha: ");
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op)
            {
            case 1:
        
            
        
                try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) 
                {
                    String line;
            
                    while ((line = br.readLine()) != null) 
                    {
                
                        words.add(line);
                
                    }
            
                } 
        
                catch (IOException e) 
                {
            
                    System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        
                }
        
        
                System.out.println("Stands armazenados:");
        
                for (String word : words) 
                {
            
            
                    System.out.println(word+"(carregado com sucesso)");
            
                    arv.inserir(word);
        
                }
                
                break;
       
            case 2:
                
                janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                janela.setSize(400, 200);
                
                entrada.setPreferredSize(new Dimension(300, 30));
                
                completar.setVisibleRowCount(5);
                completar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                completar.setFixedCellWidth(300);
       
                painel.setLayout(new BorderLayout());
                painel.add(entrada, BorderLayout.NORTH);
                painel.add(new JScrollPane(completar), BorderLayout.CENTER);
                
                completar.addListSelectionListener(new ListSelectionListener() 
                {
                    @Override
                    public void valueChanged(ListSelectionEvent e) 
                    {
                        if (!e.getValueIsAdjusting()) 
                        {
                            
                            String itemSelecionado = completar.getSelectedValue();
                            
                            if (itemSelecionado != null && !itemSelecionado.isEmpty()){
                                
                                String caminho = "src/trie/Recursos/" + itemSelecionado + ".jpeg";
                
                                view.abrirImagem(caminho);
                        }
                            
                        }
                    }
                });
                
            
                entrada.addKeyListener(new KeyAdapter() {
                
                @Override
                public void keyReleased(KeyEvent e) {
                
                    String prefixo = entrada.getText();
                
                    if (!prefixo.isEmpty()) {
                    
                        List<String> sugestoes = arv.sugerir(prefixo);
                    
                        completar.setListData(sugestoes.toArray(new String[0]));
                    }
                
                    else {
                    
                        completar.setListData(new String[0]);
                
                        }
                    }
                });

                janela.add(painel);
                
                janela.setVisible(true);
                
                
                break;
                
            case 3:
                
                
                
                
                System.out.println("qual Stand que voce deseja armazenar?");
                Search = scanner.nextLine();
                
                arv.inserir(Search);
               
                
                
                break;
                
            case 4:
                
                System.out.println("qual Stand que voce deseja Deletar?");
                Search = scanner.nextLine();
                
                arv.Deletar(Search);
                
                break;
                
            default:
                System.out.println("opcao invalida");
                
                break;
            }
        }while(op!=5);
    }
    
}
