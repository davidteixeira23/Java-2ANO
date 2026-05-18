/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cubo_do_cilintro;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Calculo_Metro_Profundidade {
    Scanner scanner = new Scanner(System.in);
    double r;
    double h;
    double result;
    
    double volume() {
    System.out.println("Digite o valor do raio");
    r = scanner.nextDouble();
    
    System.out.println("Digite o valor da altura");
    h = scanner.nextDouble();
   return result = (Math.PI*Math.pow(r, 2)*h  );     
    }
    
}
