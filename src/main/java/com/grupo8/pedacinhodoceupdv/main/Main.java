package com.grupo8.pedacinhodoceupdv.main;

import java.awt.Font;
import javax.swing.UIManager;
import com.grupo8.pedacinhodoceupdv.fonts.FontManager;
import com.grupo8.pedacinhodoceupdv.view.MenuView;
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

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel labelUsername = new JLabel("Username:");
        textFieldUsername = new JTextField();

        JLabel labelPassword = new JLabel("Password:");
        passwordField = new JPasswordField();

        buttonLogin = new JButton("Login");

        panel.add(labelUsername);
        panel.add(textFieldUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(buttonLogin);

        add(panel, BorderLayout.CENTER);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                // Verificar as credenciais do cliente aqui
                // Você pode adicionar lógica para autenticar o cliente
                // Se as credenciais forem válidas, exiba o MenuView e feche a tela de login

                if (username.equals("admin") && password.equals("senha")) {
                    dispose(); // Fecha a tela de login
                    showMenuView(); // Exibe o MenuView

                    FontManager fontManager = new FontManager();
                    Font futuraPT16 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 16);
                    Font futuraPT14 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 14);
                    Font futuraPT14Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 14);
                    Font futuraPT13 = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.PLAIN, 13);
                    UIManager.put("dateChooserCombo", futuraPT13);
                    UIManager.put("Button.font", futuraPT16);
                    UIManager.put("RadioButton.font", LoginViewturaPT13);
                    UIManager.put("Label.font", futuraPT14);
                    UIManager.put("Panel.font", futuraPT16);
                    UIManager.put("Table.font", futuraPT13);
                    UIManager.put("TableHeader.font", futuraPT14Bold);
                    UIManager.put("TextField.font", futuraPT13);
                    UIManager.put("FormattedTextField.font", futuraPT13);
                    UIManager.put("TextArea.font", futuraPT13);
                    new MenuView().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Credenciais inválidas", "Erro de Login",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

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