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
public class Escolhas {
Scanner scanner = new Scanner(System.in);
Calculo_Area k1 = new Calculo_Area();
Calculo_Metro_Profundidade k2 = new Calculo_Metro_Profundidade();

int e;

void escolhas () {
System.out.println("Calculo da area lateralDigite-1");
System.out.println("Calculo do volume digite-2");
e = scanner.nextInt();

if ( e ==1) {
k1.c();
System.out.println("O resultado " +k1.resultado);

}

if (e ==2) {
k2.volume();
    System.out.println("O resultado" + k2.result);
}else {
System.out.println("Valor incompativel");
}

}

    
    
}
