package ud01_02;

import java.util.*;

public class Ejercicio2 {
	public static Scanner sc = new Scanner(System.in);

	public void run() {
		int num = introducirNumero();
		int numValidado = validarNumero(num);
		int suma = sumarPotencias(numValidado);
		visualizarSuma(suma);
	}

	public void visualizarSuma(int suma) {
		System.out.println("La suma de potencias es: " + suma);
	}

	public int introducirNumero() {
		int numero = 0;
		System.out.println("Introduce un numero del 1 al 7");
		numero = sc.nextInt();
		return numero;
	}

	public int validarNumero(int numero) {
		while (numero < 1 || numero > 7) {
			escribir();
			numero = introducirNumero();
		}
		return numero;
	}

	public void escribir() {
		System.out.println("El número no es válido, introduzca otro numero");
	}

	public int sumarPotencias(int numero) {

		int suma = 0;
		for (int n = 1; n <= numero; n++) {// n=1
			int potencia = 1;
			for (int p = 1; p <= n; p++) {// p=1
				potencia *= n;

			}
			suma += potencia;
		}
		return suma;
	}

	public static void main(String[] args) {
		Ejercicio2 interfaz = new Ejercicio2();
		interfaz.run();
	}

}
