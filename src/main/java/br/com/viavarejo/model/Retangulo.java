package br.com.viavarejo.model;

public class Retangulo {
	
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
		float ladoa = superiorDireito.getX() - inferiorEsquerdo.getX();
		float ladob = superiorDireito.getY() - inferiorEsquerdo.getY();
		return ladoa * ladob;
	}

}
