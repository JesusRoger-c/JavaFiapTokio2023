package logica.aulas.aula07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor desejado: ");
		int valor = sc.nextInt();
		
		
		for(int i = 0; i <= 25; i++) {
			System.out.println(valor + "x" + i + "=" + (valor*i));
			
		}

	}

}
