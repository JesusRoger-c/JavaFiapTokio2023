package logica.aulas.aula07;

import java.util.Scanner;

public class Exercicio04 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor");
			int valor = sc.nextInt();
			valor = valor + valor;
			System.out.println(valor);
			
		for(int j = 0; j <= 10; j++) {
			valor = (valor + valor*10)/10;
			
		}
		System.out.println(valor);
		}
		
		
		
		
		
	}

}
