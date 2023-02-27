/*

Exercício 05

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo1, codigo2, quantidade1, quantidade2;
	    double preco1, preco2, total;

	    System.out.printf("Insira o código da peça 1: ");
	    codigo1 = sc.nextInt();
	    System.out.printf("Insira a quantidade de peças: ");
	    quantidade1 = sc.nextInt();
	    System.out.println("Insira o valor unitário da peça 1: ");
	    preco1 = sc.nextDouble();
	    
	    System.out.printf("Insira o código da peça 2: ");
	    codigo2 = sc.nextInt();
	    System.out.printf("Insira a quantidade de peças: ");
	    quantidade2 = sc.nextInt();
	    System.out.println("Insira o valor unitário da peça 2: ");
	    preco2 = sc.nextDouble();

	    total = preco1 * quantidade1 + preco2 * quantidade2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}

}
