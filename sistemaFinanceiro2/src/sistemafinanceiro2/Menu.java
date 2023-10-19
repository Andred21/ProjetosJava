package sistemafinanceiro2;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Menu extends JFrame {

    private JMenuBar menuBar;
    private JMenu cadastro, movimentos, sair;
    private JMenuItem cliente, fornecedor, formaPagamento, usuario, venda, compra,sair2;
    private JPanel panelCorrente;

    public Menu() {
        setTitle("Gerenciamento de Compras e Vendas"); // título do frame
        setPreferredSize(new Dimension(800, 600)); // ajuste do tamanho e layout
        setLayout(null); // aqui a definicao para utilizacao de layout absoluto

        instanciarMenu();
        adicionarMenu();
        posicionarMenu();
        Eventos();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // deixa o frame visível
        pack(); // reorganiza os componentes (objetos) no frame
    }

    public void instanciarMenu() {
        menuBar = new JMenuBar();
        Border border = BorderFactory.createEtchedBorder();
        menuBar.setBorder(border);

        cadastro = new JMenu("Cadastros");
        movimentos = new JMenu("Movimentos");
        sair = new JMenu("Sair");

        cliente = new JMenuItem("Cliente");
        fornecedor = new JMenuItem("Fornecedor");
        formaPagamento = new JMenuItem("Forma de Pagamento");
        usuario = new JMenuItem("Usuário");

        venda = new JMenuItem("Venda");
        compra = new JMenuItem("Compra");
        
        sair2 = new JMenuItem("sair");
        

        panelCorrente = new JPanel();
        panelCorrente.setBackground(Color.BLACK);
        add(panelCorrente);

    }

    public void Eventos() {
        cliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(panelCorrente);
                panelCorrente = new Cliente();
                add(panelCorrente);
                revalidate();
                repaint();

            }
        });

        fornecedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(panelCorrente);
                panelCorrente = new Fornecedor();
                add(panelCorrente);
                revalidate();
                repaint();

            }
        });

        formaPagamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(panelCorrente);
                panelCorrente = new formaPgto();
                add(panelCorrente);
                revalidate();
                repaint();

            }
        });

        usuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(panelCorrente);
                panelCorrente = new Usuario();
                add(panelCorrente);
                revalidate();
                repaint();

            }
        });

        venda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(panelCorrente);
                panelCorrente = new Venda();
                add(panelCorrente);
                revalidate();
                repaint();

            }
        });

        compra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                remove(panelCorrente);
                panelCorrente = new Compra();
                add(panelCorrente);
                revalidate();
                repaint();

            }
        });

        sair2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaLogin s = new TelaLogin();
                s.setVisible(true);
                dispose();
            }
        });

    }

    public void adicionarMenu() {
        cadastro.add(cliente);
        cadastro.add(fornecedor);
        cadastro.add(formaPagamento);
        cadastro.add(usuario);

        movimentos.add(venda);
        movimentos.add(compra);
        sair.add(sair2);
        menuBar.add(cadastro);
        menuBar.add(movimentos);
        menuBar.add(sair);

        add(menuBar);

    }

    public void posicionarMenu() {
        menuBar.setBounds(0, 0, 800, 24);
    }

}
