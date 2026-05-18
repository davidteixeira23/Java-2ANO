/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhajanela;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Admin
 */
public class janela extends JFrame{
    
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
    public janela() {
    super("Exemplo com Label");
    Container tela = getContentPane();  
    setLayout(null);
    rotulo1 = new JLabel ("nome");    
    rotulo2 = new JLabel ("idade");
    rotulo3 = new JLabel ("Celular");
    rotulo4 = new JLabel ("Telefone");
    
    rotulo1.setBounds(50,20,80,20);
    rotulo2.setBounds(50,60,80,20);
    rotulo3.setBounds(50,100,80,20);
    rotulo4.setBounds(50,140,80,20);
    
    rotulo1.setForeground(Color.red);
    rotulo2.setForeground(Color.blue);
    rotulo3. setForeground(new Color(190,152, 142));
    rotulo4.setForeground (new Color (201,200,100));
    
    rotulo1.setFont(new Font("Arial",Font.BOLD,14));
    rotulo2.setFont(new Font ("Arial",Font.BOLD,14));
    
    tela.add(rotulo1);
    tela.add(rotulo2);
    tela.add(rotulo3);
    tela.add(rotulo4);
    setVisible(true);
    setSize(600,300);
    setLocationRelativeTo(null); 
    }
    
    
    
    
    
    
    
    
}

    
    
    
 
