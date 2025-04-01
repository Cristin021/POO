import java.util.Scanner;

public class Formulario_Array{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cuantas personas desea ingresar? ");
		int cantidad = scanner.nextInt();
		scanner.nextLine();
		
		String[][] personas = new String[cantidad][3];
		
		for(int i = 0; i < cantidad; i++) {
			System.out.println("\nRegistro #"+(i+1));
			
			System.out.print("Ingrese el nombre: ");
			String nombre = scanner.nextLine();
			personas[i][0]=nombre;
			
			System.out.print("Ingrese la edad: ");
			String edad = scanner.nextLine();
			personas[i][1]=edad;
			
			System.out.print("Ingrese el correo: ");
			String correo = scanner.nextLine();
			personas[i][2]=correo;
		}
		
		scanner.close();
		
		System.out.println("\n--- Datos de usuarios ---");
		for(int i = 0; i < cantidad; i++) {
			System.out.println("\nPersona #"+(i+1));
			System.out.println("\nNombre: "+ personas[i][0]);
			System.out.println("\nEdad: "+ personas[i][1]);
			System.out.println("\nCorreo: "+ personas[i][2]);
			System.out.println("\n-------------------");
		}
	}
}
