package estruturaRepeticao;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		int soma=0;
		int x = sc.nextInt();
		while(x!=0){
			x=sc.nextInt();
			soma+=x;
			if(x==5) {
				break;
			}
			else if(x==7) {
				System.out.println("encontrou o valor 7");
				continue;
				//não executa nada apos, e volta para o loop
			}
		}
		
		System.out.println("Terminou Laco While..............");

		for(int i=0;i<=5;i++) {
			System.out.println("Valor: "+i);
		}
		
	}//main



}

/*
 * Lacos de repetição While:
 * utilizamos não sabemos previamente quando o laco termina
 * 
 * Laco for:
 * utilizamos quando sabemos de forma previa quando o laco termina
 * 
 * Instruções:
 * break - quando encontrada ela sai imediatamente do laço
 * continue - quando encontrada a execusão é até ela e depois inicia o laco, sem sair dele
 * 
 * */
