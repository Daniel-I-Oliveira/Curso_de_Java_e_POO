/*
 
Exercício 01

Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor inteiro:");
		int valorInteiro01 = sc.nextInt();
		System.out.println("Insira outro valor inteiro:");
		int valorInteiro02 = sc.nextInt();
		int soma = valorInteiro01 + valorInteiro02;
		System.out.printf("Soma: %d", soma);
		
		sc.close();
	}

}
