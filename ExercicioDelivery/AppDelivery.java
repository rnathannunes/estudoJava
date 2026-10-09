public class AppDelivery {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido();

		pedido1.numeroPedido = 1;
		pedido1.nomeCliente = "Fulano";
		pedido1.enderecoEntrega = "Rua 15 de Março, 123";
		pedido1.calcularValorTotal(45.95);
		pedido1.atualizarStatus("Em preparo...");
		pedido1.exibirResumo();
	}
}
