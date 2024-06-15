package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel registerPanel;
    private JPanel animatedPanel;

    public LoginForm() {
        // Configurar el marco
        setTitle("Login Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear el panel principal con CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Crear los paneles de login y registro
        JPanel loginPanel = createLoginPanel();
        registerPanel = createRegisterPanel();

        // Panel para la animación
        animatedPanel = new JPanel(null);
        animatedPanel.setBackground(Color.WHITE);
        animatedPanel.add(registerPanel);

        // Posicionar el panel de registro fuera de la vista
        registerPanel.setBounds(0, mainPanel.getHeight(), 400, 300);

        // Agregar los paneles al CardLayout
        mainPanel.add(loginPanel, "login");
        mainPanel.add(animatedPanel, "animatedPanel");

        // Agregar el panel principal al marco
        add(mainPanel);

        // Hacer visible el marco
        setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Crear componentes de login
        JLabel userLabel = new JLabel("Usuario:");
        JTextField userTextField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setEchoChar('*');

        JButton showPasswordButton = new JButton("Mostrar");
        showPasswordButton.addActionListener(new ActionListener() {
            private boolean isPasswordVisible = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isPasswordVisible) {
                    passwordField.setEchoChar('*');
                    showPasswordButton.setText("Mostrar");
                } else {
                    passwordField.setEchoChar((char) 0);
                    showPasswordButton.setText("Ocultar");
                }
                isPasswordVisible = !isPasswordVisible;
            }
        });

        JButton loginButton = new JButton("Entrar");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                char[] password = passwordField.getPassword();

                // Aquí puedes agregar la lógica de autenticación
                JOptionPane.showMessageDialog(LoginForm.this, "Usuario: " + username + "\nContraseña: " + new String(password));
            }
        });

        JButton registerButton = new JButton("Registrar Usuario");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "animatedPanel");
                animatePanelUp();
            }
        });

        // Agregar componentes al panel de login
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(userLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(userTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordField, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        panel.add(showPasswordButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(loginButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(registerButton, constraints);

        return panel;
    }

    private JPanel createRegisterPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;

        // Crear componentes de registro
        JLabel nameLabel = new JLabel("Nombre:");
        JTextField nameTextField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Contraseña:");
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setEchoChar('*');

        JLabel countryLabel = new JLabel("País:");
        JTextField countryTextField = new JTextField(15);

        JButton registerButton = new JButton("Registrar");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                char[] password = passwordField.getPassword();
                String country = countryTextField.getText();

                // Aquí puedes agregar la lógica de registro
                JOptionPane.showMessageDialog(LoginForm.this, "Nombre: " + name + "\nContraseña: " + new String(password) + "\nPaís: " + country);
            }
        });

        JButton backButton = new JButton("Volver");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                animatePanelDown();
            }
        });

        // Agregar componentes al panel de registro
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(nameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(nameTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(countryLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(countryTextField, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(registerButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(backButton, constraints);

        return panel;
    }

    private void animatePanelUp() {
        Timer timer = new Timer(5, new ActionListener() {
            int y = mainPanel.getHeight();

            @Override
            public void actionPerformed(ActionEvent e) {
                y -= 5;
                registerPanel.setBounds(0, y, 400, 300);
                if (y <= 0) {
                    ((Timer) e.getSource()).stop();
                }
                animatedPanel.repaint();
            }
        });
        timer.start();
    }

    private void animatePanelDown() {
        Timer timer = new Timer(5, new ActionListener() {
            int y = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                y += 5;
                registerPanel.setBounds(0, y, 400, 300);
                if (y >= mainPanel.getHeight()) {
                    ((Timer) e.getSource()).stop();
                    cardLayout.show(mainPanel, "login");
                }
                animatedPanel.repaint();
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm();
            }
        });
    }
}
