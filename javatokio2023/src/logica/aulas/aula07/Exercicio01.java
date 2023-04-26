package logica.aulas.aula07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String i = "sim";
		while(i.equals("sim")) {
			System.out.println("Jogo finalizado");
			
			System.out.println("Deseja jogar novamente?");
			i = sc.nextLine();
			
		}
		System.out.println("Fim");
		sc.close();

	}

}
