package one.digitalinnovation.gof.strategy;

public class MovimentoTras implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movendo-se para trás...");
	}

}
