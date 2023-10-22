package one.digitalinnovation.gof;

import one.digitalinnovation.gof.strategy.Movimento;
import one.digitalinnovation.gof.strategy.MovimentoDireita;
import one.digitalinnovation.gof.strategy.MovimentoEsquerda;
import one.digitalinnovation.gof.strategy.MovimentoFrente;
import one.digitalinnovation.gof.strategy.MovimentoTras;
import one.digitalinnovation.gof.strategy.Golpe;
import one.digitalinnovation.gof.strategy.GolpeAlto;
import one.digitalinnovation.gof.strategy.GolpeBaixo;

import one.digitalinnovation.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		// Strategy
		
		Movimento direita = new MovimentoDireita();
		Movimento esquerda = new MovimentoEsquerda();
		Movimento tras = new MovimentoTras();
		Movimento frente = new MovimentoFrente();
		Golpe baixo = new GolpeBaixo();
		Golpe alto = new GolpeAlto();

		
		Robo robo = new Robo();

		robo.setMovimento(frente);
		robo.mover();
		robo.setMovimento(tras);
		robo.mover();
		robo.setMovimento(direita);
		robo.mover();
		robo.setMovimento(esquerda);
		robo.mover();
		robo.setGolpe(alto);
		robo.golpe();
		robo.setGolpe(baixo);
		robo.golpe();
		
	}

}
