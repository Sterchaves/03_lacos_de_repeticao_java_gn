package listas_lacos_de_repeticao;

import java.util.Scanner;

public class Atividade3_While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade, menorIdade = 0, maiorIdade =0;
		
		while(true) {
		System.out.println("Digite uma idade: ");
		idade = scanner.nextInt();			
					
		if(idade<21) {
			menorIdade++;
			
		}else if(idade>50) {
			maiorIdade++;
		}
		
		if(idade<0) {
			break;
		}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menorIdade);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade);
	}
}
