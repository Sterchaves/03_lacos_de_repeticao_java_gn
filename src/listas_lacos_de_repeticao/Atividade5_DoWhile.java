package listas_lacos_de_repeticao;

import java.util.Scanner;

public class Atividade5_DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number, sum = 0;
		
		System.out.println("Digite um número: ");
		number = scanner.nextInt();
		
		do{		
			if(number>0) {
				sum += number;
			}
			
			System.out.println("Digite um número: ");
			number = scanner.nextInt();
			
			if(number==0) {
				break;
			}
		}while(true);
		
		System.out.println("\nA soma dos números positivos é: "+sum);
	}
}
