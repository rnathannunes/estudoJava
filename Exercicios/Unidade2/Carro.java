package Unidade2;

public class Carro {
	private String cor;
	private String modelo;
	private int anoFabricacao;
	private int velocidadeAtual;

	public void acelerar(){
		velocidadeAtual += 10;
	}

	public void frear(){
		velocidadeAtual -= 10;
	}

	public void ligar(){
		System.out.println("Carro ligado");
	}
}
