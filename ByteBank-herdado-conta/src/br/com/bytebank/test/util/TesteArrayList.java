package br.com.bytebank.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List<Conta> lista = new LinkedList<Conta>();
		
		//List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(1650, 65551);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(1650, 65552);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(1650, 65552);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println(" Já existe? " + existe);
		
		System.out.println("\n-----------------\n");
		
//		for(Conta conta : lista){	
//			if(conta.ehIgual(cc3)) {
//				System.out.println("Ja tenho esta conta \n");
//			} 
//			
//		}
//		
		
		for(Object oRef : lista){
			System.out.println(oRef);
		}

	}

}
