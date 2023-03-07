/*
 
 Exercício 10
 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a hora inicial do jogo:");
		int horaInicial = sc.nextInt();
		System.out.println("Insira a hora final do jogo");
		int horaFinal = sc.nextInt();
		int duracaoDoJogo;
		
		if(horaInicial < horaFinal)
			duracaoDoJogo = horaFinal - horaInicial;
		else if(horaInicial > horaFinal)
			duracaoDoJogo = (24 - horaInicial) + horaFinal;
		else
			duracaoDoJogo = 24;
			
		System.out.printf("O jogo durou %d hora(s)", duracaoDoJogo);
		
		sc.close();
		
	}

}
