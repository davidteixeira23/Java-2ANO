/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formulariomultiselecaogui;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author David
 */
public class Janela extends JFrame{
    JList lista;
    
    String paises[] = {"Brasil","Japão", "Alemanha", "Russia", "Tailandia", "Cuba", "Africa do sul", "India"}; // cria minha colula
    
    JButton exibir;
    
    public Janela (){
    super ("Formulario de multiplas escolhas em java");
    Container tela = getContentPane();
    setLayout(null);
    setLocationRelativeTo(null); // adiciona a janela ao centro da tela
    exibir = new JButton("Exibir");
    lista = new JList(paises);
    lista.setVisibleRowCount(5); // o scroll será visivel acima de elementos na coluna
    JScrollPane painelRolagem = new JScrollPane(lista);
    lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //deixa a lista com multiplas escolhas para selecionar
    painelRolagem.setBounds(40,50,150,100);
    exibir.setBounds(270,50,100,30);
    exibir.addActionListener ( // atribui um metodo para o botão 
    new ActionListener(){
    public void actionPerformed(ActionEvent e ) { 
    Object selecionados[] = lista.getSelectedValues();
    String resultado = "Valores selecionados\n";
    for (int i =0; i<selecionados.length; i++)
    resultado +=selecionados[i].toString()+"\n";
    JOptionPane.showMessageDialog(null,resultado); //pop-up mostrando todos os elementos que você selecionou. 
    
            }
    }
    );
    
    // adiciona os objetos a janela
    tela.add(painelRolagem);
    tela.add(exibir);
    setSize(400,250);
    setVisible(true);
    
    
    }
   
    
    
    
} 
