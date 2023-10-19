package sistemafinanceiro2;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.border.Border;

public class formaPgto extends JPanel {

    private JLabel lblTitulo, lblCodigo, lblValor, lblFormaPgto, lblAtivo;

    private JTextField txtCodigo, txtValor;

    private JComboBox<String> boxAtivo, boxFormaPgto;

    private JButton btnPesquisar, btnCadastrar, btnConsultar, btnExcluir;

    private JPanel panelPrincipal;

    public formaPgto() {
        setBounds(0, 20, 785, 580);
        instaciarFormaPgto();
        adicionarFormaPgto();
        posicionarFormaPgto();
        setLayout(null);

    }

    public void instaciarFormaPgto() {

        lblTitulo = new JLabel("<html><span style='color: black; text-shadow: 2px 2px 4px #000;'>Cadastrar Forma de Pagamento </span></html>");
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        lblCodigo = new JLabel("Código da venda");
        txtCodigo = new JTextField("12344");

        Border emptyBorder = BorderFactory.createEmptyBorder();
        btnPesquisar = new JButton();
        btnPesquisar.setIcon(new ImageIcon(getClass().getResource("/images/binoculars_resized.png")));
        btnPesquisar.setBackground(new Color(240, 240, 240));
        btnPesquisar.setFocusPainted(false);

        panelPrincipal = new JPanel();
        panelPrincipal.setBorder(BorderFactory.createTitledBorder("Forma de Pagamento"));
        panelPrincipal.setLayout(null);

        lblValor = new JLabel("Valor da Transação ");
        txtValor = new JTextField("0,00");

        lblFormaPgto = new JLabel("Forma de Pagamento da Venda");
        boxFormaPgto = new JComboBox<>();
        boxFormaPgto.addItem("Cartão de Crédito");
        boxFormaPgto.addItem("Cartão de Débito");
        boxFormaPgto.addItem("Boleto");
        boxFormaPgto.addItem("Transferência Bancária");
        boxFormaPgto.addItem("Cheque");
        boxFormaPgto.addItem("Pix");

        lblAtivo = new JLabel("Pagamento");
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

    public void adicionarFormaPgto() {
        add(lblTitulo);
        add(lblCodigo);
        add(txtCodigo);
        add(btnPesquisar);

        panelPrincipal.add(lblValor);
        panelPrincipal.add(txtValor);
        panelPrincipal.add(lblFormaPgto);
        panelPrincipal.add(boxFormaPgto);
        panelPrincipal.add(lblAtivo);
        panelPrincipal.add(boxAtivo);

        add(panelPrincipal);
        add(btnCadastrar);
        add(btnConsultar);
        add(btnExcluir);

    }

    public void posicionarFormaPgto() {
        lblTitulo.setBounds(7, 5, 300, 30);
        lblCodigo.setBounds(9, 35, 300, 30);
        txtCodigo.setBounds(9, 60, 200, 24);
        btnPesquisar.setBounds(225, 61, 30, 22);

        panelPrincipal.setBounds(9, 100, 400, 400);
        lblValor.setBounds(14, 35, 200, 20);
        txtValor.setBounds(14, 61, 100, 20);

        lblFormaPgto.setBounds(14, 110, 200, 20);
        boxFormaPgto.setBounds(14, 137, 160, 20);

        lblAtivo.setBounds(14, 185, 200, 20);
        boxAtivo.setBounds(14, 212, 100, 20);

        btnCadastrar.setBounds(530, 60, 140, 30);
        btnConsultar.setBounds(530, 120, 140, 30);
        btnExcluir.setBounds(530, 180, 140, 30);
    }

}
