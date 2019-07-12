package br.com.bytebank.test;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class Teste {
		public static void main(String[] args) {
			
			ContaCorrente cc = new ContaCorrente(22, 33);
			
			ContaPoupanca cp = new ContaPoupanca(33, 22);
			
			System.out.println(cp);
			System.out.println(cc);
			
			
			
		}

}
