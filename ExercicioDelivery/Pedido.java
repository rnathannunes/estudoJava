public class Pedido {
	int numeroPedido;
	String nomeCliente;
	String enderecoEntrega;
	double valorTotal;
	String status;

	public void calcularValorTotal(double valor){
		this.valorTotal = valor;
	}

	public void atualizarStatus(String novoStatus){
		this.status = novoStatus;
	}

	public void exibirResumo(String novoStatus){
		this.status = novoStatus;
	}

	public void exibirResumo(){
		System.out.println("Pedido #" + numeroPedido);
		System.out.println("Cliente " + nomeCliente);
		System.out.println("Endereço " + enderecoEntrega);
		System.out.println("Valor total R$" + valorTotal);
		System.out.println("Status " + status);
	}
}
