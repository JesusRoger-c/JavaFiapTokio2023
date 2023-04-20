package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("insira o valor desejado:"); 
		int valor = entrada.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println(valor + " e par");
		}else {
			System.out.println(valor + " e impar");
		}
		
		

	}

}
