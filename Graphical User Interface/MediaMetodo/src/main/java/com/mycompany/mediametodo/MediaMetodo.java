/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediametodo;
import javax.swing.*;
/**
 *
 * @author David
 */
public class MediaMetodo {

    public static void main(String[] args) {
        
        // 1. Criamos o objeto "app1" a partir da classe Calcular
        Calcular app1 = new Calcular();
        
        // 2. Chamamos os métodos na ordem em que as telas devem aparecer:
        app1.lerNome();          // Abre a tela para digitar o nome
        app1.lerNotaA();         // Abre a tela para digitar a nota 1
        app1.lerNotaB();         // Abre a tela para digitar a nota 2
        
        // 3. Mandamos o programa calcular a média internamente
        app1.calcularMedia();
        
        // 4. Por fim, mostramos a caixinha com o resultado (Aprovado/Reprovado)
        app1.verificarAprovacao();
    }
}
