package one.digitalinnovation.gof.strategy;

public class MovimentoEsquerda implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movendo-se para esquerda...");
	}

}