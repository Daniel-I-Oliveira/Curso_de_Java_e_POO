/*
 
Exercício 04
 
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o número do funcionário:");
		int numeroDoFuncionario = sc.nextInt();
		System.out.println("Informe o número de horas trabalhadas pelo funcionário:");
		int numeroDeHorasTrabalhadas = sc.nextInt();
		System.out.println("Informe o valor que o funcionário recebe por hora:");
		double valorHora = sc.nextDouble();
		double salario = numeroDeHorasTrabalhadas * valorHora;
		System.out.printf("Número do funcionário: %d%n", numeroDoFuncionario);
		System.out.printf("Salário: R$ %.2f", salario);
		sc.close();
	}

}
