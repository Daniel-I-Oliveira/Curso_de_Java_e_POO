/*

Exercício 12

Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		double valor = sc.nextDouble();
		
		if(valor >= 0 && valor <= 25)
			System.out.printf("O número digitado está no intervalo [0,25]");
		else if(valor > 25 && valor <= 50)
			System.out.printf("O número digitado está no intervalo [25,50]");
		else if(valor > 50 && valor <= 75)
			System.out.printf("O número digitado está no intervalo [50,75]");
		else if(valor > 75 && valor <= 100)
			System.out.printf("O número digitado está no intervalo [75,100]");
		else
			System.out.println("O número digitado esta fora de intervalo");
		
		sc.close();
		
	}
}