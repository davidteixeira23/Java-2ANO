/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pitagoras_v2;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class Calculo_Hipotenusa {
   Scanner scanner = new Scanner (System.in);
    
   double C1;
   double c2;
   double h;
   double soma_dos_quadrados;
   
   
   
   
   
    double Inicio_Hipotenusa () {
        
      System.out.println("digite o primeiro cateto");
       double c1 = scanner.nextDouble();
        
    System.out.println("digite o segundo cateto");
    double c2 = scanner.nextDouble();
    
    double soma_dos_quadrados = Math.pow(c1, 2) + Math.pow(c2, 2);
   return  h = Math.sqrt(soma_dos_quadrados);
  
    }  
}


