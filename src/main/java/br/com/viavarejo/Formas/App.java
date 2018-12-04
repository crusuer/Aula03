package br.com.viavarejo.Formas;

import org.apache.log4j.Logger;

import br.com.viavarejo.model.Circulo;
import br.com.viavarejo.model.Ponto;
import br.com.viavarejo.model.Quadrado;
import br.com.viavarejo.model.Raio;
import br.com.viavarejo.model.Retangulo;
import br.com.viavarejo.model.Triangulo;

/**
 * Hello world!
 *
 */
public class App {
	private static final Logger log = Logger.getLogger(App.class);

	public static void main(String[] args) {

		Ponto um = new Ponto();
		um.setX(2);
		um.setY(1);

		Ponto dois = new Ponto();
		dois.setX(4);
		dois.setY(3);

		Quadrado quad = new Quadrado();
		quad.setInferiorEsquerdo(um);
		quad.setSuperiorDireito(dois);

		log.info(quad.calcularArea());

		Raio tres = new Raio();
		tres.setW(5);

		Ponto quatro = new Ponto();
		quatro.setX(10);
		quatro.setY(5);		
		
		Circulo circ = new Circulo();
		circ.setComprimento(tres);
		circ.setCentro(quatro);

		log.info(circ.calcularArea());
		
		
		Ponto ladoa = new Ponto();
		ladoa.setX(5);
		ladoa.setY(2);

		Ponto ladob = new Ponto();
		ladob.setX(9);
		ladob.setY(5);

		Retangulo retang = new Retangulo();
		retang.setInferiorEsquerdo(ladoa);
		retang.setSuperiorDireito(ladob);

		log.info(retang.calcularArea());

		
		Ponto base = new Ponto();
		base.setX(10);
		base.setY(5);

		Ponto altura = new Ponto();
		altura.setX(15);
		altura.setY(7);

		Triangulo triangulo = new Triangulo();
		triangulo.setInferiorEsquerdo(ladoa);
		triangulo.setSuperiorDireito(ladob);

		log.info(triangulo.calcularArea());
		
	}
}
