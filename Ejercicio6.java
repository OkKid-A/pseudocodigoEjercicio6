import java.util.Scanner;

public class Ejercicio6{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menCont = 0;
		int menTotal = 0;
		int mayCont = 0;
		int mayTotal = 0;
		for (int i = 0;i < 10;i++) {
			System.out.println("\nIngresa tu edad");
			int muestra = scanner.nextInt();
			if (muestra < 25) {
				menCont++;
				menTotal+=muestra;
			} else {
				mayCont++;
				mayTotal+=muestra;
			}
		}
		double promedioMay = mayTotal/mayCont;
		double promedioMen = menTotal/menCont;
		System.out.println("\nEl promedio de edades menores a 25 es "+promedioMen+" y el promedio de edades mayores a 25 es " + promedioMay);
	}
}