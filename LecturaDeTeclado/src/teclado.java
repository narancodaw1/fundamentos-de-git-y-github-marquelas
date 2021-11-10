import java.util.Scanner;
public class teclado {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	System.out.print("Introduzca el primer entero: > ");
	int n1 = 0;
	if (sc.hasNextInt()) {
		n1 = sc.nextInt();
	
		System.out.print("Introduzca el segundo entero: > ");
		int n2 = 0;
		if(sc.hasNextInt()) {
			n2 = sc.nextInt();
			System.out.print("Introduzca una operación: > ");
			
		}
	}
	}

}
