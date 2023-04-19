package logica.aula.aulas05;

import java.util.Scanner;

public class MediaAluno2 {

	public static void main(String[] args) {
		
		double mp;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira nota 1:");
		double a = entrada.nextDouble();
		System.out.println("Insira nota 2:");
		double b = entrada.nextDouble();
		
		mp= (a*0.5) + (b*0.5);
		System.out.println("Sua media final e: " + mp);
		

	}

}
