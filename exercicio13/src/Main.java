/*

Exercício 13

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de x:");
		double x = sc.nextDouble();
		System.out.println("Insira o valor de y:");
		double y = sc.nextDouble();
		
		if(x > 0.0 && y > 0.0)
			System.out.println("O ponto pertence ao quadrante Q1");
		else if(x > 0.0 && y < 0.0)
			System.out.println("O ponto pertence ao quadrante Q4");
		else if(x < 0.0 && y > 0.0)
			System.out.println("O ponto pertence ao quadrante Q2");
		else if(x < 0.0 && y < 0.0)
			System.out.println("O ponto pertence ao quadrante Q3");
		else if((x > 0.0 || x < 0.0) && y == 0.0)
			System.out.println("O ponto está no eixo x");
		else if(x == 0.0 && (y > 0.0 || y < 0.0))
			System.out.println("O ponto está no eixo y");
		else if(x == y && y == 0)
			System.out.println("O ponto está na origem");
		
		sc.close();
		
	}
}
