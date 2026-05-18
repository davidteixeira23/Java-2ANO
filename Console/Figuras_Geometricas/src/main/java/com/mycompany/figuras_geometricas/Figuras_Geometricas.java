    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras_geometricas;
import java.util.Scanner;

/**
 *
 * @author Admin    
 */
public class Figuras_Geometricas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Quadrado calculo_q = new Quadrado ();
        Triangulo t = new Triangulo ();
        Circulo c = new Circulo ();
        int escolha;
        
        System.out.println("QUAL CALCULO VOCE DESEJA FAZER ?");
        System.out.println("Area de quadrado --DIGITE1");
        System.out.println("Area do triangulo --DIGITE2");
        System.out.println("Area do Circulo --DIGITE3"); 
        escolha =scanner.nextInt();
        
        if (escolha ==1) {
       
        System.out.println("Calculo do quadrado: " + calculo_q.calculo_quadrado ());
        }
        if (escolha ==2) {
        System.out.println("Calculo do triangulo: " + t.calculo_triangulo());
    }
       if (escolha ==3) {
        System.out.println("Calculo de area" + c.calculo_circulo());
       } else System.out.println("Valor não encontrado. ");
        
    }
}
