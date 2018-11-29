package br.com.viavarejo.model;

public class Quadrado {

	private Ponto inferiorEsquerdo;
	private Ponto superiorDireito;
	
	public Ponto getInferiorEsquerdo() {
		return inferiorEsquerdo;
	}
	public void setInferiorEsquerdo(Ponto inferiorEsquerdo) {
		this.inferiorEsquerdo = inferiorEsquerdo;
	}
	public Ponto getSuperiorDireito() {
		return superiorDireito;
	}
	public void setSuperiorDireito(Ponto superiorDireito) {
		this.superiorDireito = superiorDireito;
	}
	public float calcularArea() {
		float base = superiorDireito.getX() - inferiorEsquerdo.getX();
		float altura = superiorDireito.getY() - inferiorEsquerdo.getY();
		return base * altura;
	}
	
}
