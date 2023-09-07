package com.es.programacion.challenges;

public class CheckPalindromo {

	public static void main(String[] args) {
		
		System.out.println(checkPalindromo("aaa"));
		System.out.println(checkPalindromo("abac"));
		System.out.println(checkPalindromo("a"));
		System.out.println(checkPalindromo("az"));
		System.out.println(checkPalindromo("abacaba"));
		System.out.println(checkPalindromo("z"));
		System.out.println(checkPalindromo("aaabaaaa"));
	}
	
	
	
	/**
	 * Dado una cadena de entrada, determina si dicha cadena es un palindromo o no
	 * @param cadena String que entra por parametros
	 * @return true si es palindromo, false si no lo es
	 */
	static boolean checkPalindromo(String cadena) {
		
		int longitud = cadena.length();
		//System.out.println(longitud/2);
		String mitad1 = cadena.substring(0, longitud/2);
		System.out.println(mitad1);
		
		String mitad2 = cadena.substring((int)Math.ceil(cadena.length()/2.0), longitud);
		System.out.println(mitad2);
		
		
		return false;
	}

}
