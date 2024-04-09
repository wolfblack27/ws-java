package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Usando o if
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}else {
			System.out.println("Caso não atenda a solicitação");
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
	
		//Usando Switch
		
		
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
		dia = "domingo";
		break;
		case 2:
		dia = "segunda";
		break;
		case 3:
		dia = "terca";
		break;
		case 4:
		dia = "quarta";
		break;
		case 5:
		dia = "quinta";
		break;
		case 6:
		dia = "sexta";
		break;
		case 7:
		dia = "sabado";
		break;
		default:
		dia = "valor invalido";
		break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	
	
	
	}

}
/* Estrutura condicional Simples:
 * 
 * if ( <condição> ) {
		<comando 1>
		<comando 2>
}

 * Estrutura condicional Composta
 * 
 * if ( <condição> ) {
		<comando 1>
		<comando 2>
	}
	else {
		<comando 3>
		<comando 4>
	}
 * 
 * */
 