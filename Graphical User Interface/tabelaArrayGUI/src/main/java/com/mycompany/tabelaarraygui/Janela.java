package com.mycompany.tabelaarraygui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

/**
 * @author David
 */
public class Janela extends JFrame {

    JButton exibir;
    private JTable table;
    private final String colunas[] = {"Nome:", "Idade:", "Sexo"};
    private final String dados[][] = {
        {"Mariana", "16", "Feminino"},
        {"Carlos", "60", "masculino"},
        {"David", "16", "masculino"},
        {"Julia", "16", "Feminino"},
        {"Guilherme", "17", "masculino"},
        {"Gabriel", "16", "masculino"},
        {"Giulio", "16", "masculino"},
        {"Caio", "16", "masculino"},
        {"Inaê", "16", "Feminino"},
    };

    public Janela() {
        // 1. Configurações básicas da janela
        setTitle("Planilha");
        setLayout(new FlowLayout());
        setSize(new Dimension(600, 250)); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 2. PRIMEIRO instanciamos a tabela
        table = new JTable(dados, colunas);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table.setPreferredScrollableViewportSize(new Dimension(500, 100));
        table.setFillsViewportHeight(true);

        // 3. Criamos o Scroll e adicionamos a tabela dentro dele
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane); // Adiciona o scroll na janela

        // 4. Instanciamos o botão e adicionamos a ação
        exibir = new JButton("Confirmar");
        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Pegando o índice das linhas selecionadas
                int[] linhasSelecionadas = table.getSelectedRows();
                String resultados = "Os funcionários selecionados são:\n";

                // Loop para pegar os nomes das linhas que o usuário clicou
                for (int linha : linhasSelecionadas) {
                    resultados += table.getValueAt(linha, 0) + "\n"; // Coluna 0 é o Nome
                }

          
                JOptionPane.showMessageDialog(null, resultados);
            }
        });

   
        add(exibir);
    }
}