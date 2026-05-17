/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculogui1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Admin
 */
public class JanelaEscolhas extends JFrame {
    JButton botao1, botao2, botao3, botao4, botao5;
    JLabel titulo;
    
   
    
    JanelaEscolhas () {
    super("Pagina escolhas");
    Container tela = getContentPane();
    setLayout(null);
    
    titulo = new JLabel("Calculadora em GUI");
    botao1 = new JButton("Somar");
    botao2 = new JButton ("Subtrair");
    botao3 = new JButton ("Multiplicar");
    botao4 = new JButton("Dividir");
    botao5 = new JButton("Raiz Quadrada");
    
    titulo.setBounds(790,60,300,30);
    botao1.setBounds(430,150,120,27);
    botao2.setBounds(630,150,120,27);
    botao3.setBounds(830,150,120,27);
    botao4.setBounds(1030,150,120,27);
    botao5.setBounds(1230,150,120,27);
    
    
    setVisible(true);
    
    tela.add(titulo);
    tela.add(botao1);
    tela.add(botao2);
    tela.add(botao3);
    tela.add(botao4);
    tela.add(botao5);
    
  // personificação
    
    tela.setBackground(new Color(65, 166, 212));
    /*botao1.setForeground(Color.white);
    botao2.setForeground(Color.white);
    botao3.setForeground(Color.white);
    botao4.setForeground(Color.white);
    botao5.setForeground(Color.white);
*/
   titulo.setForeground(Color.WHITE);
   titulo.setFont(new Font("minha fonte", Font.BOLD,26));
    
    
    botao1.addActionListener(new ActionListener () {
    
    public void actionPerformed(ActionEvent e ) {
        
    Soma app = new Soma();
    
    app.setVisible(true);
    
    }
    
   
    }
    );
    
     botao2.addActionListener(new ActionListener () {
     
     public void actionPerformed(ActionEvent e) {
         
         Subtrair app2 = new Subtrair ();
         
         app2.setVisible(true);
         
         
     }
     }
     );
    
    botao3.addActionListener(new ActionListener() {
    
    public void actionPerformed(ActionEvent e) {
    
    Multiplicação app3 = new Multiplicação();

    app3.setVisible(true);
    }
    }
   
    );
    
    botao4.addActionListener (new ActionListener() {
    
    public void actionPerformed (ActionEvent e ) {
    
           Dividir app4 = new Dividir();

           app4.setVisible(true);
    }
    }
    );
     
  
    
    
        botao5.addActionListener (new ActionListener() {
    
    public void actionPerformed (ActionEvent e ) {
    
    
                  RaizQuadrada appRaiz= new RaizQuadrada ();
appRaiz.setVisible(true);

           
    }
    }
    );
     

           
    
    
   
     setExtendedState(JFrame.MAXIMIZED_BOTH);
    
}

}
