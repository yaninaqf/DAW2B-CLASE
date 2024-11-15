package unidad3_ejercicio02;
import java.util.*;
public class Hucha {
	public static Scanner sc=new Scanner(System.in);
	int TOPE_MONEDAS=200;
	int TOPE_BILLETES=100;
	int billetes=0;
	double monedas=0.0;
	boolean cerrado=false;
	
	public Hucha(int billetes, double monedas) {
		super();
		this.billetes = billetes;
		this.monedas = monedas;
	}
	public int getBilletes() {
		return billetes;
	}
	public void setBilletes(int billetes) {
		this.billetes = billetes;
	}
	public double getMonedas() {
		return monedas;
	}
	public void setMonedas(double monedas) {
		this.monedas = monedas;
	}
	@Override
	public String toString() {
		return "Hucha [billetes=" + billetes + ", monedas=" + monedas + "]";
	}
	
	public int introducirDinero() {
		int dinero=0;
		if(cerrado!=false) {
			dinero=introducirTeclado();
			switch(dinero) {
			case 1:
				
			}
		}
		return 0;
	}
	public void anadirMoneda(double moneda) {
		
	}
	public int introducirTeclado() {
		System.out.println("Introducir monedas de 1 euro o billetes de 5 euros");
		return sc.nextInt();
	}
	
	
	
	
	
	
	


}
