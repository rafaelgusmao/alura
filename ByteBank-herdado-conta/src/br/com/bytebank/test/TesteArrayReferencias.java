package br.com.bytebank.test;

import br.com.bytebank.modelo.*;

public class TesteArrayReferencias {

	public static void main(String[] args) {
	
		//Conta[] contas = new Conta[5];
		
		Object[] referencias = new Object[5];  //guarda qualquer tipo de objeto
		
		ContaCorrente cc1 = new ContaCorrente(1650, 776644);
		
		referencias[0] = cc1;
	
		ContaPoupanca cc2 = new ContaPoupanca(1650, 776555);
		
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaCorrente refc = (ContaCorrente) referencias[0];
		
		System.out.println(refc.getNumero());
		
		ContaPoupanca refp = (ContaPoupanca) referencias[1]; //type cast
		
		//ContaCorrente ref = (ContaCorrente) contas[1]; //type cast
		
		System.out.println(refp.getNumero());

	}

}
