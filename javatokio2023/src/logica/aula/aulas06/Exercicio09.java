package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite qual tipo voce faz parte:");
		int tipo = entrada.nextInt();		
		System.out.println("digite valor de consumo");
		double consumo = entrada.nextDouble();
		
		if(tipo == 1) {
			System.out.println("digite valor de consumo");
			consumo = consumo * 0.60;
		}else if (tipo == 2) {
			consumo = consumo * 0.48;
		}else {
			consumo = consumo * 1.29;
		}
		
		System.out.println("seu valor de consumo e:" + consumo);
		
		
		
		

		}
		
		

	}


