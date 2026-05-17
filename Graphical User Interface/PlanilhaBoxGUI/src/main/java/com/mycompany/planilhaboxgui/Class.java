/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planilhaboxgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author David
 */
public class Class extends JFrame {
    
    JComboBox lista;
    String planetas[] ={"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno"};
    JButton exibir;
    JLabel rotulo;
    
    public Class () {
    super("Planilha com COMBOBOX");
    Container tela = getContentPane();
    setLayout(null);
    exibir = new JButton("Exibir");
    rotulo = new JLabel("");
    lista = new JComboBox (planetas);
    lista.setMaximumRowCount(5);
    lista.setBounds(50,50,150,30);
    rotulo.setBounds(50,150,200,30);
    exibir.addActionListener(        
    new ActionListener() {
        public void actionPerformed(ActionEvent e){
     rotulo.setText("o estado é " + lista.getSelectedItem().toString());    
    }
    
    }
    );
    tela.add(lista);
    tela.add(exibir);
    tela.add(rotulo);
    setSize(400,250);
    setVisible(true);
    
    
    
    
    }
}
