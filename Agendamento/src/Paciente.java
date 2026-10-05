public class Paciente {
	private String nome;
	private String cpf;

	public Paciente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	public void agendarConsulta(Consulta consulta){
		System.out.println("Consulta agendade para o paciente " + nome);
	}

	public String getNome(){
		return nome;
	}
	public String getCpf(){
		return cpf;
	}
}
