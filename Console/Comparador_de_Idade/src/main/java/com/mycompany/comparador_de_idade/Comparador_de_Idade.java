/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparador_de_idade;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class Comparador_de_Idade {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite a primeira idade");
        int id_1 = scanner.nextInt();
        
        System.out.println("Digite a segunda idade");
        int id_2 = scanner.nextInt();
        
        if (id_2 ==id_1) {System.out.println("Ambos tem a mesma idade.  ");}
        else if (id_1 > id_2) { System.out.println("A primeira pessoa é mais velha");
        } else {System.out.println("A segunda pessoa é mais velha");}
        
     
        int idade1, idade2;
        String nome1, nome2;
        
        idade1=integer.parseInt(JOptionPane.showImputDialogInputDialog("Entre com a idade ::"));
        
        
        
        
        
    }
}
