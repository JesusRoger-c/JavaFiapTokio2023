package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int v1 = entrada.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int v2 = entrada.nextInt();
		
		int valorFinal;
		valorFinal = v1 + v2;
		
		if(valorFinal % 2 == 0) {
		System.out.println("valores sao multiplos");
	   }else {
		   System.out.println("valores nao sao multiplos");
	   }
		
	}

}
