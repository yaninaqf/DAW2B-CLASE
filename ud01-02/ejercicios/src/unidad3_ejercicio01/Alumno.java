package unidad3_ejercicio01;

import java.util.Scanner;
import java.util.*;
public class Alumno {
	public static Scanner sc=new Scanner(System.in);
	private String nombre;
	private int edad;
	private Matricula matricula;
	public Alumno(String nombre, int edad, Matricula matricula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + "]";
	}
	public void calcularCosteAcademia(int edad, String nomCurso) {
		double seguro=0.5;
		float costeDiario=calcularCosteDiario(nomCurso);
		if(edad<=25) {
			double coste=costeDiario+seguro;
			System.out.println("El coste diario es de: "+coste+" €");
		}else {
			System.out.println("El coste diario es de: "+costeDiario+" €");
		}
	
	}
	public int introducirHoras() {
		System.out.println("Introduce el numero de horas diarios que asistes al día:");
		int numHoras=sc.nextInt();
		return numHoras;
	}
	public int calcularCosteDiario(String nomCurso) {
		int horas=introducirHoras();
		String curso=nomCurso.toUpperCase();
		int precio=0;
		
		switch(curso) {
		case "FPB":
			precio=horas*20;
			break;
		case "GM":
			precio=horas*25;
			break;
		case "GS":
			precio=horas*30;
			break;
			default:
				precio=0;
		}
		return precio;
	}
	
	
}
