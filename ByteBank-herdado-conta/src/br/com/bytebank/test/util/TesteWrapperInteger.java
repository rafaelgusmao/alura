package br.com.bytebank.test.util;

import java.util.ArrayList;
import java.util.*;


public class TesteWrapperInteger {

	public static void main(String[] args) {
		int idades[] = new int[5];
		String[] nomes = new String[5];
		List<Integer> numeros = new ArrayList<Integer>();  // Integer -> Objeto  -- int -> Referencia (Tipo Primitivo)
		
		Integer num1 = new Integer(29); // Orientaçao a Objeto - Criei o objeto e atribui um valor a ele
		
		Integer num2 = Integer.valueOf(29);  // Forma Orientada a Objetos de se fazer atualmente. 
		
		Integer int2 = num2.intValue();
		
		
		int idade = 29;  // Tipo primitivo que não é OO
		numeros.add(num1); // Orientaçao a Objeto
		numeros.add(num2);
		
		System.out.println(num2);
		System.out.println(int2);
	
		System.out.println(num2 == int2);
		
	
	}
}
