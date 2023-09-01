package listas_lacos_de_repeticao;

import java.util.Scanner;

public class Atividade1_For {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float number1, number2;
		
		System.out.println("\n Digite o primeiro número do intervalo: ");
		number1 = scanner.nextFloat();
		
		System.out.println("\n Digite o último número do intervalo: ");
		number2 = scanner.nextFloat();
		
		if(number1<number2) {
			System.out.println("\nNo intervalo entre " + number1 +" e " + number2 + ":");
			for(float i = number1; i <= number2; i++) {
				if(i%3==0 && i%5==0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			};
			
		}else{
			System.out.println("Intervalo inválido!");
		}
	}
}
