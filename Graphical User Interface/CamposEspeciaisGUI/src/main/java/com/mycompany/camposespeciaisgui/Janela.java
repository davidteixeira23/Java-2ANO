/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.camposespeciaisgui;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
import java.awt.image.*;
import javax.swing.border.*;
d 
/**
 *
 * @author David
 */
public class Janela extends JFrame{
  JLabel rotulonome,rotulotel, rotulocpf, rotulocep, rotulotitulo, exibirImagem;
  JFormattedTextField nome,tel,cpf,cep;
  MaskFormatter mascararnome,mascarartel,mascararcpf,mascararcep;
  ImageIcon icone1;
  JLabel imagem1;
  
  public Janela () {
  super ("Janela");
  Container tela = getContentPane();
  setLayout(null);
  
  rotulonome = new JLabel("Nome");
  rotulotel = new JLabel ("Telefone");
  rotulocpf = new JLabel ("CPF");
  rotulocep = new JLabel ("CEP");
  rotulotitulo = new JLabel ("Cadastro de cliente");
  // configuração de imagem 
  ImageIcon iconeOriginal = new ImageIcon("user.png");
  
  
  rotulotitulo.setBounds(160,40,250,20);
  // Fontes e bordas
rotulotitulo.setFont(new Font("minha fonte ",Font.BOLD,16));
Border bordaPreta = BorderFactory.createLineBorder(Color.BLACK,1);
Border distancia1 = BorderFactory.createEmptyBorder(20,50,20,50);
Border distancia2 = BorderFactory.createEmptyBorder(5,5,5,5);
rotulotitulo.setBorder(BorderFactory.createCompoundBorder(bordaPreta,distancia1));


// novo tamanho de imagem   
Image imagemOriginal = iconeOriginal.getImage() ;

Image imagemNova = imagemOriginal.getScaledInstance(40, 40, Image.SCALE_SMOOTH);

ImageIcon iconeGrande = new ImageIcon(imagemNova);

exibirImagem = new JLabel(iconeGrande);
exibirImagem.setBorder(BorderFactory.createCompoundBorder(bordaPreta,distancia2));
 exibirImagem.setBounds(35,125,70,70);
 rotulonome.setBounds(150,100,100,20);  
 rotulotel.setBounds(150,160,100,20);
 rotulocpf.setBounds(300,100,100,20);
 rotulocep.setBounds(300,160,100,20);

try {
   mascararnome = new MaskFormatter("********************************************");
   mascarartel = new MaskFormatter("###########");
   mascararcpf = new MaskFormatter ("###########");
   mascararcep = new MaskFormatter ("########");
   
   mascararnome.setPlaceholderCharacter('_');
   mascarartel.setPlaceholderCharacter('_');
   mascararcpf.setPlaceholderCharacter('_');
   mascararcep.setPlaceholderCharacter('_');

}
catch(ParseException excp ) {} 
 

nome = new JFormattedTextField(mascararnome);
tel = new JFormattedTextField(mascarartel);
cpf = new JFormattedTextField(mascararcpf);
cep = new JFormattedTextField(mascararcep);

nome.setBounds(150,120,125,23);
tel.setBounds(150,180,125,23);
cpf.setBounds(300,120,125,23);
cep.setBounds(300,180,125,23);

tela.add(rotulonome);
tela.add(rotulotel);
tela.add(rotulocpf);
tela.add(rotulocep);
tela.add(rotulotitulo);
tela.add(cep);
tela.add(tel);
tela.add(cpf);
tela.add(nome);
tela.add(exibirImagem);

setSize(560,350);
setVisible(true);





  }
  
    
    
    
    }
    
    
    
    
    
    
    

