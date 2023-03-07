/*

Exercício 11

Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorDaConta;
		
		System.out.println("Insira o código do item:");
		int codigoDoItem = sc.nextInt();
		System.out.println("Insira a quantidade de unidades do item:");
		int quantidadeDoItem = sc.nextInt();
		
		if(codigoDoItem == 1)
			valorDaConta = 4.00 * quantidadeDoItem;
		else if(codigoDoItem == 2)
			valorDaConta = 4.50 * quantidadeDoItem;
		else if(codigoDoItem == 3)
			valorDaConta = 5.00 * quantidadeDoItem;
		else if(codigoDoItem == 4)
			valorDaConta = 2.00 * quantidadeDoItem;
		else
			valorDaConta = 1.50 * quantidadeDoItem;
		System.out.printf("Valor da conta: R$ %.2f", valorDaConta);
		
		sc.close();
		
	}

}
