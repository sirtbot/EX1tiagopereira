package org.meia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Média");

        JLabel labelNota1 = new JLabel("Nota 1:");
        JTextField campoNota1 = new JTextField(10);

        JLabel labelNota2 = new JLabel("Nota 2:");
        JTextField campoNota2 = new JTextField(10);

        JLabel labelNota3 = new JLabel("Nota 3:");
        JTextField campoNota3 = new JTextField(10);

        JLabel labelNota4 = new JLabel("Nota 4:");
        JTextField campoNota4 = new JTextField(10);

        JButton botaoCalcular = new JButton("Calcular Média");
        JLabel labelResultado = new JLabel("A média das notas é: ");

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.add(labelNota1);
        frame.add(campoNota1);
        frame.add(labelNota2);
        frame.add(campoNota2);
        frame.add(labelNota3);
        frame.add(campoNota3);
        frame.add(labelNota4);
        frame.add(campoNota4);
        frame.add(botaoCalcular);
        frame.add(labelResultado);

        botaoCalcular.addActionListener(e -> {
            try {
                double nota1 = Double.parseDouble(campoNota1.getText());
                double nota2 = Double.parseDouble(campoNota2.getText());
                double nota3 = Double.parseDouble(campoNota3.getText());
                double nota4 = Double.parseDouble(campoNota4.getText());

                double media = (nota1 + nota2 + nota3 + nota4) / 4;

                labelResultado.setText("A média das notas é: " + media);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, insira valores válidos para as notas.");
            }
        });

        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
