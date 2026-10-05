public class EstruturaIF2 {
	public static void main(String[] args) {
		//exemplo com operadores relacionais e lógicos
		double nota = 8.5;

		if (nota == 10){
			System.out.println("Excelente! Tirou nota Máxima.");
		}else if (nota != 10 && nota >= 7){
			System.out.println("Aprovado com boa nota.");
		}else if (nota <7 && nota >= 5){
			System.out.println("Em recuperação.");
		}else {
			System.out.println("Reprovado");
		}

		//Exemplo com operador || (ou)
		boolean feriado = false;
		boolean fimDeSemana = true;

		if (feriado || fimDeSemana){
			System.out.println("Hoje é dia de descanso!");
		}else {
			System.out.println("Dia útil, hora de trabalhat!");
		}
	}
}
