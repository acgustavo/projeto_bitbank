package br.com.bitbank.teste;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import br.com.bitbank.entidade.Cliente;
import br.com.bitbank.entidade.Conta;
import br.com.bitbank.entidade.ContaCorrente;
import br.com.bitbank.entidade.Movimentacao;
import br.com.bitbank.entidade.TipoLancamento;
import br.com.bitbank.entidade.TipoMovimentacao;
import br.com.bitbank.jdbc.ClienteDao;
import br.com.bitbank.jdbc.ContaDao;

public class Teste {
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int op2;
		do {
			System.out.println("Bem vindo ao bitbank");
			System.out.println("Digite a opção desejada: ");
			System.out.println("1 Para criar conta");
			System.out.println("2 Para logar conta");

			int d = in.nextInt();
			switch (d) {
			case 1:

				Cliente gustavo = new Cliente();
				gustavo.setCpf("00000");
				gustavo.setDataNascimento(new GregorianCalendar(1995, 07, 16));
				gustavo.setEmail("@@@");
				gustavo.setEndereco("rua..");
				gustavo.setNome("gustavo");

				ContaCorrente contag = new ContaCorrente();
				contag.setAgencia("0518");
				contag.setCliente(gustavo);
				contag.setnConta("003003");
				contag.setValor(new BigDecimal("100"));

				gustavo.getContas().add(contag);

				Cliente gu = new Cliente();
				gu.setCpf("1111111");
				gu.setDataNascimento(new GregorianCalendar(1995, 07, 16));
				gu.setEmail("@@@@");
				gu.setEndereco("ruuuua..");
				gu.setNome("gu1");

				ContaCorrente co = new ContaCorrente();
				co.setAgencia("0518");
				co.setCliente(gu);
				co.setnConta("113113");
				co.setValor(new BigDecimal("200"));

				gu.getContas().add(co);

				Cliente gus = new Cliente();
				gus.setCpf("222222");
				gus.setDataNascimento(new GregorianCalendar(1995, 07, 16));
				gus.setEmail("@@@@@@");
				gus.setEndereco("ruuua..");
				gus.setNome("gus");

				ContaCorrente con = new ContaCorrente();
				con.setAgencia("0518");
				con.setCliente(gus);
				con.setnConta("223223");
				con.setValor(new BigDecimal("400"));

				gus.getContas().add(con);

				ClienteDao dao = new ClienteDao();
				dao.adiciona(gustavo);

				dao.adiciona(gu);

				dao.adiciona(gus);

				break;

			case 2:

				do {
					System.out.println("digite sua agencia:");
					String agencia = in.next();
					System.out.println("digite sua conta:2");
					String nConta = in.next();
					ContaDao daoConta = new ContaDao();
					Conta contaLog = daoConta.porAgenciaConta(agencia, nConta);
					d2:do {
						
						System.out.println("Digite a opção desejada: ");
						System.out.println("1 consultar saldo");
						System.out.println("2 transferencia");
						System.out.println("3 Pagamento");
						System.out.println("4 Emprestimo");
						System.out.println("5 Recarga");
						System.out.println("6 comprovantes");
						System.out.println("7 atendimento");
						System.out.println("8 logout");
						
						int op = in.nextInt();

						switch (op) {

						case 1:
							System.out.println("seu saldo é: " + contaLog.getValor());
							break;

						case 2:
							do {
								System.out.println("digite a agenciado receptor: ");
								String agenciaReceptor = in.next();
								System.out.println("digite a conta do receptor: ");
								String nContaReceptor = in.next();
								Conta contaReceptor = daoConta.porAgenciaConta(agenciaReceptor, nContaReceptor);
								System.out.println("digite o valor a ser trensferido: ");
								BigDecimal valor = in.nextBigDecimal();

								Movimentacao movimentacaoLog = new Movimentacao();
								Movimentacao movimentacaoReceptor = new Movimentacao();
								Calendar dataMovimentacao = Calendar.getInstance();
								TipoMovimentacao tipoMovimentacao = TipoMovimentacao.TRANSFERENCIA;

								movimentacaoLog.setTipoMovimentacao(tipoMovimentacao);
								movimentacaoLog.setValor(valor);
								movimentacaoLog.setDataMovimentacao(dataMovimentacao);
								movimentacaoLog.setTipoLancamento(TipoLancamento.D);
								movimentacaoLog.setHistorico("Transferencia online: " + contaReceptor.getAgencia()
										+ " - " + contaReceptor.getnConta() + " - "
										+ contaReceptor.getCliente().getNome());
								movimentacaoLog.setConta(contaLog);

								movimentacaoReceptor.setTipoMovimentacao(tipoMovimentacao);
								movimentacaoReceptor.setValor(valor);
								movimentacaoReceptor.setDataMovimentacao(dataMovimentacao);
								movimentacaoReceptor.setTipoLancamento(TipoLancamento.C);
								movimentacaoReceptor.setHistorico("Transferencia online: " + contaLog.getAgencia()
										+ " - " + contaLog.getnConta() + " - " + contaLog.getCliente().getNome());
								movimentacaoReceptor.setConta(contaReceptor);

								contaLog.getMovimentacoes().add(movimentacaoLog);
								contaReceptor.getMovimentacoes().add(movimentacaoReceptor);
								contaLog.setValor(contaLog.getValor().subtract(valor));
								contaReceptor.setValor(contaReceptor.getValor().add(valor));

								ContaDao daoConta1 = new ContaDao();
								ContaDao daoConta2 = new ContaDao();

								daoConta1.altera(contaLog);
								daoConta2.altera(contaReceptor);

								System.out.println("deseja fazer uma nova transferencia? (1=sim/0=nao)");
								op2 = in.nextInt();
							} while (op2 == 1);

							break;

						case 3:

							System.out.println("Pagamento indisponivel no momento");
							break;

						case 4:
							System.out.println("Emprestimo indisponivel no momento");
							break;
							
						case 5:
							System.out.println("Recarga indisponivel no momento");
							break;
							
						case 6:
							System.out.println(contaLog.getMovimentacoes());
							
							
							break;
							
						case 7:
							
							System.out.println("Atendimento indisponivel no momento");
							break;
						
						case 8:
							System.out.println("sessão finalizada");
							op2 = 1;
							break d2;
						
						default:
							System.out.println("opção invalida");
							break;
						}
						System.out.println("deseja volta ao menu de opções? (1=sim/0=nao)");
						op2 = in.nextInt();
					} while (op2 == 1);

					System.out.println("deseja volta ao menu de login? (1=sim/0=nao)");
					op2 = in.nextInt();
				} while (op2 == 1);

				break;

			case 3:

				break;

			default:
				System.out.println("opção invalida");
				break;
			}
			System.out.println("deseja volta a tela principal? (1=sim/0=nao)");
			op2 = in.nextInt();
		} while (op2 == 1);
	}
}
