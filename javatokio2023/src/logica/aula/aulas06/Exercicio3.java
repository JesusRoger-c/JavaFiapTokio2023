package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira nota 1: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Insira nota 2: ");
		double nota2 = entrada.nextDouble();
		System.out.println("Insira nota 3: ");
		double nota3 = entrada.nextDouble();
		System.out.println("Insira nota 4: ");
		double nota4 = entrada.nextDouble();
		
		double media;
		media = nota1 + nota2 + nota3 + nota4;
		media = media/4;
		
		if(media >= 7.0) {
		System.out.println("Parabéns, voce foi aprovado!");	
		}else if (media >= 5.0 && media <= 7.0) {
			System.out.println("Recuperacao...");
		}else {
			System.out.println("Reprovado :( ");
		}
		
		
		
		

	}

}
