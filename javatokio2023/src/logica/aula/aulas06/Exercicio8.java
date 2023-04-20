package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de combustivel: ");
		double combustivel = entrada.nextDouble();
		System.out.println("insira os quilometros rodados: ");
		double km = entrada.nextDouble();
		
		
		double resultado1 = km /combustivel;
		System.out.println(resultado1 + " km/l");
		
		if(resultado1 < 8) {
			System.out.println("eita, esse carro bebe em");
		}else {
			System.out.println("Autonomia legal!!");
		}
		
		

	}

}
