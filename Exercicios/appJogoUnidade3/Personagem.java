package appJogoUnidade3

public class Personagem {
	private int energia = 100; // Somente a própria classe pode acessar
	int posicaoX = 0; // Default: qualquer classe do mesmo pacote pode acessar
	protected int experiencia = 0; // Protected: a própria classe, classes do mesmo pacote

	public void atacar() {
		System.out.println("O personagem atacou!");
		energia -= 10;
	}

	protected void ganharExperiencia(int pontos) {
		experiencia += pontos;
		System.out.println("O personagem ganhou " + pontos + " pontos de experiência!");
	}

	void carregarTextura() {
		System.out.println("Textura carregada com sucesso!");
	}

	private void recuperarEnergia(){
		energia = 100;
		System.out.println("Energia regenerada!");
	}

	public int getEnergia() {
		return energia;
	}

	public void exibirStatus(){
		System.out.println("Energia: " + energia);
		System.out.println("Experiência: " + experiencia);
		System.out.println("Posição X: " + posicaoX);
	}
}
