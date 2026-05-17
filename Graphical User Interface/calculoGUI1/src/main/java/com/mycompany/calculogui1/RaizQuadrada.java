
package com.mycompany.calculogui1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author David
 */
public class RaizQuadrada extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton raiz;
    double Raiz;
    
    public RaizQuadrada (){
        super("Raiz Quadrada");
        Container tela = getContentPane();
        setLayout(null);
        
    rotulo1 = new JLabel("numero1");
    rotulo2 = new JLabel ("numero2");
    texto1 = new JTextField(5);
    texto2 = new JTextField(5);
    exibir = new JLabel("");
    raiz = new JButton("Calcular raiz");
    
   rotulo1.setBounds(50,20,100,20);
   texto1.setBounds(120,20,200,20);
    exibir.setBounds(50,120,200,20); raiz.setBounds(150,100,130,20);
  
    raiz.addActionListener(
    new ActionListener() {
    public void actionPerformed(ActionEvent e) { 
     int numero1;
     numero1 = Integer.parseInt(texto1.getText());
     Raiz = Math.sqrt(numero1);
     exibir.setVisible(true);
     exibir.setText("a Raiz é " + Raiz);
     
    }
    }
    );
    
    // estilo 
    tela.setBackground(new Color (176,196,222));
    
    exibir.setVisible(false);
    setSize(450,200);
    setVisible(true);
    tela.add(rotulo1); tela.add(rotulo2);
    tela.add(texto1); tela.add(texto2);
    tela.add(exibir);
    tela.add(raiz);
    
    
    }
    

    
    }
