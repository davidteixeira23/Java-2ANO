/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scrollarraygui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author David
 */
public class Janela extends JFrame {
    JList lista;
    String cidades[] = {"Sevastopol", "Estolcomo", "Berlim", "Varsovia", "Kaliningrad", "Belgrado"};
    JButton exibir;
    
    Janela () {
    super("Lista com array");
    Container tela = getContentPane();
    setLayout(null);
    exibir = new JButton ("Exibir cidade");
    lista = new JList (cidades);
    lista.setVisibleRowCount(5);
    JScrollPane painelRolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    painelRolagem.setBounds(40,50,150,100);
    exibir.setBounds(270,50,140,30);
    exibir.addActionListener( 
    new ActionListener() { 
    public void actionPerformed(ActionEvent e ) {
    Object selecionados[] = lista.getSelectedValues();
    String resultados = "Valores selecionados:\n"; 
    for (int i=0;i <selecionados.length; i++ ) 
      resultados += selecionados[i].toString()+"\n";
     JOptionPane.showMessageDialog(null,resultados);
     
     
     
    }});
     
    tela.add(painelRolagem);
    tela.add(exibir);
    setSize(400,250);
    setVisible(true);
    
    
    
    
    }
    
    
    
    
    
    }
    
    
    
    
    
    

