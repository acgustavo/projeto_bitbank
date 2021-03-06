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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;

import br.com.bitbank.entidade.Conta;
import br.com.bitbank.entidade.Movimentacao;
import br.com.bitbank.entidade.TipoLancamento;
import br.com.bitbank.entidade.TipoMovimentacao;
import br.com.bitbank.jdbc.ContaDao;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import br.com.bitbank.entidade.TipoOperadora;

public class RecargaFrm extends JFrame {

	private JPanel contentPane;
	private JTextField textDdd;
	private JTextField textTelefone;
	private JTextField textValor;
	private ContaDao contaDao = new ContaDao();
	private Conta contaLog = new Conta();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecargaFrm frame = new RecargaFrm();
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
	public RecargaFrm() {
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
		
		JButton button_7 = new JButton("Extrato");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ExtratoFrm frame = new ExtratoFrm();
				frame.setVisible(true);
			}
		});
		button_7.setForeground(Color.YELLOW);
		button_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_7.setBackground(Color.BLUE);
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
				.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 425, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
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
		
		JLabel lblRecarga = new JLabel("Recarga");
		lblRecarga.setToolTipText("");
		lblRecarga.setForeground(Color.WHITE);
		lblRecarga.setFont(new Font("Arial Black", Font.PLAIN, 30));
		panel_3.add(lblRecarga);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		
		JButton button_8 = new JButton("Limpar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textDdd.setText("");
				textTelefone.setText("");
				textValor.setText("");

			}
		});
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contaLog = contaDao.porAgenciaConta(LoginFrm.getTextAgencia().getText(), LoginFrm.getTextConta().getText());
				BigDecimal valor = new BigDecimal(textValor.getText());
				Movimentacao movimentacaoLog = new Movimentacao();
				Calendar dataMovimentacao = Calendar.getInstance();
				TipoMovimentacao tipoMovimentacao = TipoMovimentacao.RECARGA;
				
				
				movimentacaoLog.setTipoMovimentacao(tipoMovimentacao);
				movimentacaoLog.setValor(valor.negate());
				movimentacaoLog.setDataMovimentacao(dataMovimentacao);
				movimentacaoLog.setTipoLancamento(TipoLancamento.D);
				movimentacaoLog.setHistorico("Recarga de celular: " + textDdd.getText()
						+ " " + textTelefone.getText());
				movimentacaoLog.setConta(contaLog);
				
				contaLog.getMovimentacoes().add(movimentacaoLog);
				contaLog.setValor(contaLog.getValor().subtract(valor));

				ContaDao daoConta1 = new ContaDao();

				daoConta1.altera(contaLog);
						
				JOptionPane.showMessageDialog(null,TipoMovimentacao.RECARGA.getDescricao()+ " executada com sucesso");
				
				int x;
				x=JOptionPane.showConfirmDialog( null, "deseja fazer uma nova Recarga");
				
				switch (x) {
				case 1:
					setVisible(false);
					InicialFrm frame = new InicialFrm();
					frame.setVisible(true);
					break;

				case 0:
					textDdd.setText("");
					textTelefone.setText("");
					textValor.setText("");
					break;
				default:
					break;
				}
				
			}
		});
		
		JComboBox comboBoxOperadora = new JComboBox();
		comboBoxOperadora.setModel(new DefaultComboBoxModel(TipoOperadora.values()));
		
		textDdd = new JTextField();
		textDdd.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		
		JLabel lblDdd = new JLabel("DDD");
		lblDdd.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		textValor = new JTextField();
		textValor.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(405, Short.MAX_VALUE)
					.addComponent(button_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnOk)
					.addContainerGap())
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(textValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
							.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
								.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
									.addComponent(textDdd, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblDdd))
								.addGap(18)
								.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
									.addComponent(lblTelefone)
									.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_panel_4.createSequentialGroup()
								.addComponent(comboBoxOperadora, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 67, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(253, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(72)
					.addComponent(comboBoxOperadora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDdd)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(textDdd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOk)
						.addComponent(button_8))
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))))
					.addContainerGap())
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
							.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
					.addGap(12))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
