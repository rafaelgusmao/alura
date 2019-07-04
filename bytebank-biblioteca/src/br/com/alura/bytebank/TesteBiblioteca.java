package br.com.alura.bytebank;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new ContaCorrente(123, 3445);
		
		c.deposita(450.0);
		
		System.out.println(c.getSaldo());
	}

}
