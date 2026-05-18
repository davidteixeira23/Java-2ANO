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
public class Converta_F {
    Scanner scanner = new Scanner (System.in);
    double f;
    double c;
    
    
    double Inicio_C_F () {
    
    System.out.println("Digite o valor de Fehrenheit. ");
    f = scanner.nextDouble();
    
     return c = (f-32) / 1.8;
    
    
    }
}
