package logica.aula.aulas05;

import java.util.Scanner;

public class Cadastro02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("insira seu nome: ");
		String nome = entrada.nextLine();
		

		
		System.out.println("selecione o genero \n [M] \n [F] \n [O] \n [N] ");
		
		
		char genero = entrada.nextLine().charAt(0);
		
		System.out.println("Ola, " + nome + "!" + " " + "voce escolheu a seguinte opcao de genero:" + " " + genero  );
		
		
		
	}

}
