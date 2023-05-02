package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
	//METODOS SEM RETORNO E SEM PARAMENTOS
	
	static void saudacao() {
		System.out.println("Bem vindo ao programa");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("digite sua idade: ");
		int idade = sc.nextInt();
		
		System.out.printf("ola, %s! voce %d anos \n", nome, idade);
		
		if(idade >= 18) {
			System.out.println("maior de idade");
		}else {
			System.out.println("menor de idade");
		}
			
	}

	public static void main(String[] args) {
	
		saudacao();
		saudacao();
		//executa duas vezes, posso usar o for
		
		

	}

}
