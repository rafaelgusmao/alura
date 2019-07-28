package br.com.bytebank.test.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(1650, 65554);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(1650, 65554);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		//lista.remove(0);
		
		//System.out.println(lista.size());
		
		
		Conta cc3 = new ContaCorrente(1350, 56554);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(130, 33554);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++){
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("\n-----------------\n");
		
		for(Object oRef : lista){
			System.out.println(oRef);
		}

	}

}
