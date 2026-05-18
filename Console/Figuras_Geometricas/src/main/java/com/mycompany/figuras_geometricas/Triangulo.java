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
public class Triangulo {
    Scanner scanner = new Scanner(System.in);
   double base;
   double altura;
   
   double calculo_triangulo () {
   System.out.println("Digite a base do triangulo: ");
   base = scanner.nextDouble();
   
   System.out.println("Digite o valor da altura: ");
   altura = scanner.nextDouble();
   
   return (base*altura) / 2 ;
   
   }
   
   
    
}
