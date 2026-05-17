/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculogui1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author David
 */
public class Soma extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar;
    
    public Soma (){
        super("SOMA");
        Container tela = getContentPane();
        setLayout(null);
        
    rotulo1 = new JLabel("NUMERO 1°");
    rotulo2 = new JLabel ("NUMERO 2°");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    somar = new JButton("Somar");
    
   rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
   texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
    exibir.setBounds(50,120,200,20); somar.setBounds(170,100,80,20);
  
    somar.addActionListener(
    new ActionListener() {
    public void actionPerformed(ActionEvent e) { 
     int numero1, numero2,soma;
     soma = 0;
     numero1 = Integer.parseInt(texto1.getText());
     numero2 = Integer.parseInt(texto2.getText());
     soma = numero1 + numero2;
     exibir.setVisible(true);
     exibir.setText(" a Soma é " + soma);
    }
    }
    );
    
    exibir.setVisible(false);
    setSize(450,200);
    setVisible(true);
    tela.add(rotulo1); tela.add(rotulo2);
    tela.add(texto1); tela.add(texto2);
    tela.add(exibir);
    tela.add(somar);
    
    // estilização
    
    tela.setBackground(new Color(66, 236, 126));
    
    
    }
    

    
    }
    
