/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decreasingdigitnumbermetodo;
import javax.swing.*;
/**
 *
 * @author David
 */
public class Janela {
    private float n1;
    private float n2;
    
    public float getn1() {
    return this.n1;
    }
    public float getn2() {
    return this.n2;
    }
    
    public float n1Ent() {
    return this.n1 = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor de X ? :")) ;
    }
    
    public float n2Ent() {
    return this.n2 = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor de Y ? : "));
    }
      
     public void comparacao() {

         if (this.n1 > this.n2) {
         JOptionPane.showMessageDialog(null,"O valor de X é Maior que o valor de Y");
         }else if (this.n1 < this.n2) {
         JOptionPane.showMessageDialog(null,"O valor de X é menor que o valor de Y");
         } else {
                  JOptionPane.showMessageDialog(null,"Os valores são iguais");

         }                    
     }    
     }    
