/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplocarroo;

/**
 *
 * @author guilherme
 */
public class ExemploCarroo {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    

Carro umCarro = new Carro();

umCarro.modelo = "SIENNA";
umCarro.Cor = "Cinza";
umCarro.motor = "1.0";


System.out.println(umCarro.Cor);
System.out.println(umCarro.motor);
System.out.println(umCarro.modelo);
umCarro.ligar();
umCarro.mudarMarcha();
umCarro.desligar();
umCarro.freiar();
umCarro.acelerar();

umCarro = null;
}
}
