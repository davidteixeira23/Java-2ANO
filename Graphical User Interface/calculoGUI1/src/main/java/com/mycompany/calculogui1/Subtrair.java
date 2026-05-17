
package com.mycompany.calculogui1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author David
 */
public class Subtrair extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton subtrair;
    
    public Subtrair (){
        super("subtração");
        Container tela = getContentPane();
        setLayout(null);
        
    rotulo1 = new JLabel("numero1");
    rotulo2 = new JLabel ("numero2");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    subtrair = new JButton("subtrair");
    
   rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
   texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
    exibir.setBounds(50,120,200,20); subtrair.setBounds(170,100,80,20);
  
    subtrair.addActionListener(
    new ActionListener() {
    public void actionPerformed(ActionEvent e) { 
     int numero1, numero2,resultado;
     resultado = 0;
     numero1 = Integer.parseInt(texto1.getText());
     numero2 = Integer.parseInt(texto2.getText());
     resultado = numero1 - numero2;
     exibir.setVisible(true);
     exibir.setText(" O resultado é " + resultado);
    }
    }
    );
    
    // Estilização 
    tela.setBackground(new Color(251, 14, 0));
    rotulo1.setForeground(Color.WHITE);
    rotulo2.setForeground(Color.WHITE);
    exibir.setForeground(Color.white);
    
    
    
    exibir.setVisible(false);
    setSize(450,200);
    setVisible(true);
    tela.add(rotulo1); tela.add(rotulo2);
    tela.add(texto1); tela.add(texto2);
    tela.add(exibir);
    tela.add(subtrair);
    
    
    
    }
    

    
    }
