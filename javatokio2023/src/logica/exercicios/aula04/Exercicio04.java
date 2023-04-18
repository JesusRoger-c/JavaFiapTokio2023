package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		
		System.out.print("digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("olá, " + nome + ". Você tem " + idade + " anos.");
		
	}

}
