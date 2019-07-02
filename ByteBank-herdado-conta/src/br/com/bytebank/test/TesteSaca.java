package br.com.bytebank.test;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(1234, 5678);
		
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());

	}

}
