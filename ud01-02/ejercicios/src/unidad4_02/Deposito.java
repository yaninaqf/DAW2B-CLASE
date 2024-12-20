package unidad4_02;

public class Deposito {
private String titular;
private double capitalFijo;
private int diasInvertido;
private double interesFijo;
public Deposito(String titular, double capitalFijo, int diasInvertido, double interésFijo) {
	super();
	this.titular = titular;
	this.capitalFijo = capitalFijo;
	this.diasInvertido = diasInvertido;
	this.interesFijo = interésFijo;
}



public Deposito() {
	super();
	// TODO Auto-generated constructor stub
}



public String getTitular() {
	return titular;
}
public void setTitular(String titular) {
	this.titular = titular;
}
public double getCapitalFijo() {
	return capitalFijo;
}
public void setCapitalFijo(double capitalFijo) {
	this.capitalFijo = capitalFijo;
}
public int getDiasInvertido() {
	return diasInvertido;
}
public void setDiasInvertido(int diasInvertido) {
	this.diasInvertido = diasInvertido;
}
public double getInteresFijo() {
	return interesFijo;
}
public void setInteresFijo(double interésFijo) {
	this.interesFijo = interésFijo;
}
@Override
public String toString() {
	return "Deposito [titular=" + titular + ", capitalFijo=" + capitalFijo + ", diasInvertido=" + diasInvertido
			+ ", interésFijo=" + interesFijo + "]";
}

public double getIntereses() {
	double intereses=(diasInvertido*interesFijo*capitalFijo)/365;
	return intereses;
}

public double liquidar() {
	double dineroFinal=capitalFijo+getIntereses();
	return dineroFinal;
}

public void visualizarLiquidacion() {
	System.out.println("liquidación obtenida al vencimiento: "+liquidar());
}

}
