package br.com.bitbank.teste;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import br.com.bitbank.entidade.Cliente;
import br.com.bitbank.entidade.ContaCorrente;
import br.com.bitbank.jdbc.ClienteDao;

public class TesteCriaConta {

//	private static Scanner in;

	public static void main(String[] args) {
		
//		in = new Scanner(System.in);
//		Cliente cliente = new Cliente();
//		
//		System.out.println("Digite seu nome: ");
//		cliente.setNome(in.nextLine());
//		
//		System.out.println("Digite sua data de nascimento: ");
//		int x=in.nextInt();
//		int y=in.nextInt();
//		int z=in.nextInt();
//		cliente.setDataNascimento(Calendar.GregorianCalendar(z, y, x));
//		
//		System.out.println("Digite seu email: ");
//		cliente.setEmail(in.nextLine());
		
		Cliente cliente = new Cliente("Joao", "J@j.com", "Rua b...", new GregorianCalendar(2000, 01, 01), "111.111.111-11");

		ContaCorrente conta = new ContaCorrente("0518", "2222222222222", new BigDecimal("100.00"), cliente);
		cliente.getContas().add(conta);
		
		ClienteDao dao = new ClienteDao();
		dao.adiciona(cliente);
		
//		Cliente cliente = new Cliente("Gustavo", "g@G.com", "Rua...", new GregorianCalendar(1995, 07, 16), "000.000.000-00");
//
//		ContaCorrente conta = new ContaCorrente("0518", "000000222", new BigDecimal("50.00"), cliente);
//		cliente.getContas().add(conta);
//		
//		ClienteDao dao = new ClienteDao();
//		dao.adiciona(cliente);
	}
}