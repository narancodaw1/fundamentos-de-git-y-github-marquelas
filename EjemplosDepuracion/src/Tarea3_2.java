package tarea3;

import java.util.Scanner;

public class Tarea3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca el primer entero > ");
		int numero1 = 0;
		if (sc.hasNextInt()) {
			numero1 = sc.nextInt();

			System.out.print("Introduzca el segundo entero > ");
			int numero2 = 0;
			if (sc.hasNextInt()) {
				numero2 = sc.nextInt();

				System.out.print("Introduzca una operación > ");
				char operacion = sc.next().charAt(0);

				switch (operacion) {
				case 's':
				case 'S':
					System.out.println("Suma=" + (numero1 + numero2));
					break;

				case 'r':
				case 'R':
					System.out.println("Resta=" + (numero1 - numero2));
					break;

				case 'm':
				case 'M':
					System.out.println("Multiplicación=" + (numero1 * numero2));
					break;

				case 'd':
				case 'D':
					if (numero2 == 0) {
						System.out.println("División=" + (numero1 / numero2));
					} else {
						System.out.println("No se puede dividir entre 0");
					}
					break;
				default:
					System.out.println("Operación no encontrada");
				}
			} else {
				System.out.println("Entrada incorrecta");
			}
		} else {
			System.out.println("Entrada incorrecta");
		}
	}
}
