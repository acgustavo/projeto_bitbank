package br.com.bitbank.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.bitbank.entidade.Cliente;
import br.com.bitbank.entidade.ContaCorrente;
import br.com.bitbank.jdbc.ClienteDao;

public class AberturaContaFrm extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAno;
	private JTextField textEndereco;
	private JTextField textEmail;
	private JTextField textNConta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AberturaContaFrm frame = new AberturaContaFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AberturaContaFrm() {
		setTitle("Abertura de Conta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(12))
		);
		
		JLabel lblNewLabel_1 = new JLabel("Abertura de Conta");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(Color.WHITE);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblBitbanl = new JLabel("Bitbank");
		lblBitbanl.setForeground(Color.YELLOW);
		lblBitbanl.setFont(new Font("Arial Black", Font.PLAIN, 40));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.WHITE));
		panel_3.setForeground(Color.BLACK);
		panel_3.setBackground(Color.BLUE);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(12)
					.addComponent(lblBitbanl, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(564, Short.MAX_VALUE))
				.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBitbanl, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btLogin = new JButton("Login");
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LoginFrm frame = new LoginFrm();
				frame.setVisible(true);
			}
		});
		btLogin.setBackground(Color.BLUE);
		btLogin.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btLogin.setForeground(Color.YELLOW);
		
		JButton btAberturaConta = new JButton("AberturaConta");
		btAberturaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AberturaContaFrm frame = new AberturaContaFrm();
				frame.setVisible(true);
			}
		});
		btAberturaConta.setBackground(Color.BLUE);
		btAberturaConta.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btAberturaConta.setForeground(Color.YELLOW);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(Color.BLUE);
		button_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_1.setForeground(Color.YELLOW);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.BLUE);
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_2.setForeground(Color.YELLOW);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.BLUE);
		button_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_3.setForeground(Color.YELLOW);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.BLUE);
		button_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_4.setForeground(Color.YELLOW);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.BLUE);
		button_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_5.setForeground(Color.YELLOW);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.BLUE);
		button_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_6.setForeground(Color.YELLOW);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(button_6, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(btAberturaConta, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(btLogin, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btLogin, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btAberturaConta, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textNome = new JTextField();
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textDia = new JTextField();
		textDia.setColumns(10);
		
		JLabel label = new JLabel("/");
		label.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		JLabel label_1 = new JLabel("/");
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textMes = new JTextField();
		textMes.setColumns(10);
		
		textAno = new JTextField();
		textAno.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		JButton btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ContaCorrente conta = new ContaCorrente();
				Cliente cliente = new Cliente();
				ClienteDao dao = new ClienteDao();
				
				cliente.setNome(textNome.getText());
				cliente.setCpf(textCpf.getText());
				cliente.setDataNascimento(new GregorianCalendar(textAno.getX(),textMes.getX(),textDia.getX()));
				cliente.setEndereco(textEndereco.getText());
				cliente.setEmail(textEmail.getText());
				conta.setAgencia("0518");
				conta.setnConta(textNConta.getText());
				conta.setValor(new BigDecimal("0.00"));
				conta.setCliente(cliente);
				
				cliente.getContas().add(conta);
				dao.adiciona(cliente);
				
				setVisible(false);
				LoginFrm frame = new LoginFrm();
				frame.setVisible(true);
				
			}
		});
		
		JButton btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNome.setText("");
				textCpf.setText("");
				textDia.setText("");
				textMes.setText("");
				textAno.setText("");
				textEndereco.setText("");
				textEmail.setText("");
				textNConta.setText("");
				
			}
		});
		
		JLabel lblNumeroDaConta = new JLabel("Numero Da Conta:");
		lblNumeroDaConta.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textNConta = new JTextField();
		textNConta.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNome)
							.addContainerGap(494, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblCpf)
								.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textDia, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textMes, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textAno, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblDataDeNascimento))
							.addGap(66))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEmail)
							.addContainerGap(496, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
							.addGap(229))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNumeroDaConta)
							.addContainerGap(391, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textNConta, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
									.addComponent(btLimpar)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btCadastrar))
								.addComponent(textNome, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
								.addComponent(textEndereco, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblEndereo)
							.addContainerGap(460, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNome)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblCpf)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addComponent(lblEndereo))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblDataDeNascimento)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textMes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(textAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(label)
								.addComponent(textDia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNumeroDaConta)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btCadastrar)
								.addComponent(btLimpar))
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textNConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
