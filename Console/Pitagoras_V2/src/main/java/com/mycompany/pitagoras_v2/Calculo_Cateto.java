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
public class Calculo_Cateto {
    Scanner scanner = new Scanner(System.in);
    double c;
    double h;
    double numeros_quadrados;
    double resultado;
    
   double Inicio_Cateto () {
   System.out.println("digite o valor do cateto");
   c = scanner.nextDouble();
   
   System.out.println("Digite o valor da hipotenusa");
 h = scanner.nextDouble();
   
  numeros_quadrados = Math.pow(h, 2) - Math.pow(c,2);
   
  return resultado = Math.sqrt(numeros_quadrados);
  
   }
   
  
    
    
    
}
