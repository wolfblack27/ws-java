package entities;

public class Triangulo {

	public double a,b,c;

	public double area() {

		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	@Override
	public String toString() {
		return "Triangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}

/*
 *variaveis do tipo public podem ser acessadas de qualquer classe do projeto
 * 
 * */
