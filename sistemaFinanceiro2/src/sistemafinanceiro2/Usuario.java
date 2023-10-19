package sistemafinanceiro2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Usuario extends JPanel {

    private JLabel lblTitulo, lblNome, lblLogin, lblSenha, lblCadastro, lblAtivo;

    private JTextField txtNome, txtLogin;

    private JPasswordField passSenha;

    private JComboBox<String> boxAtivo;

    private JSpinner spinData;

    private JPanel panelDados;

    private JButton btnCadastrar, btnConsultar, btnExcluir;

    private JToggleButton tbuttonMostrar;

    public Usuario() {
        setBounds(0, 20, 785, 580);
        instaciarUsuario();
        adicionarUsuario();
        posicionarUsuario();
        Eventos();
        setLayout(null);

    }

    public void instaciarUsuario() {

        lblTitulo = new JLabel("<html><span style='color: black; text-shadow: 2px 2px 4px #000;'>Cadastrar Usuário</span></html>");
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        panelDados = new JPanel();
        panelDados.setBorder(BorderFactory.createTitledBorder("Dados Cadastrais"));
       
        panelDados.setLayout(null);

        lblNome = new JLabel("Nome");
        txtNome = new JTextField("João Victor");

        lblLogin = new JLabel("Login");
        txtLogin = new JTextField("@Lapizeiro");

        lblSenha = new JLabel("Senha");
        passSenha = new JPasswordField("jvandreoli");
        passSenha.setEchoChar('*');

        tbuttonMostrar = new JToggleButton();
        tbuttonMostrar.setIcon(new ImageIcon(getClass().getResource("/images/view_resized.png")));
        tbuttonMostrar.setBackground(new Color(240, 240, 240));
        tbuttonMostrar.setFocusPainted(false);

        lblCadastro = new JLabel("Data de Cadastro");
        SpinnerDateModel dateModel = new SpinnerDateModel();
        spinData = new JSpinner(dateModel);
        Calendar calendar = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        spinData.setValue(calendar.getTime());

        lblAtivo = new JLabel("Usuário");
        boxAtivo = new JComboBox<>();
        boxAtivo.addItem("Ativo");
        boxAtivo.addItem("Inativo");

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setIcon(new ImageIcon(getClass().getResource("/images/audit_resized.png")));
        btnCadastrar.setBackground(new Color(240, 240, 240));
        btnCadastrar.setFocusPainted(false);

        btnConsultar = new JButton("Consultar");
        btnConsultar.setIcon(new ImageIcon(getClass().getResource("/images/search_resized.png")));
        btnConsultar.setBackground(new Color(240, 240, 240));
        btnConsultar.setFocusPainted(false);

        btnExcluir = new JButton("Excluir  ");
        btnExcluir.setIcon(new ImageIcon(getClass().getResource("/images/delete_resized.png")));
        btnExcluir.setBackground(new Color(240, 240, 240));
        btnExcluir.setFocusPainted(false);
        
    }

    public void Eventos() {
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

    public void adicionarUsuario() {
        add(lblTitulo);

        panelDados.add(lblNome);
        panelDados.add(txtNome);
        panelDados.add(lblLogin);
        panelDados.add(txtLogin);
        panelDados.add(lblSenha);
        panelDados.add(passSenha);
        panelDados.add(tbuttonMostrar);
        panelDados.add(lblCadastro);
        panelDados.add(spinData);
        panelDados.add(lblAtivo);
        panelDados.add(boxAtivo);

        add(panelDados);
        add(btnCadastrar);
        add(btnConsultar);
        add(btnExcluir);

    }

    public void posicionarUsuario() {
        lblTitulo.setBounds(7, 5, 300, 30);

        panelDados.setBounds(9, 45, 410, 410);
        lblNome.setBounds(14, 35, 200, 20);
        txtNome.setBounds(14, 61, 200, 20);

        lblLogin.setBounds(14, 105, 200, 20);
        txtLogin.setBounds(14, 132, 140, 20);

        lblSenha.setBounds(14, 175, 135, 20);
        passSenha.setBounds(14, 202, 135, 20);
        tbuttonMostrar.setBounds(154, 202, 32, 20);

        lblCadastro.setBounds(14, 245, 200, 20);
        spinData.setBounds(14, 271, 125, 20);

        lblAtivo.setBounds(14, 315, 200, 20);
        boxAtivo.setBounds(14, 342, 140, 20);

        btnCadastrar.setBounds(530, 60, 140, 30);
        btnConsultar.setBounds(530, 120, 140, 30);
        btnExcluir.setBounds(530, 180, 140, 30);
    }

}
