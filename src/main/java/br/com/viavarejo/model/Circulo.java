package br.com.viavarejo.model;

public class Circulo {

	private Raio comprimento;
	private Ponto centro;

	public Raio getComprimento() {
		return comprimento;
	}

	public void setComprimento(Raio comprimento) {
		this.comprimento = comprimento;
	}

	public Ponto getCentro() {
		return centro;
	}

	public void setCentro(Ponto centro) {
		this.centro = centro;
	}

	public float calcularAreaRetangulo() {
		final float pi = 3.14F;
		float area = (float) (Math.pow(comprimento.getW(), 2) * pi);
		return area;
	}
}
