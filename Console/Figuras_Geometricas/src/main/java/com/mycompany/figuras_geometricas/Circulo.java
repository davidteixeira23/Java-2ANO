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
public class Circulo {
   Scanner scanner = new Scanner(System.in);
    double raio;
    double pi = 3.14;
    
    double calculo_circulo () {
        
    System.out.println("Digite o raio: ");
     raio = scanner.nextDouble();
    return (raio*raio) * pi;
    }
        
    
    
}
