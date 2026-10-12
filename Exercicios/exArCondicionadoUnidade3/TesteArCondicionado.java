package exArCondicionadoUnidade3;

public class TesteArCondicionado {
	public static void main(String[] args) {
		ArCondicionado ar = new ArCondicionado();

		//Verificando estado inicial
		System.out.println("Estado inicial: ");
		System.out.println("Ligado? " + ar.isLigado());
		System.out.println("Temperatura atual: " + ar.getTemperaturaAtual() + "°C");
		System.out.println("Temperatura desejada: " + ar.getTemperaturaDesejada() + "°C\n");

		//Tentando ligar o aparelho
		ar.ligar();

		//Ajustando temperatura desejada (Válida e inválida)
		ar.setTemperaturaDesejada(20);
		ar.setTemperaturaDesejada(35);//Fora do intervalo permitido

		//Simulando atualização da temperatura atual (Como se fosse o hardware)
		for(int i = 0; i < 10; i++){
			ar.atualizarTemperaturaAtual();
			System.out.println("Temperatura atual após atualização: " + ar.getTemperaturaAtual() + "°C");
		}
		//Desligando o aparelho
		ar.desligar();
		System.out.println("Ligado?" + ar.isLigado());
	}
}