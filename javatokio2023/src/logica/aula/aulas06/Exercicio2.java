package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro valor: ");
		int num1 = entrada.nextInt();
		System.out.println("Insira o segundo valor: ");
		int num2 = entrada.nextInt();
		
		
		if(num1 > num2) {
			System.out.println(num1 + " e maior que " + num2);
		}else if(num1 > num2) {
			System.out.println(num2 + " e maior que " + num1);
		}else {
			System.out.println("numeros iguais");
		}
		
		
		
		
		
		
		
		

	}

}
