package br.com.bitbank.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import br.com.bitbank.entidade.Conta;
import br.com.bitbank.entidade.Movimentacao;
import br.com.bitbank.entidade.TipoLancamento;
import br.com.bitbank.entidade.TipoMovimentacao;
import br.com.bitbank.jdbc.ContaDao;

public class TransferenciaFrm extends JFrame {

	private JPanel contentPane;
	private JTextField textContaDestinatinatario;
	private JTextField textAgenciaDestinatinatario;
	private JTextField textValorTansferencia;
	private Conta contaDestinatario;
	private ContaDao contaDao = new ContaDao();
	private Conta contaLog = new Conta();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TransferenciaFrm frame = new TransferenciaFrm();
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
	public TransferenciaFrm() {
		setTitle("Transferencia");
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
		
		JButton button_4 = new JButton("Emprestimo");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				EmprestimoFrm frame = new EmprestimoFrm();
				frame.setVisible(true);
			}
		});
		button_4.setForeground(Color.YELLOW);
		button_4.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_4.setBackground(Color.BLUE);
		
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
		
		JButton button_6 = new JButton("Transferencia");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TransferenciaFrm frame = new TransferenciaFrm();
				frame.setVisible(true);
			}
		});
		button_6.setForeground(Color.YELLOW);
		button_6.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_6.setBackground(Color.BLUE);
		
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
				.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
				.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 425, Short.MAX_VALUE)
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
		panel_3.setBackground(Color.BLACK);
		
		JLabel lblTranferencia = new JLabel("Tranferencia");
		lblTranferencia.setToolTipText("");
		lblTranferencia.setForeground(Color.WHITE);
		lblTranferencia.setFont(new Font("Arial Black", Font.PLAIN, 30));
		panel_3.add(lblTranferencia);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		
		JButton button_8 = new JButton("Limpar");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textAgenciaDestinatinatario.setText("");
				textContaDestinatinatario.setText("");
				textValorTansferencia.setText("");
			}
		});
		
		JButton button_9 = new JButton("Transferir");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contaLog = contaDao.porAgenciaConta(LoginFrm.getTextAgencia().getText(), LoginFrm.getTextConta().getText());
				contaDestinatario = contaDao.porAgenciaConta(textAgenciaDestinatinatario.getText(), textContaDestinatinatario.getText());
				BigDecimal valor = new BigDecimal(textValorTansferencia.getText());
				Movimentacao movimentacaoLog = new Movimentacao();
				Movimentacao movimentacaoReceptor = new Movimentacao();
				Calendar dataMovimentacao = Calendar.getInstance();
				TipoMovimentacao tipoMovimentacao = TipoMovimentacao.TRANSFERENCIA;

				movimentacaoLog.setTipoMovimentacao(tipoMovimentacao);
				movimentacaoLog.setValor(valor.negate());
				movimentacaoLog.setDataMovimentacao(dataMovimentacao);
				movimentacaoLog.setTipoLancamento(TipoLancamento.D);
				movimentacaoLog.setHistorico("Transferencia online: " + contaDestinatario.getAgencia()
						+ " - " + contaDestinatario.getnConta() + " - "
						+ contaDestinatario.getCliente().getNome());
				movimentacaoLog.setConta(contaLog);

				movimentacaoReceptor.setTipoMovimentacao(tipoMovimentacao);
				movimentacaoReceptor.setValor(valor);
				movimentacaoReceptor.setDataMovimentacao(dataMovimentacao);
				movimentacaoReceptor.setTipoLancamento(TipoLancamento.C);
				movimentacaoReceptor.setHistorico("Transferencia online: " + contaLog.getAgencia()
						+ " - " + contaLog.getnConta() + " - " + contaLog.getCliente().getNome());
				movimentacaoReceptor.setConta(contaDestinatario);

				contaLog.getMovimentacoes().add(movimentacaoLog);
				contaDestinatario.getMovimentacoes().add(movimentacaoReceptor);
				contaLog.setValor(contaLog.getValor().subtract(valor));
				contaDestinatario.setValor(contaDestinatario.getValor().add(valor));

				ContaDao daoConta1 = new ContaDao();
				ContaDao daoConta2 = new ContaDao();

				daoConta1.altera(contaLog);
				daoConta2.altera(contaDestinatario);
				
				JOptionPane.showMessageDialog(null,TipoMovimentacao.TRANSFERENCIA.getDescricao()+ " executada com sucesso");
				
				int x;
				x=JOptionPane.showConfirmDialog( null, "deseja fazer uma nova transferencia");
				
				switch (x) {
				case 1:
					setVisible(false);
					InicialFrm frame = new InicialFrm();
					frame.setVisible(true);
					break;

				case 0:
					textAgenciaDestinatinatario.setText("");
					textContaDestinatinatario.setText("");
					textValorTansferencia.setText("");
					break;
				default:
					break;
				}		
			}
		});
		
		textContaDestinatinatario = new JTextField();
		textContaDestinatinatario.setColumns(10);
		
		JLabel lblContaDestinatario = new JLabel("Conta destinatario:");
		lblContaDestinatario.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textAgenciaDestinatinatario = new JTextField();
		textAgenciaDestinatinatario.setColumns(10);
		
		JLabel lblAgenciaDestinatario = new JLabel("Agencia destinatario:");
		lblAgenciaDestinatario.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Arial Black", Font.PLAIN, 16));
		
		textValorTansferencia = new JTextField();
		textValorTansferencia.setColumns(10);
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(405)
							.addComponent(button_8)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textAgenciaDestinatinatario)
								.addComponent(lblAgenciaDestinatario))))
					.addContainerGap())
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(textContaDestinatinatario, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
						.addComponent(lblContaDestinatario))
					.addGap(221))
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblValor)
					.addContainerGap(499, Short.MAX_VALUE))
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(textValorTansferencia, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(385, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(73)
					.addComponent(lblAgenciaDestinatario, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textAgenciaDestinatinatario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblContaDestinatario, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textContaDestinatinatario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblValor)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textValorTansferencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_9)
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
