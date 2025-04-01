import java.util.Scanner;

public class Menu_de_opciones{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int Opciones;
		
		do {
			System.out.println("\n--- Menu de opciones ---");
			System.out.println("\n 1. Calcular el area de un circulo");
			System.out.println("\n 2. Calcular el IVA de un producto");
			System.out.println("\n 3. Salir");
			System.out.print("Seleccione una opcion: ");
			Opciones = scanner.nextInt();
			scanner.nextLine();
			
			switch (Opciones) {
				case 1:
					System.out.print("Ingresa el radio del circulo: ");
					double radio = scanner.nextDouble();
					double area = Math.PI * Math.pow(radio, 2);
					System.out.println("Este es el area del circulo: " +area);
					break;
					
				case 2:
					System.out.println("Ingrese el nombre del producto: ");
					String producto = scanner.nextLine();
					System.out.println("Ingrese el precio del producto: ");
					double precio = scanner.nextDouble();
					double IVA = precio*0.19;
					double total = precio + IVA;
					System.out.println("Producto: " + producto);
					System.out.println("Este es el precio sin IVA: " + precio);
					System.out.println("Este es el IVA (19%): " + IVA);
					System.out.println("Este es el precio total con IVA: " + total);
					break;

				case 3:
					System.out.print("Adios.");
					break;
					
				default:
					System.out.print("Opcion no valida. Por favor intente nuevamente.");
					break;
			}
			
		}while (Opciones != 3);
		
		scanner.close();
	}
}