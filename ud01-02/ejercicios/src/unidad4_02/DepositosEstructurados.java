package unidad4_02;

public class DepositosEstructurados extends Deposito{
	private double capitalVariable;
	private double interesVariable;

	public DepositosEstructurados
	(String titular, double capitalFijo, int diasInvertido, double interésFijo,double capitalVariable,double interesVariable)
	{
		super(titular, capitalFijo, diasInvertido, interésFijo);
		// TODO Auto-generated constructor stub
		this.capitalVariable=capitalVariable;
		this.interesVariable=interesVariable;
	}



	public DepositosEstructurados(String titular, double capitalFijo, int diasInvertido, double interésFijo) {
		super(titular, capitalFijo, diasInvertido, interésFijo);
		// TODO Auto-generated constructor stub
	}

	public double getCapitalVariable() {
		return capitalVariable;
	}

	public void setCapitalVariable(double capitalVariable) {
		this.capitalVariable = capitalVariable;
	}

	public double getInteresVariable() {
		return interesVariable;
	}

	public void setInteresVariable(double interesVariable) {
		this.interesVariable = interesVariable;
	}
	@Override
	public double getIntereses() {
		double intereses=(getDiasInvertido()*interesVariable*capitalVariable)/365;
		return intereses;
	}
	@Override
	public double liquidar() {
		double liquidacion=getCapitalFijo()+super.getIntereses()+capitalVariable+getIntereses();
		return liquidacion;
	}
	
	@Override
	public void visualizarLiquidacion() {
		System.out.println("Liquidacion obtenida al venicmiento del deposito variable: "+liquidar());
	}
	
	

}
