/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculo_temperatura;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Calculo_K {
    Scanner scanner = new Scanner (System.in);
    double k;
    double c;
    
    double Inicio_C_K () {
    System.out.println("Digite o valor de Kelvin");
    k = scanner.nextDouble();
        
   return c = k-273.15;
    
    }
    
    
    
}
