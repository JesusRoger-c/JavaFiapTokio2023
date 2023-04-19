package logica.aula.aulas05;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
	
		
		double soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira nota 1:");
		double a = entrada.nextDouble();
		System.out.println("Insira nota 2:");
		double b = entrada.nextDouble();
		
		soma = a + b;
		soma = soma/2;
		System.out.println("sua media e: " + soma); 
		
		
		

	}

}
