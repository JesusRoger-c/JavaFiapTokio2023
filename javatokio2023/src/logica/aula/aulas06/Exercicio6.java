package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua data de nascimento: ");
		int nascimento = entrada.nextInt();
		
		if(nascimento <= 2005) {
			System.out.println("Voto obrigatorio");
		}else if(nascimento > 2005 && nascimento <=2007) {
			System.out.println("voto opcional");
		}else {
		System.out.println("voto proibido");
		}
	}
}

