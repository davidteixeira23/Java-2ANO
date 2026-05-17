package com.mycompany.mediametodo;
import javax.swing.*;

/**
 * @author David
 */
public class Calcular {
    
    // ATRIBUTOS: Variáveis para guardar os dados do aluno na classe
    private String nome;
    private double nota1;
    private double nota2;
    private double resultado;

    // Métodos para PEDIR os dados ao usuário (Inputs)
    public void lerNome() {
        // Agora salva direto no atributo 'nome' da classe
        this.nome = JOptionPane.showInputDialog("Digite o nome do aluno");
    }
    
    public void lerNotaA() {
        this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira nota"));
    }
    
    public void lerNotaB() {
        this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda nota"));
    }
    
    // Método para CALCULAR a média baseado no que foi guardado
    public double calcularMedia() {
        // Soma as duas notas salvas e divide por 2
        this.resultado = (this.nota1 + this.nota2) / 2;
        return this.resultado;
    }
    
    // Método para VERIFICAR a aprovação e exibir a mensagem
    public void verificarAprovacao() {
        // Compara o resultado salvo
        if (this.resultado >= 7.0) {
            JOptionPane.showMessageDialog(null, this.nome + " está Aprovado! Média: " + this.resultado);
        } else {
            JOptionPane.showMessageDialog(null, this.nome + " está Reprovado! Média: " + this.resultado);
        }
    }

    // MÉTODOS GETTERS: Caso precise pegar esses valores em outra classe (Ex: na classe Main)
    public String getNome() {
        return this.nome;
    }

    public double getResultado() {
        return this.resultado;
    }
}