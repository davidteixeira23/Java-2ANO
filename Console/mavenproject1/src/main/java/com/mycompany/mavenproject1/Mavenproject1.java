/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class Mavenproject1 {

    public static void main(String[] args) {
//        declarações devariaveis
        int t;
        digite();
        String p ;
        p = JOptionPane.showInputDialog("Digite um palavra");
       t =tamanho(p);
       JOptionPane.showMessageDialog(null,  p+ "possui " +t+ "caracteres");
//       fechamento do metodo main
    }
    
//    conta os caracteres
       static void digite()
       {
        JOptionPane.showMessageDialog(null, "digite uma palavra");
    }
            static int tamanho (String X)
            {
                return X.length();
                        
       
    }
}
