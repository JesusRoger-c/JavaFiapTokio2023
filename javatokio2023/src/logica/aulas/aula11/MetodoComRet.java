package logica.aulas.aula11;

public class MetodoComRet {
	
	// METODO COM RETORNO
	
	
	static int somar(int a, int b) {
		int soma = a + b;
		return soma;
	}

	public static void main(String[] args) {
		
		int ValorSoma = somar(2,100);
		System.out.println(ValorSoma);
		
	
		//somar(3,8);
	}

}
