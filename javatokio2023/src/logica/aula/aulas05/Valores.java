package logica.aula.aulas05;

public class Valores {

	public static void main(String[] args) {
	
		int num1;
		num1 = 12;
		
		double num2;
		num2 = 2679.90;
		
		float num3;
		num3 = 4.56f;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		String num4 = Integer.toString(num1);
		System.out.println("string: " + num4);
		
		String num5 = Double.toString(num2);
		System.out.println("string: " + num5);
		
		String num6 = Float.toString(num3);
		System.out.println("string: " + num6);

	}

}
