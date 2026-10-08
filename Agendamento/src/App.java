public class App {
    public static void main(String[] args){
        Paciente paciente = new Paciente("João Silva", "123.456.789-00");
        Medico medico = new Medico("Dra. Ana", "Cardiologista");

        Consulta consulta = new Consulta("08/10/2026", "20:39", paciente, medico);
        consulta.confirmar();

        Agenda agenda = new Agenda();
        agenda.adicionarHorario("14:30");
        agenda.adicionarHorario("15:30");
        
        medico.visualizarAgenda(agenda);
        paciente.agendarConsulta(consulta);
    }
}
