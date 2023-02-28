/*
 
Exercício 06
 
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:

a) A área do triângulo retângulo que tem A por base e C por altura.
b) A área do círculo de raio C. (pi = 3.14159)
c) A área do trapézio que tem A e B por bases e C por altura.
d) A área do quadrado que tem lado B.
e) A área do retângulo que tem lados A e B.

*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de A:");
		double A = sc.nextDouble();
		System.out.println("Insira o valor de B:");
		double B = sc.nextDouble();
		System.out.println("Insira o valor de C:");
		double C = sc.nextDouble();
		
		double areaDoTriangulo = (A * C) / 2;
		double areaDoCirculo = 3.14159 * Math.pow(C,2);
		double areaDoTrapezio = ((A + B) * C) / 2;
		double areaDoQuadrado = Math.pow(B, 2);
		double areaDoRetangulo = A * B;
		
		System.out.printf("A área do triângulo é %.3f%n", areaDoTriangulo);
		System.out.printf("A área do círculo é %.3f%n", areaDoCirculo);
		System.out.printf("A área do trapézio é %.3f%n", areaDoTrapezio);
		System.out.printf("A área do quadrado %.3f%n", areaDoQuadrado);
		System.out.printf("A área do retângulo é %.3f%n", areaDoRetangulo);
				
		sc.close();
	}

}
