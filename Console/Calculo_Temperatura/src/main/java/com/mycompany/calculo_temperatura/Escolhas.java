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
public class Escolhas { 
         Converta_F k1 = new Converta_F();
        Calculo_K k2 = new Calculo_K();
        Scanner scanner = new Scanner(System.in);      
        int e;
       
       
        void e_e () {            
        System.out.println("O que voce deseja calcular ?");
        System.out.println("De Fihrenheit para Celsius *digite-1*");
        System.out.println("De Kelvin para Celsius *digite-2*");
       int e = scanner.nextInt();
        if (e ==1 ) {
          k1.Inicio_C_F();
        System.out.println("O valor em celsius é : " + k1.c);
        
        }
        
        if (e ==2) {
                k2.Inicio_C_K();
        System.out.println("" + k2.c);
        } else {System.out.println("Valor não reconhecido");}
       
        }
        
        
}
