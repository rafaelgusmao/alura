package br.com.bytebank.test;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardadorDeContas;

public class TesteGuardaConta {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(1650, 65554);
		guardador.adicionar(cc);
		
		Conta cc2 = new ContaCorrente(1650, 65554);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		
		System.out.println(ref.getNumero());
		System.out.println(ref);

	}

}
