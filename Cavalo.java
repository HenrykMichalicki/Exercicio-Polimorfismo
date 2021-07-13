package br.com.generation.ExercicioPolimorfismo;

public class Cavalo implements Animal {
	
	public void Correr() {
		System.out.println("Cavalo correndo....");
	}

	@Override
	public void Som() {
		System.out.println("Cavalo emitindo som....\n");
		
	}

	@Override
	public void Nome() {
		System.out.println("Nome do cavalo � Justino");
		
	}

	@Override
	public void Idade() {
		System.out.println("A idade � de 10 anos");
		
	}

}
