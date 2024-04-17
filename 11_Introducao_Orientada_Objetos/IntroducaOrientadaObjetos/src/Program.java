

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		//Primeiro exemplo Triangulo sem mebros estaticos:
		
		/*Triangulo x,y; 
		x= new Triangulo();
		y = new Triangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		System.out.println(x.toString());
		System.out.printf("valor da area de x: %.2f%n",x.area());
		System.out.println(y.toString());
		System.out.printf("valor da area de y: %.2f%n",y.area());
		sc.close();*/
		
		//Segundo Exemplo TV:
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	
	}






}
/*
 * Variaveis publicas dentro de classes podem ser acessadas de qualquer lugar do projeto
 * elas não são privadas.
 * */
 