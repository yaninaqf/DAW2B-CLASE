package unidad3_ejercicio01;

public class Matricula {
	
	private int numExpediente;
	private String curso;
	public Matricula(int numExpediente, String curso) {
		super();
		this.numExpediente = numExpediente;
		this.curso = curso;
	}
	public int getNumExpediente() {
		return numExpediente;
	}
	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Matricula [numExpediente=" + numExpediente + ", curso=" + curso + "]";
	}
	
	
	
	

}
