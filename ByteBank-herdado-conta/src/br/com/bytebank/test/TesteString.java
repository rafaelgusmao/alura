package br.com.bytebank.test;
//atualização

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";
		
		
	
		System.out.println(nome.length());
		
		for(int i =0; i<nome.length();i++){
			System.out.println(nome.charAt(i));
		}
		
		int i = nome.indexOf("ur");
		
		System.out.println(i);
		
		String sub = nome.substring(1); // extraiu a partir da posição 1
		System.out.println(sub);
		
		char c = nome.charAt(0);
		System.out.println(c);
			
		
		String outra = nome.replace("A", "a");
		
		 //String outra = nome.toUpperCase();
		
		System.out.println("outra: " + outra);
		System.out.println("nome: " + nome);
		
		
		

	}

}
