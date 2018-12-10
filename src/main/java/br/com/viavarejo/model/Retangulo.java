package br.com.viavarejo.model;

public class Retangulo {

	private Ponto inferiorDireito;
	private Ponto superiorEsquerdo;
	
	public Ponto getInferiorDireito() {
		return inferiorDireito;
	}
	public void setInferiorDireito(Ponto inferiorDireito) {
		this.inferiorDireito = inferiorDireito;
	}
	public Ponto getSuperiorEsquerdo() {
		return superiorEsquerdo;
	}
	public void setSuperiorEsquerdo(Ponto superiorEsquerdo) {
		this.superiorEsquerdo = superiorEsquerdo;
	}
	
	public float calcularAreaRetangulo() {
	float base = superiorEsquerdo.getX() - inferiorDireito.getX();
	float altura = superiorEsquerdo.getY() - inferiorDireito.getY();
	return (float) base * altura;
	}
	
}
