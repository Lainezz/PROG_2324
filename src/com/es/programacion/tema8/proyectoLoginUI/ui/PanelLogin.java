package com.es.programacion.tema8.proyectoLoginUI.ui;

import com.es.programacion.tema8.proyectoLoginUI.services.ServiceUser;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author Pablo Macías
 */
public class PanelLogin extends JPanel {
    JTextField user;
    JTextField pass;
    JButton bEnviar;

    ServiceUser serviceUser = new ServiceUser();

    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {


            if(serviceUser.loginUI(user.getText(), pass.getText())) {
                System.out.println("Esta registrado");
            } else {
                System.out.println("Pa tu casa");
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(135, 206, 250)); // Fondo azul claro
            b.setBorder(new LineBorder(new Color(0, 115, 183), 3)); // Borde azul oscuro
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(102, 153, 204)); // Fondo azul medio
            b.setBorder(new LineBorder(new Color(135, 206, 250), 3)); // Borde azul claro
        }
    };
    public PanelLogin() {
        this.setBackground(new Color(174, 139, 225));
        this.setLayout(null);

        JLabel usuario = new JLabel("Usuario: ");
        usuario.setLocation(new Point(200,135));
        usuario.setSize(new Dimension(152,32));
        // usuario.setFont(new Font("Consolas", Font.BOLD, 22));
        this.add(usuario);

        user = new JTextField("Introduzca su usuario");
        user.setLocation(new Point(260,135));
        user.setSize(new Dimension(152,32));
        this.add(user);

        JLabel passwd = new JLabel("Passwd: ");
        passwd.setLocation(new Point(200,200));
        passwd.setSize(new Dimension(152,32));
        this.add(passwd);

        pass = new JPasswordField();
        pass.setLocation(new Point(260,200));
        pass.setSize(new Dimension(152,32));
        this.add(pass);

        bEnviar = new JButton("Enviar");
        bEnviar.setLocation(new Point(220,321));
        bEnviar.setSize(new Dimension(152,32));
        this.add(bEnviar);
        bEnviar.addMouseListener(listenerMouse);

    }
}
