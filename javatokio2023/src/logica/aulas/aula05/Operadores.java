package logica.aulas.aula05;

public class Operadores {

	public static void main(String[] args) {

		float num1 = 5f;
		float num2 = 2f;

		float soma = num1 + num2;
		System.out.println(soma);

		float sub = num1 - num2;
		System.out.println(sub);

		float multi = num1 * num2;
		System.out.println(multi);

		float div = num1 / num2;
		System.out.println(div);

		float resto = num1 % num2;
		System.out.println(resto);
		
		System.out.println("");

		// operadores unários (atribuição)

		int numero = 15;
		System.out.println(numero);
		
		//numero++; 
		System.out.println(++numero); //(para somar é necessário colocar
		//o "++" antes, para que seja possivel o cálculo antes de ser exibido) 
		
		
		System.out.println("");
		
		// operador de atribuição
		
		int number = 5;
		number += 5; 
		System.out.println(number);
		
		
		number -= 2;
		System.out.println(number);
	}

}
