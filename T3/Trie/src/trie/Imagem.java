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

import javax.swing.ImageIcon;

import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.BorderLayout;

public class Imagem {
    
    private JFrame frame;
    
    public void abrirImagem(String caminhoDaImagem) {
        
        if (frame != null) {
            
            frame.dispose();
        }
        
        frame = new JFrame("Abrir Imagem");
        
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
        
        ImageIcon imagem = new ImageIcon(caminhoDaImagem);
        
        
        JLabel label = new JLabel(imagem);
        
        
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        
        frame.pack();
        
        
        frame.setVisible(true);
    }
}
