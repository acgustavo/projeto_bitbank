package br.com.bitbank.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import br.com.bitbank.entidade.Conta;
import br.com.bitbank.jdbc.ContaDao;

public class LoginFrm extends JFrame {

	private JPanel contentPane;
	private static JTextField textConta;
	private static JTextField textAgencia;
	public Conta contaLog = new Conta();


	public static JTextField getTextConta() {
		return textConta;
	}

	public void setTextConta(JTextField textConta) {
		this.textConta = textConta;
	}

	public static JTextField getTextAgencia() {
		return textAgencia;
	}

	public void setTextAgencia(JTextField textAgencia) {
		this.textAgencia = textAgencia;
	}

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrm frame = new LoginFrm();
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
	public LoginFrm() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		JLabel label = new JLabel("Bitbank");
		label.setForeground(Color.YELLOW);
		label.setFont(new Font("Arial Black", Font.PLAIN, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new LineBorder(Color.WHITE));
		panel_1.setBackground(Color.BLUE);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 748, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(555, Short.MAX_VALUE))
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 86, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		
		JButton button = new JButton("");
		button.setForeground(Color.YELLOW);
		button.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button.setBackground(Color.BLUE);
		
		JButton button_1 = new JButton("");
		button_1.setForeground(Color.YELLOW);
		button_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_1.setBackground(Color.BLUE);
		
		JButton button_2 = new JButton("");
		button_2.setForeground(Color.YELLOW);
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_2.setBackground(Color.BLUE);
		
		JButton button_3 = new JButton("");
		button_3.setForeground(Color.YELLOW);
		button_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_3.setBackground(Color.BLUE);
		
		JButton button_4 = new JButton("");
		button_4.setForeground(Color.YELLOW);
		button_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_4.setBackground(Color.BLUE);
		
		JButton button_5 = new JButton("");
		button_5.setForeground(Color.YELLOW);
		button_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_5.setBackground(Color.BLUE);
		
		JButton button_6 = new JButton("AberturaConta");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AberturaContaFrm frame = new AberturaContaFrm();
				frame.setVisible(true);
			}
		});
		button_6.setForeground(Color.YELLOW);
		button_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_6.setBackground(Color.BLUE);
		
		JButton button_7 = new JButton("Login");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LoginFrm frame = new LoginFrm();
				frame.setVisible(true);
			}
		});
		button_7.setForeground(Color.YELLOW);
		button_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_7.setBackground(Color.BLUE);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		
		JLabel lblConta = new JLabel("Conta:");
		lblConta.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textConta = new JTextField();
		textConta.setColumns(10);
		
		JLabel lblAgencia = new JLabel("Agencia:");
		lblAgencia.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		JButton button_8 = new JButton("Limpar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAgencia.setText("");
				textConta.setText("");
			}
		});
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContaDao daoConta = new ContaDao();
				contaLog = daoConta.porAgenciaConta(textAgencia.getText(), textConta.getText());
				
				setVisible(false);
				InicialFrm frame = new InicialFrm();
				frame.setVisible(true);
			}
		});
		
		textAgencia = new JTextField();
		textAgencia.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(button_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEntrar)
							.addContainerGap())
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblAgencia)
								.addComponent(textAgencia, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
							.addGap(54)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(textConta, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConta))
							.addContainerGap(69, Short.MAX_VALUE))))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(87)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAgencia)
						.addComponent(lblConta))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textConta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textAgencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEntrar)
						.addComponent(button_8))
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.BLACK);
		
		JLabel label_9 = new JLabel("Abertura de Conta");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Arial Black", Font.PLAIN, 30));
		panel_4.add(label_9);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
					.addGap(12))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
