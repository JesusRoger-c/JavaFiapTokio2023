package logica.aulas.aula09;

public class JogoVelha {

	public static void main(String[] args) {
		
		// Se a linha for igual a coluna, logo, é a diagonal principal [1] [1]
		
		char[][] tabuleiro = new char [3][3]; 
		tabuleiro[0][0] = 'X';
		tabuleiro[1][1] = 'O';
		tabuleiro[2][2] = 'X';
				
		System.out.println(tabuleiro[0][0]);
		System.out.println(tabuleiro[1][1]);
		System.out.println(tabuleiro[2][2]);
		
		
	}

}
