
/*

Exercício 08

Fazer um programa que lê um número inteiro e informa se ele é par ou ímpar.import

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		int numeroInteiro = sc.nextInt();
		
		if(numeroInteiro % 2 == 0)
			System.out.println("O número inserido é par");
		else
			System.out.println("O número inserido é ímpar");
		
		sc.close();
	}

}
