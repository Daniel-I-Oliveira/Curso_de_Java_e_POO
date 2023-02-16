/*

Exercício 02
 
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio do círculo:");
		double raioDoCirculo = sc.nextDouble();
		double areaDoCirculo = 3.14159 * Math.pow(raioDoCirculo, 2);
		System.out.printf("Área do círculo: %.4f", areaDoCirculo);
		sc.close();
	}

}
