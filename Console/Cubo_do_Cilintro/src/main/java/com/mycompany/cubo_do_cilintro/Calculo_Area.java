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
public class Calculo_Area {
Scanner scanner = new Scanner(System.in);
double r;
double h;
double resultado;

double c () {
System.out.println("Digite o raio do cilindro");
r = scanner.nextDouble();

System.out.println("Digite o valor da altura");
h = scanner.nextDouble();

return resultado = (Math.PI*2*r*h);
}   
}
