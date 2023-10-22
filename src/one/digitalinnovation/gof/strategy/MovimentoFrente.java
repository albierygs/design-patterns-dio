package one.digitalinnovation.gof.strategy;

public class MovimentoFrente implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movendo-se para frente...");
	}

}
