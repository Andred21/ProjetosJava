package sistemafinanceiro2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class TelaLogin extends JFrame {

    private JLabel lblImagem, lblTitulo, lblEmail, lblSenha;
    private JTextField txtEmail;
    private JPasswordField passSenha;
    private JButton btnRedefinir, btnEntrar, btnCadastrar;
    private JPanel panelGeral;
    private JToggleButton tbuttonMostrar;

    public TelaLogin() {

        setTitle("Login"); // título do frame
        setPreferredSize(new Dimension(800, 600)); // ajuste do tamanho e layout
        setLayout(null); // aqui a definicao para utilizacao de layout absoluto

        instanciar(); // instancia componentes (objetos Swing);
        adicionar();
        posicionar();// configura as posices dos componentes;
        Eventos();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // deixa o frame visível
        pack(); // reorganiza os componentes (objetos) no frame
    }

    public void instanciar() {

        lblImagem = new JLabel();
        lblImagem.setIcon(new ImageIcon(getClass().getResource("/images/java_capa_resized.jpg")));

        panelGeral = new JPanel();
   

        panelGeral.setLayout(null);

        lblTitulo = new JLabel("Faça seu login");
        lblTitulo.setFont(new Font(Font.DIALOG, Font.BOLD, 15));

        lblEmail = new JLabel("Email");
        txtEmail = new JTextField();

        lblSenha = new JLabel("Senha");
        passSenha = new JPasswordField();
        passSenha.setEchoChar('*');

        tbuttonMostrar = new JToggleButton();
        tbuttonMostrar.setIcon(new ImageIcon(getClass().getResource("/images/view_resized.png")));
        tbuttonMostrar.setBackground(new Color(240, 240, 240));
        tbuttonMostrar.setFocusPainted(false);

        btnRedefinir = new JButton("<html><u>Esqueci minha senha</u></html>\"");
        btnRedefinir.setBorderPainted(false);
        btnRedefinir.setBackground(new Color(240, 240, 240));
        btnRedefinir.setFocusPainted(false);

        btnEntrar = new JButton("Entrar");

        btnCadastrar = new JButton("<html><u>Ainda não tenho uma conta</u></html>\"");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setBackground(new Color(240, 240, 240));
        btnCadastrar.setFocusPainted(false);

    }

    public void Eventos() {

        btnEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose();
            }
        });

        tbuttonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tbuttonMostrar.isSelected()) {
                    passSenha.setEchoChar((char) 0);

                } else {
                    passSenha.setEchoChar('*');

                }

            }
        });
    }

    public void adicionar() {

        panelGeral.add(lblTitulo);
        panelGeral.add(lblEmail);
        panelGeral.add(txtEmail);
        panelGeral.add(lblSenha);
        panelGeral.add(passSenha);
        panelGeral.add(tbuttonMostrar);
        panelGeral.add(btnRedefinir);
        panelGeral.add(btnEntrar);
        panelGeral.add(btnCadastrar);

        add(panelGeral);
        add(lblImagem);

    }

    public void posicionar() {
        //Posicionando os Dados Gerais 
        panelGeral.setBounds(10, 130, 300, 330);
        lblTitulo.setBounds(90, 10, 150, 30);
        lblEmail.setBounds(10, 60, 100, 20);
        txtEmail.setBounds(10, 80, 220, 20);
        lblSenha.setBounds(10, 140, 100, 20);
        passSenha.setBounds(10, 160, 220, 20);
        tbuttonMostrar.setBounds(240, 160, 32, 20);
        btnRedefinir.setBounds(90, 200, 190, 14);
        btnEntrar.setBounds(50, 230, 180, 40);
        btnCadastrar.setBounds(10, 290, 190, 14);
        lblImagem.setBounds(0, 0, 800, 600);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLogin obj = new TelaLogin();

        });

    }
}
