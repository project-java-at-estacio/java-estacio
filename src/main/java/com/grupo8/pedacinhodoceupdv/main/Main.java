package com.grupo8.pedacinhodoceupdv.main;

import com.grupo8.pedacinhodoceupdv.fonts.FontManager;
import com.grupo8.pedacinhodoceupdv.view.MenuView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    protected static final Object LoginViewturaPT13 = null;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton buttonLogin;

    public Main() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Definir o tema Nimbus para uma aparência mais moderna
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel labelUsername = new JLabel("Username:");
        textFieldUsername = new JTextField();

        JLabel labelPassword = new JLabel("Password:");
        passwordField = new JPasswordField();

        buttonLogin = new JButton("Login");
        JButton buttonRegister = new JButton("Register");

        panel.add(labelUsername);
        panel.add(textFieldUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(buttonLogin);
        panel.add(new JLabel());
        panel.add(buttonRegister);

        add(panel, BorderLayout.CENTER);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Autenticar com o banco de dados
                if (authenticateUser(username, password)) {
                    dispose(); // Fecha a tela de login
                    showMenuView(); // Exibe o MenuView
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Credenciais inválidas", "Erro de Login",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a tela de login
                showRegisterView(); // Exibe a tela de registro
            }
        });
    }

    private boolean authenticateUser(String username, String password) {
        // Configurações do banco de dados
        String url = "jdbc:mysql://localhost:3306/DBPEDACINHODOCEU?useTimezone=true&serverTimezone=UTC";
        String dbUsername = "user";
        String dbPassword = "user";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public class RegisterView extends JFrame {
        private final Main parent;
        private JTextField textFieldUsername;
        private JPasswordField passwordField;
        private JButton buttonRegister;
        private JButton buttonBack;

        public RegisterView(final Main parent) {
            this.parent = parent;
            setTitle("Register");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 200);
            setLocationRelativeTo(null);
            setLayout(new BorderLayout());

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 2, 10, 10));

            JLabel labelUsername = new JLabel("Username:");
            textFieldUsername = new JTextField();

            JLabel labelPassword = new JLabel("Password:");
            passwordField = new JPasswordField();

            buttonRegister = new JButton("Register");
            buttonBack = new JButton("Back");

            panel.add(labelUsername);
            panel.add(textFieldUsername);
            panel.add(labelPassword);
            panel.add(passwordField);
            panel.add(new JLabel());
            panel.add(buttonRegister);
            panel.add(new JLabel());
            panel.add(buttonBack);

            add(panel, BorderLayout.CENTER);

            buttonRegister.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = textFieldUsername.getText();
                    String password = new String(passwordField.getPassword());

                    registerUser(username, password);
                }
            });

            buttonBack.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dispose(); // Fecha a tela de registro
                    parent.showMenuView(); // Exibe a tela de login novamente
                }
            });
        }

        private void registerUser(String username, String password) {
            String url = "jdbc:mysql://localhost:3306/DBPEDACINHODOCEU?useTimezone=true&serverTimezone=UTC";
            String dbUsername = "user";
            String dbPassword = "user";

            try {
                Connection connection = DriverManager.getConnection(url, dbUsername, dbPassword);

                String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, password);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Registration successful", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Fecha a tela de registro
                    parent.showMenuView(); // Exibe a tela de login novamente
                } else {
                    JOptionPane.showMessageDialog(this, "Registration failed", "Error", JOptionPane.ERROR_MESSAGE);
                }

                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void showRegisterView() {
        RegisterView registerView = new RegisterView(this);
        registerView.setVisible(true);
    }

    protected void registerUser(String username, String password) {
    }

    @SuppressWarnings("unused")
    private void showMenuView() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FontManager fontManager = new FontManager();
                    // Resto do código para carregar as fontes e configurar o UIManager
                    new MenuView().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main loginView = new Main();
                    loginView.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}