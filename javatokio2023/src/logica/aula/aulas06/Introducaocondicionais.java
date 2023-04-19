package logica.aula.aulas06;

public class Introducaocondicionais {

	public static void main(String[] args) {
		
		// ESTRUTURA CONDICIONAL SIMPLES
		
		/*
		float nota = 5;

		if (nota < 6) {
			System.out.println(nota);
		}
		*/
		
		
		
		//-------------------------------
		//ESTRUTURA CONDICIONAL COMPOSTA
		//-------------------------------
		/*
		float notaFinal = 10;
		if(notaFinal < 6) {
			System.out.println("reprovado");
		}else {
			System.out.println("Aprovado");
		}
		*/
		
		
		//----------------------------
		// ESTRUTURA ENCADEADA
		//-----------------------------
		
		
		float notaFinal = 4;
		
		if(notaFinal < 4) {
			System.out.println("Reprovado");
		}else {
			if(notaFinal < 6) {
				System.out.println("Recuperação");
			}else {
				System.out.println("Aprovado");
			}
		}
		
		
		
		
		
	}

		
		
		
}
