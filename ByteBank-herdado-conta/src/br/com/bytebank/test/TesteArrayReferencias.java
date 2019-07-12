package br.com.bytebank.test;

import br.com.bytebank.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
	
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(1650, 776644);
		
		contas[0] = cc1;
	
		ContaCorrente cc2 = new ContaCorrente(1650, 776555);
		
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		
		System.out.println(ref.getNumero());

	}

}
