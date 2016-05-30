package br.com.bitbank.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.bitbank.entidade.Conta;
import br.com.bitbank.jdbc.ContaDao;

public class Desenvolvendo implements ActionListener{
	
	private LoginFrm loginFrm;
	private ContaDao contatoDao;
		
	public Desenvolvendo(LoginFrm loginFrm) {
		super();
		this.loginFrm = loginFrm;
	}
	public void loginFrm() {
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
	}

}
