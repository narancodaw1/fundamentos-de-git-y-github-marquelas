
package Bucles1;
import java.util.Scanner;
public class pideunnumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int entero = 1;
    while (entero!=0) {
    	System.out.println("Introduzca un n�mero entero: ");
    	entero = sc.nextInt();
    	System.out.println(entero);
    	if(entero == 0) {
    	System.out.println("Numero no v�lido");
    }
	}

}
} 

