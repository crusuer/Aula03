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
		dois.setX(8);
		dois.setY(9);

		Retangulo retan = new Retangulo();
		retan.setInferiorDireito(um);
		retan.setSuperiorEsquerdo(dois);

		log.info(retan.calcularAreaRetangulo());

		Ponto tres = new Ponto();
		tres.setX(100);
		tres.setY(5);
		
		Ponto quatro = new Ponto();
		quatro.setX(50);
		quatro.setY(10);		
		
		Triangulo trian = new Triangulo();
		trian.setInferior(tres);
		trian.setSuperior(quatro);

		log.info(trian.calcularAreaTriangulo());

	}
}
