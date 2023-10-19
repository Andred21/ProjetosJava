package sistemafinanceiro2;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.*;

public class Fornecedor extends JPanel {

    private JLabel lblTitulo, lblNome, lblFantasia, lblFisica, lblCnpj, lblRg,
            lblDataCadastro, lblEndereco, lblNumeroEnd, lblComplemento, lblBairro,
            lblCidade, lblUf, lblCep, lblContato, lblTelefone1, lblTelefone2, lblCelular, lblSite, lblEmail, lblAtivo;

    private JTextField txtNome, txtFantasia, txtCnpj, txtRg, txtEndereco, txtNumero, txtComplemento,
            txtbairro, txtCidade, txtCep, txtContato, txtTelefone1, txtTelefone2, txtCelular, txtSite, txtEmail;

    private JComboBox<String> boxFisica, boxUf, boxAtivo;

    private JSpinner spinCadastro;

    private JPanel panelDadosGerais, panelEndereco, panelContato;

    private JButton btnCadastrar, btnConsultar, btnExcluir;

    public Fornecedor() {
        setBounds(0, 20, 785, 580);
        instaciarFornecedor();
        adicionarFornecedor();
        posicionarFornecedor();
        setLayout(null);

    }

    public void instaciarFornecedor() {
        lblTitulo = new JLabel("<html><span style='color: black; text-shadow: 2px 2px 4px #000;'>Cadastrar Fornecedor</span></html>");
        lblTitulo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 18));

        panelDadosGerais = new JPanel();
        panelDadosGerais.setBorder(BorderFactory.createTitledBorder("Dados Gerais"));
        panelDadosGerais.setLayout(null);

        lblNome = new JLabel("Nome");
        txtNome = new JTextField("Clodoaldo da Silva");

        lblFantasia = new JLabel("Fantasia");
        txtFantasia = new JTextField("Café e CIA");

        lblFisica = new JLabel("Pessoa");
        boxFisica = new JComboBox<>();
        boxFisica.addItem("Física");
        boxFisica.addItem("Jurídica");

        lblCnpj = new JLabel("CNPJ");
        txtCnpj = new JTextField("00.000.000/0001-00");

        lblRg = new JLabel("RG");
        txtRg = new JTextField("0000000-0");

        lblDataCadastro = new JLabel("Data de Cadastro :");
        SpinnerDateModel dateModel = new SpinnerDateModel();
        spinCadastro = new JSpinner(dateModel);
        Calendar calendar = new GregorianCalendar(2000, Calendar.JANUARY, 1);
        spinCadastro.setValue(calendar.getTime());

        panelEndereco = new JPanel();
        panelEndereco.setBorder(BorderFactory.createTitledBorder("Endereço"));
        panelEndereco.setLayout(null);

        lblEndereco = new JLabel("Logradouro");
        txtEndereco = new JTextField("Rua churusbago");

        lblNumeroEnd = new JLabel("Número");
        txtNumero = new JTextField("125");

        lblComplemento = new JLabel("Complemento");
        txtComplemento = new JTextField("casa 3");

        lblBairro = new JLabel("Bairro");
        txtbairro = new JTextField("depois de ali");

        lblCidade = new JLabel("Cidade");
        txtCidade = new JTextField("São Paulo");

        lblUf = new JLabel("UF");
        boxUf = new JComboBox<>();
        boxUf.addItem("RJ");
        boxUf.addItem("SP");
        boxUf.addItem("MG");
        boxUf.addItem("RS");
        boxUf.addItem("RO");
        boxUf.addItem("AC");
        boxUf.addItem("AM");
        boxUf.addItem("RR");
        boxUf.addItem("PA");
        boxUf.addItem("AP");
        boxUf.addItem("TO");
        boxUf.addItem("MA");
        boxUf.addItem("PI");
        boxUf.addItem("CE");
        boxUf.addItem("RN");
        boxUf.addItem("PB");
        boxUf.addItem("PE");
        boxUf.addItem("AL");
        boxUf.addItem("SE");
        boxUf.addItem("BA");
        boxUf.addItem("ES");
        boxUf.addItem("PR");
        boxUf.addItem("SC");
        boxUf.addItem("MS");
        boxUf.addItem("MT");
        boxUf.addItem("GO");
        boxUf.addItem("DF");

        lblCep = new JLabel("CEP :");
        txtCep = new JTextField("00000-000");

        panelContato = new JPanel();
        panelContato.setBorder(BorderFactory.createTitledBorder("Contato"));
        panelContato.setLayout(null);

        lblContato = new JLabel("Contato");
        txtContato = new JTextField("(xx) xxxx-xxxx");

        lblTelefone1 = new JLabel("Telefone 1");
        txtTelefone1 = new JTextField("(xx) xxxx-xxxx");

        lblTelefone2 = new JLabel("Telefone 2");
        txtTelefone2 = new JTextField("(xx) xxxx-xxxx");

        lblCelular = new JLabel("Celular");
        txtCelular = new JTextField("(xx) xxxxx-xxxx");

        lblSite = new JLabel("Site");
        txtSite = new JTextField("www.cafeecia.com.br");

        lblEmail = new JLabel("Email");
        txtEmail = new JTextField("clodoaldo_silva@gmail.com");

        lblAtivo = new JLabel("Fornecedor");
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

    public void adicionarFornecedor() {
        add(lblTitulo);

        panelDadosGerais.add(lblNome);
        panelDadosGerais.add(txtNome);
        panelDadosGerais.add(lblFantasia);
        panelDadosGerais.add(txtFantasia);
        panelDadosGerais.add(lblFisica);
        panelDadosGerais.add(boxFisica);
        panelDadosGerais.add(lblCnpj);
        panelDadosGerais.add(txtCnpj);
        panelDadosGerais.add(lblRg);
        panelDadosGerais.add(txtRg);
        panelDadosGerais.add(lblDataCadastro);
        panelDadosGerais.add(spinCadastro);

        add(panelDadosGerais);

        panelEndereco.add(lblEndereco);
        panelEndereco.add(txtEndereco);
        panelEndereco.add(lblNumeroEnd);
        panelEndereco.add(txtNumero);
        panelEndereco.add(lblComplemento);
        panelEndereco.add(txtComplemento);
        panelEndereco.add(lblBairro);
        panelEndereco.add(txtbairro);
        panelEndereco.add(lblCidade);
        panelEndereco.add(txtCidade);
        panelEndereco.add(lblUf);
        panelEndereco.add(boxUf);
        panelEndereco.add(lblCep);
        panelEndereco.add(txtCep);

        add(panelEndereco);

        panelContato.add(lblContato);
        panelContato.add(txtContato);
        panelContato.add(lblTelefone1);
        panelContato.add(txtTelefone1);
        panelContato.add(lblTelefone2);
        panelContato.add(txtTelefone2);
        panelContato.add(lblCelular);
        panelContato.add(txtCelular);
        panelContato.add(lblSite);
        panelContato.add(txtSite);
        panelContato.add(lblEmail);
        panelContato.add(txtEmail);
        panelContato.add(lblAtivo);
        panelContato.add(boxAtivo);

        add(panelContato);

        add(btnCadastrar);
        add(btnConsultar);
        add(btnExcluir);

    }

    public void posicionarFornecedor() {
        lblTitulo.setBounds(7, 5, 300, 30);

        panelDadosGerais.setBounds(9, 45, 480, 180);
        lblNome.setBounds(10, -18, 200, 100);
        txtNome.setBounds(10, 42, 200, 20);
        lblFantasia.setBounds(230, -18, 200, 100);
        txtFantasia.setBounds(230, 42, 200, 20);
        lblFisica.setBounds(10, -12, 200, 200);
        boxFisica.setBounds(10, 98, 100, 20);
        lblCnpj.setBounds(125, 78, 200, 20);
        txtCnpj.setBounds(125, 98, 170, 20);
        lblRg.setBounds(310, 78, 200, 20);
        txtRg.setBounds(310, 98, 120, 20);
        lblDataCadastro.setBounds(10, 140, 125, 20);
        spinCadastro.setBounds(130, 140, 125, 20);

        panelEndereco.setBounds(9, 230, 480, 180);
        lblEndereco.setBounds(10, -18, 200, 100);
        txtEndereco.setBounds(10, 42, 170, 20);
        lblNumeroEnd.setBounds(197, -18, 200, 100);
        txtNumero.setBounds(197, 42, 90, 20);
        lblComplemento.setBounds(310, -18, 200, 100);
        txtComplemento.setBounds(310, 42, 140, 20);
        lblBairro.setBounds(10, -12, 200, 200);
        txtbairro.setBounds(10, 98, 160, 20);
        lblCidade.setBounds(187, -12, 200, 200);
        txtCidade.setBounds(187, 98, 150, 20);
        lblUf.setBounds(357, -12, 200, 200);
        boxUf.setBounds(357, 98, 70, 20);
        lblCep.setBounds(10, 140, 125, 20);
        txtCep.setBounds(50, 140, 140, 20);

        panelContato.setBounds(9, 415, 600, 120);
        lblContato.setBounds(10, -18, 200, 100);
        txtContato.setBounds(10, 42, 130, 20);
        lblTelefone1.setBounds(160, -18, 200, 100);
        txtTelefone1.setBounds(160, 42, 130, 20);
        lblTelefone2.setBounds(310, -18, 200, 100);
        txtTelefone2.setBounds(310, 42, 130, 20);
        lblCelular.setBounds(460, -18, 200, 100);
        txtCelular.setBounds(460, 42, 130, 20);
        lblSite.setBounds(10, 24, 200, 100);
        txtSite.setBounds(10, 84, 190, 20);
        lblEmail.setBounds(220, 24, 200, 100);
        txtEmail.setBounds(220, 84, 190, 20);
        lblAtivo.setBounds(430, 24, 200, 100);
        boxAtivo.setBounds(430, 84, 100, 20);

        btnCadastrar.setBounds(530, 60, 140, 30);
        btnConsultar.setBounds(530, 120, 140, 30);
        btnExcluir.setBounds(530, 180, 140, 30);

    }

}
