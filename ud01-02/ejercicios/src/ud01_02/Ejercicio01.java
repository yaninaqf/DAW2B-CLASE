package ud01_02;
import java.util.*;
public class Ejercicio01 {
	public static Scanner sc=new Scanner(System.in);
	public void run() {
		int num=introducirNumero();
		comprobar(num);
	}
	public int introducirNumero()
	{
		
		System.out.println("Introduzca un numero positivo");
		return sc.nextInt();
	}
	public void comprobar(int numero) {
		if(numero<=0) {
			escribir();
		}else {
			visualizar(numero);
		}
	}
	
	public void escribir() {
		System.out.println("El numero no es correcto");
	}
	
	public void visualizar(int numero) {
		for(int i=0;i<numero;i++) {
			for(int a=1;a<=i+1;a++) {
				int num=a+1;
				System.out.print(a);
				
			}
			System.out.println("\n");
		}
	}
	

	public static void main(String[] args) {
		Ejercicio01 interfaz=new Ejercicio01();
		interfaz.run();

	}

}