package br.com.bitbank.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtendimentoFrm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtendimentoFrm frame = new AtendimentoFrm();
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
	public AtendimentoFrm() {
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
		
		JButton button = new JButton("Logout");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LoginFrm frame = new LoginFrm();
				frame.setVisible(true);
			}
		});
		button.setForeground(Color.YELLOW);
		button.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button.setBackground(Color.BLUE);
		
		JButton button_1 = new JButton("Atendimento");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AtendimentoFrm frame = new AtendimentoFrm();
				frame.setVisible(true);
			}
		});
		button_1.setForeground(Color.YELLOW);
		button_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_1.setBackground(Color.BLUE);
		
		JButton button_2 = new JButton("Comprovante");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ComprovanteFrm frame = new ComprovanteFrm();
				frame.setVisible(true);
			}
		});
		button_2.setForeground(Color.YELLOW);
		button_2.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_2.setBackground(Color.BLUE);
		
		JButton button_3 = new JButton("Recarga");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RecargaFrm frame = new RecargaFrm();
				frame.setVisible(true);
			}
		});
		button_3.setForeground(Color.YELLOW);
		button_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_3.setBackground(Color.BLUE);
		
		JButton btnEmprstimo = new JButton("Empr\u00E9stimo");
		btnEmprstimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				EmprestimoFrm frame = new EmprestimoFrm();
				frame.setVisible(true);
			}
		});
		btnEmprstimo.setForeground(Color.YELLOW);
		btnEmprstimo.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnEmprstimo.setBackground(Color.BLUE);
		
		JButton button_5 = new JButton("Pagamento");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				PagamentoFrm frame = new PagamentoFrm();
				frame.setVisible(true);
			}
		});
		button_5.setForeground(Color.YELLOW);
		button_5.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_5.setBackground(Color.BLUE);
		
		JButton btnTransferncia = new JButton("Transfer\u00EAncia");
		btnTransferncia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TransferenciaFrm frame = new TransferenciaFrm();
				frame.setVisible(true);
			}
		});
		btnTransferncia.setForeground(Color.YELLOW);
		btnTransferncia.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnTransferncia.setBackground(Color.BLUE);
		
		JButton btnExtrato = new JButton("Extrato");
		btnExtrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ExtratoFrm frame = new ExtratoFrm();
				frame.setVisible(true);
			}
		});
		btnExtrato.setForeground(Color.YELLOW);
		btnExtrato.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnExtrato.setBackground(Color.BLUE);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 179, Short.MAX_VALUE)
				.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(btnEmprstimo, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(btnTransferncia, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(btnExtrato, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 425, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnExtrato, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnTransferncia, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnEmprstimo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
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
		panel_3.setBackground(Color.BLACK);
		
		JLabel lblAtendimento = new JLabel("Atendimento");
		lblAtendimento.setToolTipText("");
		lblAtendimento.setForeground(Color.WHITE);
		lblAtendimento.setFont(new Font("Arial Black", Font.PLAIN, 30));
		panel_3.add(lblAtendimento);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JLabel lblNewLabel = new JLabel("0800 0000 8888");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JLabel lblBitbankbitbankcom = new JLabel("bitbank@bitbank.com");
		lblBitbankbitbankcom.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JLabel lblChat = new JLabel("Chat:");
		lblChat.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JLabel lblCliqueAqui = new JLabel("Clique aqui");
		lblCliqueAqui.setForeground(new Color(0, 0, 255));
		lblCliqueAqui.setFont(new Font("Arial Black", Font.PLAIN, 15));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(80)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail)
								.addComponent(lblTelefone)
								.addComponent(lblChat)))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(80)
							.addComponent(lblBitbankbitbankcom))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(86)
							.addComponent(lblCliqueAqui)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
					.addGap(52)
					.addComponent(lblTelefone)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblBitbankbitbankcom)
					.addGap(18)
					.addComponent(lblChat)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblCliqueAqui)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 748, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
