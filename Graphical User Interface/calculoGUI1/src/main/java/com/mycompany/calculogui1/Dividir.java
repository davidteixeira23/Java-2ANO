package com.mycompany.calculogui1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dividir extends JFrame {
    JLabel rotulo1, rotulo2, exibir, rotuloerro1;
    JTextField texto1, texto2;
    JButton botaoDividir;

    public Dividir() {
        super("Calculadora de Divisão Inteira");
        Container tela = getContentPane();
        setLayout(null);

        // Instanciando os componentes
        rotulo1 = new JLabel("Número 1:");
        rotulo2 = new JLabel("Número 2:");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        botaoDividir = new JButton("Dividir");
        
        // Configuração do rótulo de erro
        rotuloerro1 = new JLabel("");
        rotuloerro1.setForeground(Color.RED);

        // Posicionamento (Bounds)
        rotulo1.setBounds(50, 20, 100, 20);
        texto1.setBounds(120, 20, 200, 20);
        
        rotulo2.setBounds(50, 60, 100, 20);
        texto2.setBounds(120, 60, 200, 20);
        
        botaoDividir.setBounds(150, 100, 100, 25);
        
        exibir.setBounds(50, 140, 300, 20);
        rotuloerro1.setBounds(50, 170, 350, 20);

        // Evento do Botão com Try-Catch
        botaoDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Tenta converter e calcular
                    int numero1 = Integer.parseInt(texto1.getText());
                    int numero2 = Integer.parseInt(texto2.getText());
                    
                    int resultado = numero1 / numero2;

                    // Se chegar aqui, deu tudo certo
                    exibir.setText("O resultado da divisão é: " + resultado);
                    exibir.setVisible(true);
                    rotuloerro1.setVisible(false);

                } catch (NumberFormatException ex) {
                    // Erro caso não seja um número inteiro válido
                    rotuloerro1.setText("Erro: Digite apenas números inteiros!");
                    rotuloerro1.setVisible(true);
                    exibir.setVisible(false);

                } catch (ArithmeticException ex) {
                    // Erro caso tente dividir por zero
                    rotuloerro1.setText("Erro: Não é possível dividir por zero!");
                    rotuloerro1.setVisible(true);
                    exibir.setVisible(false);

                } catch (Exception ex) {
                    // Captura qualquer outro erro desconhecido
                    rotuloerro1.setText("Erro inesperado: " + ex.getMessage());
                    rotuloerro1.setVisible(true);
                    exibir.setVisible(false);
                }
            }
        });

        // Configurações da Janela
        tela.setBackground(new Color(200, 255, 200)); // Um verde claro mais suave
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(botaoDividir);
        tela.add(rotuloerro1);

        setSize(450, 280);
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o processo ao fechar a janela
        setVisible(true);
    }

    public static void main(String[] args) {
        new Dividir();
    }
}