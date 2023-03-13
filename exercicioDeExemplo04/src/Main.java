
public class Main {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		double valorFinal = preco - desconto;
		
		System.out.printf("Valor a pagar: R$ %.2f", valorFinal);
		
	}

}
