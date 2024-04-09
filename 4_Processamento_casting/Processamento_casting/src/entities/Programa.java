package entities;

public class Programa {

	public static void main(String[] args) {
		
		int a =5;
		double b =2.5;
		double resultado;
		
		resultado = (int)a*b; // faz um casting(conversão explicita) de double para inteiro
		System.out.printf("O valor de a*b: %d",resultado);
	}

}

/*
 *double com operações com int e flot o resultado é um double
 * */
 