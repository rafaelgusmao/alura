package br.com.bytebank.test;

import br.com.bytebank.modelo.CalculadorDeImposto;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(1650, 319215);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto cdi = new CalculadorDeImposto();
		
		cc.deposita(100.00);
		
		cdi.registro(cc);
		cdi.registro(seguro);
		
		System.out.println(cdi.getTotalImposto());
		
		
	}

}
