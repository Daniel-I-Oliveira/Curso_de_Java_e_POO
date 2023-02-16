/*
 
Exercício 03

Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor da variável A:");
		int A = sc.nextInt();
		System.out.println("Insira o valor da variável B:");
		int B = sc.nextInt();
		System.out.println("Insira o valor da variável C:");
		int C = sc.nextInt();
		System.out.println("Insira o valor da variável D:");
		int D = sc.nextInt();
		int diferenca = A * B - C * D;
		System.out.printf("A diferença é: %d", diferenca);
		sc.close();
	}

}
