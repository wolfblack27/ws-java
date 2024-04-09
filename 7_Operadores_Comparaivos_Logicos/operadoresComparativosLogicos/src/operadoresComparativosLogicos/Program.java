package operadoresComparativosLogicos;

public class Program {

	public static void main(String[] args) {
		
		double x =10.56;
		int y = 10;
		boolean resultado;
		
		resultado = x>y;
		
		resultado = x>y && x>10;
		System.out.println(resultado);
		
		
	}

}


/*Logica: operadores comparativos tem resultado logico
 * 
 * Operador Significado
	> 		maior
	< 		menor
	>= 		maior ou igual
	<= 		menor ou igual
	== 		igual
	!= 		diferente
 * 
 * Logico> operadores logicos tem resultado logico
 * 
 * Operador Significado
	&& 			E
	|| 			OU
	! 			NÃO
 * 
 * */
 