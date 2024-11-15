package unidad4_02;
import java.util.*;
public class Principal {
public static Scanner sc=new Scanner(System.in);

Deposito deposito;
Deposito estructurado;
public Principal() {
	 
}
public void run() {
	deposito=crearDeposito();
	estructurado=crearEstructura();
}
public void visualizar(DepositosEstructurados objeto) {
	if(objeto instanceof Deposito) {
		System.out.println("D/Dña"+objeto.getTitular()+" invirtió un interes fijo"+objeto.getIntereses()+"durante "+objeto.getDiasInvertido()+" .\n Liquidación obtenida: "+objeto.liquidar());
	}else {
		System.out.println("D./Dña "+objeto.getTitular()+"invirtió un capital fijo de "+objeto.getCapitalFijo()+", a un tipo de interés fijo "+objeto.getInteresFijo()+" durante "+objeto.getDiasInvertido()+"\r\n"
				+ "días, y un capital variable de " +objeto.getCapitalVariable()+", a un tipo de interés variable "+objeto.getInteresVariable()+". Liquidación\r\n"
				+ "obtenida "+objeto.liquidar());
	}
}
public Deposito crearDeposito() {
	Deposito deposito=new Deposito(titular(),capitalFijo(),diasInvertido(),interesFijo());
	return deposito;
}	

public Deposito crearEstructura() {
	Deposito estructurado=new DepositosEstructurados(titular(),capitalFijo(),diasInvertido(),interesFijo(),capitalVariable(),
			interesVariable());
	return estructurado;

}


public String titular() {
	System.out.println("Nombre titular");
	return sc.next();
	
	}
public double capitalFijo() {
	System.out.println("Introducir capital Fijo");
	return sc.nextDouble();
}

public int diasInvertido() {
	System.out.println("Cuantos días quieres invertir");
	return sc.nextInt();
			}
public double interesFijo() {
	System.out.println("Que interés fijo quieres: ");
	return sc.nextDouble();
}
public double interesVariable() {
	System.out.println("Que interés variable quieres: ");
	return sc.nextDouble();
}
public double capitalVariable() {
	System.out.println("Introducir capital variable");
	return sc.nextDouble();
}	public static void main(String[] args) {
		Principal interfaz=new Principal();
		interfaz.run();

	}

}
