package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Movimento movimento;
	private Golpe golpe;

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	
	public void setGolpe(Golpe golpe) {
		this.golpe = golpe;
	}

	public void mover() {
		movimento.mover();
	}

	public void golpe() {
		golpe.golpe();
	}
}
