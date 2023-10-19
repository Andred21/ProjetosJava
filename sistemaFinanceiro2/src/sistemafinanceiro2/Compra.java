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

public class Compra extends JPanel {

    private JLabel lblTitulo, lblCnpj, lblDataEmissao, lblIdProdutos, lblProduto1, lblProduto2, lblProduto3, lblQuantidade, lblProduto,
            lblValorProdutos, lblValorDesconto, lblValorTotal, lblDataEntrada;

    private JTextField txtCnpj, txtProduto1, txtProduto2, txtProduto3, txtValorProduto1, txtQuantidade1, txtQuantidade2, txtQuantidade3,
            txtValorProduto2, txtValorProduto3, txtValorDesconto, txtValorTotal;

    private JSpinner spinDataEmissao, spinDataEntrada;

    private JPanel panelDadosCompra, panelObs;

    private JButton btnPesquisar, btnCadastrar, btnConsultar, btnExcluir;

    private JTextArea txtObs;

    public Compra() {
        setBounds(0, 20, 785, 580);
        instaciarCompra();
        adicionarCompra();
        posicionarCompra();
        setLayout(null);

    }

    public void instaciarCompra() {

        lblTitulo = new JLabel("<html><span style='color: black; text-shadow: 2px 2px 4px #000;'>Cadastrar Compra </span></html>");
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        lblCnpj = new JLabel("CNPJ do Fornecedor");
        txtCnpj = new JTextField("00.000.000/0001-00");

        Border emptyBorder = BorderFactory.createEmptyBorder();
        btnPesquisar = new JButton();
        btnPesquisar.setIcon(new ImageIcon(getClass().getResource("/images/binoculars_resized.png")));
        btnPesquisar.setBackground(new Color(240, 240, 240));
        btnPesquisar.setFocusPainted(false);

        panelDadosCompra = new JPanel();
        panelDadosCompra.setBorder(BorderFactory.createTitledBorder("Dados da Compra"));
        panelDadosCompra.setLayout(null);

        lblDataEmissao = new JLabel("Data da Emissão");
        SpinnerDateModel dateModel = new SpinnerDateModel();
        spinDataEmissao = new JSpinner(dateModel);
        Calendar calendar = new GregorianCalendar(2023, Calendar.SEPTEMBER, 15);
        spinDataEmissao.setValue(calendar.getTime());

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

        txtQuantidade1 = new JTextField("2x");

        txtQuantidade2 = new JTextField("4x");

        txtQuantidade3 = new JTextField("6x");

        lblValorDesconto = new JLabel("Valor do Desconto");
        txtValorDesconto = new JTextField("- 0,00");

        lblValorTotal = new JLabel("Valor Total da Venda");
        txtValorTotal = new JTextField("0,00");

        lblDataEntrada = new JLabel("Data da Entrada");
        SpinnerDateModel dateModel2 = new SpinnerDateModel();
        spinDataEntrada = new JSpinner(dateModel2);
        Calendar calendar2 = new GregorianCalendar(2023, Calendar.SEPTEMBER, 15);
        spinDataEmissao.setValue(calendar2.getTime());

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

    public void adicionarCompra() {
        add(lblTitulo);
        add(lblCnpj);
        add(txtCnpj);
        add(btnPesquisar);
        panelDadosCompra.add(lblProduto);
        panelDadosCompra.add(lblProduto1);
        panelDadosCompra.add(lblProduto2);
        panelDadosCompra.add(lblProduto3);
        panelDadosCompra.add(lblIdProdutos);
        panelDadosCompra.add(txtProduto1);
        panelDadosCompra.add(txtProduto2);
        panelDadosCompra.add(txtProduto3);
        panelDadosCompra.add(lblValorProdutos);
        panelDadosCompra.add(txtValorProduto1);
        panelDadosCompra.add(txtValorProduto2);
        panelDadosCompra.add(txtValorProduto3);
        panelDadosCompra.add(lblQuantidade);
        panelDadosCompra.add(txtQuantidade1);
        panelDadosCompra.add(txtQuantidade2);
        panelDadosCompra.add(txtQuantidade3);
        panelDadosCompra.add(lblDataEmissao);
        panelDadosCompra.add(spinDataEmissao);
        panelDadosCompra.add(lblValorDesconto);
        panelDadosCompra.add(txtValorDesconto);
        panelDadosCompra.add(lblValorTotal);
        panelDadosCompra.add(txtValorTotal);
        panelDadosCompra.add(lblDataEntrada);
        panelDadosCompra.add(spinDataEntrada);

        add(panelDadosCompra);

        panelObs.add(txtObs);

        add(panelObs);

        add(btnCadastrar);
        add(btnConsultar);
        add(btnExcluir);
    }

    public void posicionarCompra() {
        lblTitulo.setBounds(7, 5, 300, 30);
        lblCnpj.setBounds(9, 35, 300, 30);
        txtCnpj.setBounds(9, 60, 200, 24);

        btnPesquisar.setBounds(225, 61, 30, 22);

        panelDadosCompra.setBounds(9, 100, 400, 400);
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

        lblDataEmissao.setBounds(35, 150, 100, 20);
        spinDataEmissao.setBounds(35, 175, 125, 20);

        lblValorDesconto.setBounds(35, 210, 150, 20);
        txtValorDesconto.setBounds(35, 240, 125, 20);

        lblValorTotal.setBounds(35, 270, 120, 20);
        txtValorTotal.setBounds(35, 300, 125, 20);

        lblDataEntrada.setBounds(210, 150, 140, 20);
        spinDataEntrada.setBounds(210, 175, 125, 20);

        panelObs.setBounds(430, 300, 300, 200);
        txtObs.setBounds(20, 20, 265, 170);

        btnCadastrar.setBounds(530, 60, 140, 30);
        btnConsultar.setBounds(530, 120, 140, 30);
        btnExcluir.setBounds(530, 180, 140, 30);

    }

}
