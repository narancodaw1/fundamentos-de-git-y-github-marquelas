import java.util.Scanner;
public class Tarea1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = 1;
		
		System.out.println("Introduzca un n�mero > ");
		
		if(sc.hasNextInt()) {
			numero = sc.nextInt();
			
			double contador = 1.5;
			double suma = 1;
			while (contador < numero) {
				suma +=(1 / contador);
				contador++;
			}
		
		System.out.println("La suma de la serie es " + suma);
		
		}else {
			System.out.println("Error. Introduce un n�mero entero");
		}
		
	}

}
