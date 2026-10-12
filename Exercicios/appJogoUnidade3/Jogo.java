package appJogoUnidade3;

public class Jogo {
	public static void main(String[] args) {
		Personagem jogador = new Personagem();

		jogador.atacar();//Metodo público
		jogador.carregarTextura();//Metodo default
		jogador.ganharExperiencia(20);//Metodo protected
		jogador.regenerarEnergia();//Metodo privado - Não é possível acessar fora da classe Personagem
		jogador.energia = 50; //Atributo privado - Não é possível acessar fora da classe Personagem
		jogador.posicaoX = 5; //Atributo default
		jogador.exibirStatus();
	}
}
