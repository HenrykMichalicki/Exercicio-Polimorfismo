package br.com.generation.ExercicioPolimorfismo;

public class Preguica implements Animal {
	
	public void subirArvore () {
		System.out.println("Pregui�a subindo em �rvore....");
	}

	@Override
	public void Som() {
		System.out.println("Pregui�a emitindo som...\n");
		
	}

	@Override
	public void Nome() {
		System.out.println("Nome da pregui�a � bejinho");
		
		
	}

	@Override
	public void Idade() {
		System.out.println("Idade � 5 anos");
		
		
	}
	
	

}
