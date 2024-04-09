package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);//coloca o . como separador
		
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.printf("Numero digitado: %.2f%n",x);
		
	}

}
/*Para obter a entrada de dados:
 * usamos a classe Scanner que consome recursos, por isso loago apos 
 * a sua inicialização é recomendado fecha-la
 *
 * Scanner sc = new Scanner(System.in)
 * 
 * fazer algo....
 * 
 * sc.close();
 * 
 * Padrao:
 * • Scanner
   • next() // para String
   • nextInt() // para inteiros
   • nextDouble() // para double
   • next().charAt(0) // para caracter somente
 * */
 