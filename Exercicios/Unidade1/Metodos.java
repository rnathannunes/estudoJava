public class Metodos {
	public static void main(String[] args) {
		saudacao();//chamada de método sem parâmetro
		exibirDobro(8);//chamada de método com parâmetro
	}
	//Método sem parâmetro
	public static void saudacao() {
		System.out.println("Olá, seja bem-vindo ao programa!");
	}

	//Método com parâmetro
	public static void exibirDobro(int numero) {
		int resultado = numero * 2;
		System.out.println("O dobro de " + numero + " é " + resultado);
	}
}