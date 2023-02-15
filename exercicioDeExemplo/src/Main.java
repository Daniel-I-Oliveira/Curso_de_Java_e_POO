import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira  a largura do terreno em metros:");
		double larguraDoTerreno = sc.nextDouble();
		System.out.println("Insira o comprimento do terreno em metros:");
		double comprimentoDoTerreno = sc.nextDouble();
		System.out.println("Insira o valor do metro quadrado em reais:");
		double valorDoMetroQuadrado = sc.nextDouble();
		
		sc.close();
		
		double areaDoTerreno = larguraDoTerreno * comprimentoDoTerreno;
		double valorDoTerreno = areaDoTerreno * valorDoMetroQuadrado;
		
		System.out.printf("Área do terreno: %.2fm²%n", areaDoTerreno);
		System.out.printf("Valor do terreno: R$ %.2f", valorDoTerreno);
	}

}
