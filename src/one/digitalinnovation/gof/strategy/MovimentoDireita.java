package one.digitalinnovation.gof.strategy;

public class MovimentoDireita implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movendo-se para direita...");
	}

}
