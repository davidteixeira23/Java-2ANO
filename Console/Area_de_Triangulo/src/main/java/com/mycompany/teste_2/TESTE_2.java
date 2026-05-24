/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste_2;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class TESTE_2 {
 // esta l
 // 1234567890
 // 1234567890
 // 1234567890
 // 1234567890
 
    public static void main(String[] args) {
    
       triangulo calc = new triangulo();
        
        String strA = JOptionPane.showInputDialog("digite a base");
        String strB = JOptionPane.showInputDialog("Digite a altura.");
        
        
        double catetoA = Double.parseDouble(strA);
        double catetoB = Double.parseDouble(strB);
        
        double resultado = calc.calculadoraHipotenusa(catetoA, catetoB);
        
        JOptionPane.showMessageDialog(null, String.format ("O resultado é ", + resultado), "resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
