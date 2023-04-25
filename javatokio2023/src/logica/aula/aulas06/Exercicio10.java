package logica.aula.aulas06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite seu salario");
		double salario = entrada.nextDouble();
		
		if(salario <= 280.00) {
			salario = (salario * 0.20) + salario;
			
		}else if(salario > 280.00 && salario <= 700.00) {
			salario = (salario * 0.15) + salario;	
			
		}else if(salario > 700.00 && salario <= 1.500) {
			salario = (salario * 0.10) + salario;
			
		}else if(salario > 1.500) {
			salario = (salario * 0.05) + salario;
		}else {
			System.out.println("Valor invalido");
		}
		
		
		System.out.println("seu salario novo e:" + salario);
		
		
		
		

	}

}
