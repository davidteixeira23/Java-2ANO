/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scroll;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class Janela extends JFrame{
    JList lista;
    String cidades[] = {"São Paulo", "Moscow","New York","Xanga","London"};
    JButton exibir;
    JLabel texto;
    
    public Janela () {
    super("Exemplo de Lista");
    Container tela = getContentPane();
    setLayout(null);
    exibir = new JButton("exibir");
    texto = new JLabel("");
    lista = new JList (cidades);
    lista.setVisibleRowCount(5);
    JScrollPane painelRolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    painelRolagem.setBounds(40,50,150,100);
    exibir.setBounds(270,50,100,30);
    texto.setBounds(50,150,200,30);
    exibir.addActionListener( 
        new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        texto.setText("o estado é " + lista.getSelectedValue().toString());
        
        
        } 
    }
                );
    
    tela.add(painelRolagem);
    tela.add(exibir);
    tela.add(texto);
    setSize(400,250);
    setVisible(true);
    
    
    }
    
    
    
    
    
    
    
    
    
}
