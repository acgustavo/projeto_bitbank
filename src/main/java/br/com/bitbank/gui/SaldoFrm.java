package br.com.bitbank.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;

import br.com.bitbank.entidade.Conta;
import br.com.bitbank.entidade.Movimentacao;
import br.com.bitbank.jdbc.ContaDao;

public class SaldoFrm extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private ContaDao contaDao = new ContaDao();
	private Conta contaLog = new Conta();
	private Object[][] objects;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaldoFrm frame = new SaldoFrm();
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
	public SaldoFrm() {
		setTitle("Saldo");
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
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGap(0, 748, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addGap(12)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(555, Short.MAX_VALUE))
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGap(0, 86, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(panel_1, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(17, Short.MAX_VALUE)));
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

		JButton button_7 = new JButton("Saldo");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SaldoFrm frame = new SaldoFrm();
				frame.setVisible(true);
			}
		});
		button_7.setForeground(Color.YELLOW);
		button_7.setFont(new Font("Arial Black", Font.PLAIN, 15));
		button_7.setBackground(Color.BLUE);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2
				.setHorizontalGroup(
						gl_panel_2.createParallelGroup(Alignment.LEADING).addGap(0, 179, Short.MAX_VALUE)
								.addComponent(button, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179,
										Short.MAX_VALUE)
								.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addComponent(button_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179,
										Short.MAX_VALUE)
								.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addComponent(button_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179,
										Short.MAX_VALUE)
								.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
								.addComponent(button_7, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE));
		gl_panel_2
				.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGap(0, 425,
								Short.MAX_VALUE)
						.addGroup(
								gl_panel_2.createSequentialGroup().addContainerGap()
										.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(button, GroupLayout.PREFERRED_SIZE, 34,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap(14, Short.MAX_VALUE)));
		panel_2.setLayout(gl_panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);

		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setToolTipText("");
		lblSaldo.setForeground(Color.WHITE);
		lblSaldo.setFont(new Font("Arial Black", Font.PLAIN, 30));
		panel_3.add(lblSaldo);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4
				.setHorizontalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
								.addContainerGap()));
		gl_panel_4
				.setVerticalGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup().addContainerGap()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
								.addContainerGap()));

		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Arial Black", Font.PLAIN, 15));
		table.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}

			public void ancestorMoved(AncestorEvent arg0) {
			}

			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		contaLog = contaDao.porAgenciaConta(LoginFrm.getTextAgencia().getText(), LoginFrm.getTextConta().getText());
		int x = contaLog.getMovimentacoes().size();
		objects = new Object[contaLog.getMovimentacoes().size()][4];
		for (int i = 0; i < x; i++) {
			Movimentacao movimentacao = contaLog.getMovimentacoes().get(i);
			objects[i][0] = sdf.format(movimentacao.getDateDataMovimentacao());
			objects[i][1] = movimentacao.getHistorico();
			objects[i][2] = movimentacao.getValor().toEngineeringString();
			objects[i][3] = movimentacao.getTipoLancamento();
			
		}
		table.setModel(new DefaultTableModel(objects, new String[] { "Data", "Descri\u00E7\u00E3o", "Valor (R$)" }));

		scrollPane.setViewportView(table);
		panel_4.setLayout(gl_panel_4);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)
								.addGap(7)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
										.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE))))
				.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
						.addGap(12)));
		contentPane.setLayout(gl_contentPane);
	}
}
