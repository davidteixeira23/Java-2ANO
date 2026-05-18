/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_teste1;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Projeto_teste1 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        Triangulo triangulo = new Triangulo();
        
       triangulo.base();
      double Base = scanner.nextInt();
        
        triangulo.altura();
    double Altura = scanner.nextInt();
        
        double a1 = Base*Base;
        double a2 = Altura*Altura;
        
        double a3 = a1+a2;
        
        double RF = Math.sqrt(a3);
        
        System.out.println("O resultado é " + RF);
        
        
    }
}
