import java.util.Scanner;

public class Funciones_con_dos_numeros{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Ingrese el primer numero: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Ingrese el segundo numero: ");
		int numero2 = scanner.nextInt();
		
		if(numero1>numero2) {
			System.out.println("El numero mayor es: "+ numero1);
		} else if (numero2>numero1) {
			System.out.println("El numero mayor es: "+numero2);
		} else {
			System.out.println("Los numeros son iguales");
		}
		
		scanner.close();
	}
}
