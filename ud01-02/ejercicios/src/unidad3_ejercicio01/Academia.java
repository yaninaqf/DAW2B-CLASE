package unidad3_ejercicio01;
import java.util.*;
public class Academia {
	public static Scanner sc=new Scanner(System.in);
	Alumno alumno1;
	public void run() {
		alumno1=crearAlumno();
		int edad=alumno1.getEdad();
		String curso=alumno1.getMatricula().getCurso();
		alumno1.calcularCosteAcademia(edad,curso);
	}
	public Alumno crearAlumno() {
		System.out.println("Introduce el nombre del alumno: ");
		String nombre=devolverCadena();
		System.out.println("Introduce la edad: ");
		int edad=devolverNumero();
		System.out.println("Introduce numero de expediente para la matricula");
		int numExp=devolverNumero();
		System.out.println("Escoge una de las siguientes opciones: FPB,GM,GS");
		String curso=devolverCadena();
		Matricula matricula=new Matricula(numExp,curso);
		Alumno alumno=new Alumno(nombre,edad,matricula);
		return alumno;
	}
	public String devolverCadena() {
		return sc.next();
	}
	public int devolverNumero() {
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Academia interfaz=new Academia();
		interfaz.run();

	}

}
