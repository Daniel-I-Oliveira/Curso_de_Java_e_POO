/*

Exercício 09

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro:");
		int A = sc.nextInt();
		System.out.println("Insira outro número inteiro:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Os números são múltiplos");
		}
		else {
			System.out.println("Os números não são múltiplos");
		}
		
		sc.close();
	}
}