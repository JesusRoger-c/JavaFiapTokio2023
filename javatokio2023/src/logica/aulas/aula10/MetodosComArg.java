package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
	//METODOS SEM RETORNO COM ARGUMENTOS/PARAMETROS
	
	static void SaudacaoArg(String nome, int idade) {
		if(idade >=18) {
			System.out.printf("maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nomeDigitado = sc.nextLine();
		
		System.out.println("digite sua idade: ");
		int idadeDigitada = sc.nextInt();
		
		SaudacaoArg(nomeDigitado, idadeDigitada);
		
		sc.close();


	}

}
