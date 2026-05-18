/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras_geometricas;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Quadrado {
    Scanner scanner = new Scanner(System.in);
    double base;
    double altura;
    
    
    double calculo_quadrado () {
    System.out.println("digite o valor da altura");
     altura= scanner.nextDouble();
     
     System.out.println(" digite o valor da base");
      base = scanner.nextDouble();      
         return  base*altura;
    }
    
   
   
    
    
    
    
    
}
