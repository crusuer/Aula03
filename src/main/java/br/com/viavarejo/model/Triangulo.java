package br.com.viavarejo.model;

public class Triangulo {

	private Ponto inferior;
	private Ponto superior;
	
	
	public Ponto getInferior() {
		return inferior;
	}
	public void setInferior(Ponto inferior) {
		this.inferior = inferior;
	}
	public Ponto getSuperior() {
		return superior;
	}
	public void setSuperior(Ponto superior) {
		this.superior = superior;
	}
	
	public float calcularAreaTriangulo() {
		float base = (superior.getX() - inferior.getX()) * 2;
		float altura = superior.getY() - inferior.getY();
		return (float) (base * altura) / 2;
	}
	
}
