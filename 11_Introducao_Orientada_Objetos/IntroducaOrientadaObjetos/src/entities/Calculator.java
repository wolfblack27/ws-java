package entities;

public class Calculator {

	public static final double PI=3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
/*
 *Constante de classe temos que definir  public static final <tipo> <nomevariavel> 
 *
 *Exemplo:public static final double PI=3.14159;
 *
 *
 *Membros estaticos:
 *
 *Membros estaticos com modificador static 'não precisam de instancia para ser utiliozado podemos chamar direto da classe
 *Exemplo: Calculator.volume() -> metodo estatico
 *Exemplo: Calculator.PI -> constante de classe estatica
 * */
 