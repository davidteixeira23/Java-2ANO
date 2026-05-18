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
public class Escolhas {
    Calculo_Hipotenusa k1 = new Calculo_Hipotenusa();
            Calculo_Cateto k2 = new Calculo_Cateto();
    Scanner scanner = new Scanner(System.in);
    int e;
    
    int Inicio_Escolha () {
    System.out.println("Voce deseja calcular o valor da hipotenusa ou do cateto ? ");
    System.out.println("Hipotenusa *Digite-1*");
  
    System.out.println("Cateto *Digite-2*");
       e =scanner.nextInt();
    
    if (e ==1) {
    k1.Inicio_Hipotenusa();
    System.out.println("O valor da hipotenusa é : " + k1.h);
    }
    
    if (e ==2){
    k2.Inicio_Cateto();  
    
    System.out.println("O valor do cateto é : " + k2.resultado);
    } else {System.out.println("Valor não encontrado");}
    
    return e;
    }
    
}
