/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sandr
 */
public class Arv 
{
    private Node Raiz;
    
    private static class Node 
    {
        
        private Node[] letras;
        
        private boolean fim;

 
        public Node() 
        {
            this.letras = new Node[256];
            this.fim = false;
        }
    }
    
    public Arv() 
    {
        Raiz = new Node();
    }
    
    
    public void inserir(String palavra) 
    {
        Node atual = Raiz;
        
        for (char c : palavra.toCharArray()) 
        {
            int i = (int)c;
            
            if (atual.letras[i] == null) 
            {
                atual.letras[i] = new Node();
            }
            
            atual = atual.letras[i];
        }
        
        atual.fim = true;
        
    }
    
    
    
    public boolean buscar(String word) 
    {
        Node atual = Raiz;
        for (char c : word.toCharArray()) 
        {
            int i = (int)c;
            
            if (atual.letras[i] == null) 
            {
                
                return false;
                
            }
            
            atual = atual.letras[i];
        }
        return atual.fim;
    }
    
    
    
    
    public boolean Deletar(String palavra) 
    {
    
        Node atual = Raiz;
   
        for (char c : palavra.toCharArray()) 
        {
            int i = (int) c;
        
            if (atual.letras[i] == null) 
            {
                return false;
            }
        
            atual = atual.letras[i];
        }
    
 
        if (!atual.fim) 
        {
            return false;
        }

        atual.fim = false;
    
        for (int i = palavra.length() - 1; i >= 0; i--) 
        {
            int idx = (int) palavra.charAt(i);
        
            boolean podeDeletar = true;
            
            for (Node n : atual.letras) 
            {
                
            if (n != null) {
                
                podeDeletar = false;
                
                break;
            }
        }
        
        
        if (podeDeletar) {
            atual.letras[idx] = null;
        }
        
        atual = Raiz;
        
        for (int j = 0; j < i; j++) {
            
            int charIdx = (int) palavra.charAt(j);
            
            atual = atual.letras[charIdx];
        }
    }

    System.out.println("deletado com sucesso");
        
    return true;
}
    
     public List<String> sugerir(String prefixo) {
         
        Node atual = Raiz;
        
        List<String> sugestoes = new ArrayList<>();
        

        for (char c : prefixo.toCharArray()) {
            int i = (int)c;
            if (atual.letras[i] == null)
            {
                return sugestoes;
            }
            
            atual = atual.letras[i];
        }

        
        sugerirRecursivo(atual, prefixo, sugestoes);
        
        return sugestoes;
    }

    
    private void sugerirRecursivo(Node nodo, String prefixo, List<String> sugestoes) {
        
        if (nodo.fim) 
        {
            
            sugestoes.add(prefixo);
            
        }

        for (char i = 0; i <= 255; i++) 
        {
            Node proximo = nodo.letras[i];
            
            if (proximo != null) 
            {
                
                sugerirRecursivo(proximo, prefixo + i, sugestoes);
                
            }
        }
    }
    
}
