package sistemafinanceiro2;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Venda extends JPanel {

    private JLabel lblTitulo, lblCpfCliente, lblIdProdutos, lblProduto1, lblProduto2, lblProduto3, lblDataVenda, lblQuantidade, lblProduto,
            lblValorProdutos, lblValorDesconto, lblValorTotal;

    private JTextField txtCpfCliente, txtProduto1, txtProduto2, txtProduto3, txtValorProduto1, txtQuantidade1, txtQuantidade2, txtQuantidade3,
            txtValorProduto2, txtValorProduto3, txtValorDesconto, txtValorTotal;

    private JTextArea txtObs;

    private JSpinner spinDataVenda;

    private JPanel panelDadosVendas, panelObs;

    private JButton btnPesquisar, btnCadastrar, btnConsultar, btnExcluir;

    public Venda() {
        setBounds(0, 20, 785, 580);
        instaciarVenda();
        adicionarVenda();
        posicionarVenda();
        setLayout(null);

    }

    public void instaciarVenda() {
        lblTitulo = new JLabel("<html><span style='color: black; text-shadow: 2px 2px 4px #000;'>Cadastrar Venda </span></html>");
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        lblCpfCliente = new JLabel("CPF do Cliente");
        txtCpfCliente = new JTextField("000.000.000-00");

        Border emptyBorder = BorderFactory.createEmptyBorder();
        btnPesquisar = new JButton();
        btnPesquisar.setIcon(new ImageIcon(getClass().getResource("/images/binoculars_resized.png")));
        btnPesquisar.setBackground(new Color(240, 240, 240));
        btnPesquisar.setFocusPainted(false);

        panelDadosVendas = new JPanel();
        panelDadosVendas.setBorder(BorderFactory.createTitledBorder("Dados da Venda"));
        panelDadosVendas.setLayout(null);

        lblProduto = new JLabel("Produtos");

        lblProduto1 = new JLabel("1");
        lblProduto2 = new JLabel("2");
        lblProduto3 = new JLabel("3");

        lblIdProdutos = new JLabel("ID");

        txtProduto1 = new JTextField("1");

        txtProduto2 = new JTextField("2");

        txtProduto3 = new JTextField("3");

        lblValorProdutos = new JLabel("Valor ");

        txtValorProduto1 = new JTextField("0,00");

        txtValorProduto2 = new JTextField("0,00");

        txtValorProduto3 = new JTextField("0,00");

        lblQuantidade = new JLabel("Quantidade");

        txtQuantidade1 = new JTextField("5x");

        txtQuantidade2 = new JTextField("10x");

        txtQuantidade3 = new JTextField("8x");

        lblDataVenda = new JLabel("Data da Venda");
        SpinnerDateModel dateModel = new SpinnerDateModel();
        spinDataVenda = new JSpinner(dateModel);
        Calendar calendar = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        spinDataVenda.setValue(calendar.getTime());

        lblValorDesconto = new JLabel("Valor do Desconto");
        txtValorDesconto = new JTextField("- 0,00");

        lblValorTotal = new JLabel("Valor Total da Venda");
        txtValorTotal = new JTextField("0,00");

        panelObs = new JPanel();
        panelObs.setBorder(BorderFactory.createTitledBorder("Observações"));
        panelObs.setLayout(null);

        txtObs = new JTextArea("   .......");
        Color corBorda = new Color(64, 64, 64);
        txtObs.setBorder(new LineBorder(corBorda, 1));

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

    public void adicionarVenda() {
        add(lblTitulo);
        add(lblCpfCliente);
        add(txtCpfCliente);
        add(btnPesquisar);
        panelDadosVendas.add(lblProduto);
        panelDadosVendas.add(lblProduto1);
        panelDadosVendas.add(lblProduto2);
        panelDadosVendas.add(lblProduto3);
        panelDadosVendas.add(lblIdProdutos);
        panelDadosVendas.add(txtProduto1);
        panelDadosVendas.add(txtProduto2);
        panelDadosVendas.add(txtProduto3);
        panelDadosVendas.add(lblValorProdutos);
        panelDadosVendas.add(txtValorProduto1);
        panelDadosVendas.add(txtValorProduto2);
        panelDadosVendas.add(txtValorProduto3);
        panelDadosVendas.add(lblQuantidade);
        panelDadosVendas.add(txtQuantidade1);
        panelDadosVendas.add(txtQuantidade2);
        panelDadosVendas.add(txtQuantidade3);
        panelDadosVendas.add(lblDataVenda);
        panelDadosVendas.add(spinDataVenda);
        panelDadosVendas.add(lblValorDesconto);
        panelDadosVendas.add(txtValorDesconto);
        panelDadosVendas.add(lblValorTotal);
        panelDadosVendas.add(txtValorTotal);
        add(panelDadosVendas);

        panelObs.add(txtObs);

        add(panelObs);

        add(btnCadastrar);
        add(btnConsultar);
        add(btnExcluir);

    }

    public void posicionarVenda() {
        lblTitulo.setBounds(7, 5, 300, 30);
        lblCpfCliente.setBounds(9, 35, 300, 30);
        txtCpfCliente.setBounds(9, 60, 200, 24);

        btnPesquisar.setBounds(225, 61, 30, 22);

        panelDadosVendas.setBounds(9, 100, 400, 400);
        lblProduto.setBounds(14, 14, 100, 20);

        lblIdProdutos.setBounds(35, 30, 100, 20);
        lblValorProdutos.setBounds(120, 30, 100, 20);
        lblQuantidade.setBounds(220, 30, 100, 20);

        lblProduto1.setBounds(14, 50, 100, 20);
        txtProduto1.setBounds(35, 50, 70, 20);
        lblProduto2.setBounds(14, 80, 100, 20);
        txtProduto2.setBounds(35, 80, 70, 20);
        lblProduto3.setBounds(14, 110, 100, 20);
        txtProduto3.setBounds(35, 110, 70, 20);

        txtValorProduto1.setBounds(120, 50, 80, 20);
        txtValorProduto2.setBounds(120, 80, 80, 20);
        txtValorProduto3.setBounds(120, 110, 80, 20);

        txtQuantidade1.setBounds(220, 50, 80, 20);
        txtQuantidade2.setBounds(220, 80, 80, 20);
        txtQuantidade3.setBounds(220, 110, 80, 20);

        lblDataVenda.setBounds(35, 150, 100, 20);
        spinDataVenda.setBounds(35, 175, 125, 20);

        lblValorDesconto.setBounds(35, 210, 150, 20);
        txtValorDesconto.setBounds(35, 240, 125, 20);

        lblValorTotal.setBounds(35, 270, 120, 20);
        txtValorTotal.setBounds(35, 300, 125, 20);

        panelObs.setBounds(430, 300, 300, 200);
        txtObs.setBounds(20, 20, 265, 170);

        btnCadastrar.setBounds(530, 60, 140, 30);
        btnConsultar.setBounds(530, 120, 140, 30);
        btnExcluir.setBounds(530, 180, 140, 30);

    }

}
