package com.es.programacion.tema8.proyectMiniCalculadora.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCalculadoraI extends JPanel {

    JTextField  textFieldValor1;
    JTextField  textFieldValor2;
    JButton     botonSuma;
    JButton     botonResta;
    JButton     botonMultiplicacion;
    JButton     botonDivision;
    JLabel      labelResultado;

    // EVENTOS
    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            System.out.println("Boton "+b.getText()+" clicado");

            if (b.getText().equalsIgnoreCase("+")) {
                // SE REALIZA LA SUMA
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = textFieldValor1.getText();
                String valorTexto2 = textFieldValor2.getText();

                // 2º Para sumar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultadoSuma = valorEnteroTexto1 + valorEnteroTexto2;

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultadoSuma+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            }

            if (b.getText().equalsIgnoreCase("-")) {
                // SE REALIZA LA RESTA
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = textFieldValor1.getText();
                String valorTexto2 = textFieldValor2.getText();

                // 2º Para sumar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultado = valorEnteroTexto1 - valorEnteroTexto2;

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultado+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            }

            if (b.getText().equalsIgnoreCase("x")) {
                // SE REALIZA LA RESTA
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = textFieldValor1.getText();
                String valorTexto2 = textFieldValor2.getText();

                // 2º Para sumar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    // 3º Realizamos la suma de los valores
                    int resultado = valorEnteroTexto1 * valorEnteroTexto2;
                    System.out.println(resultado);

                    // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                    labelResultado.setText(resultado+"");

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            }

            if (b.getText().equalsIgnoreCase("/")) {
                // SE REALIZA LA RESTA
                // 1º Obtenemos los valores de los TextFields
                String valorTexto1 = textFieldValor1.getText();
                String valorTexto2 = textFieldValor2.getText();

                // 2º Para sumar, los valores deben ser enteros (try/catch para evitar errores)
                try {
                    int valorEnteroTexto1 = Integer.parseInt(valorTexto1);
                    int valorEnteroTexto2 = Integer.parseInt(valorTexto2);

                    if(valorEnteroTexto2 == 0) {
                        labelResultado.setText("NO SE PUEDE DIVIDIR POR CERO");
                    } else {
                        // 3º Realizamos la suma de los valores
                        int resultado = valorEnteroTexto1 / valorEnteroTexto2;

                        // 4º Por último, ponemos ese resultado en el JLabel (labelResultado)
                        labelResultado.setText(resultado+"");
                    }

                } catch (NumberFormatException ex) {
                    labelResultado.setText("ERROR");
                }
            }


        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(183, 160, 255));
            b.setBorder(new LineBorder(new Color(0,0,0), 3));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(107, 154, 208));
            b.setBorder(new LineBorder(new Color(0,0,0), 1));
        }
    };


    public PanelCalculadoraI() {
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(200,200,200));

        //Inicializamos los elementos
        textFieldValor1 = new JTextField("introduzca valor 1");
        textFieldValor2 = new JTextField("introduzca valor 2");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplicacion = new JButton("x");
        botonDivision = new JButton("/");
        labelResultado = new JLabel();

        // Modificamos los atributos/valores/aspecto de los elementos
        textFieldValor1.setPreferredSize(new Dimension(300,200));
        textFieldValor2.setPreferredSize(new Dimension(300,200));
        botonSuma.setPreferredSize(new Dimension(150,200));
        botonResta.setPreferredSize(new Dimension(150,200));
        botonMultiplicacion.setPreferredSize(new Dimension(150,200));
        botonDivision.setPreferredSize(new Dimension(150,200));
        labelResultado.setPreferredSize(new Dimension(600,200));

        // Otras modificaciones de aspecto
        labelResultado.setFont(new Font("Consolas", Font.BOLD, 32));
        labelResultado.setHorizontalAlignment(JLabel.CENTER);

        // Anadimos los eventos
        botonSuma.addMouseListener(listenerMouse);
        botonResta.addMouseListener(listenerMouse);
        botonMultiplicacion.addMouseListener(listenerMouse);
        botonDivision.addMouseListener(listenerMouse);

        JPanel panelNorte = new JPanel(new GridLayout(1,2));
        JPanel panelCentro = new JPanel(new GridLayout(1,4));

        // Anadimos al JPanel
        panelNorte.add(textFieldValor1);
        panelNorte.add(textFieldValor2);
        panelCentro.add(botonSuma);
        panelCentro.add(botonResta);
        panelCentro.add(botonMultiplicacion);
        panelCentro.add(botonDivision);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(labelResultado, BorderLayout.SOUTH);
    }
}
