import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int hora;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		if(hora < 12) {
			System.out.println("Bom dia");
			}
		else{
			System.out.println("Boa tarde");
		}
		
		sc.close();
	}

}
