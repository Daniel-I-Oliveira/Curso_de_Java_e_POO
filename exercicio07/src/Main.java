
/*

Exercício 07

Fazer um programa para ler um número inteiro e depois dizer se este número é negativo ou não.abstract

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		int numeroInteiro = sc.nextInt();
		
		if(numeroInteiro < 0)
			System.out.printf("O número que você inseriu é negativo.");
		else
			System.out.println("O número que você inseriu não é negativo.");
		
		sc.close();
	}
}