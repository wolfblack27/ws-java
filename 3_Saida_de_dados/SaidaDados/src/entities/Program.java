package entities;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // coloca o padra de saida como americano (,) usando virgula
		String nomeDaFuncao="primeiro grau";
		double x = 10.35784;
		double y= 12.2323;
		System.out.println("valor de x:"  +x); //conctena com o valor de x
		System.out.printf("valor de x: %.2f%n",x); // formata o valor de saida
		System.out.printf("valor de x: %.2f e o valor de y:%.2f%n ",x,y);
		System.out.printf("A função do %s tem valor de x: %.2f e o valor de y:%.2f ",nomeDaFuncao,x,y);

	}

}



/*
 *Saida de dados:
 *Para saida de dados temos o system ln , onde o dado sai sem formatação
 *e o system tf, o a saida de dados sai formatada
 * Formatações:
 * %n -> quebra linha
 * %.2f -> é uma mascara de formatação para definir com duas casas decimais
 * %.d-> para numeros inteiros
 * %s -> para string
 * */
 
