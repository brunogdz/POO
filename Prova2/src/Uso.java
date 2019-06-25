import java.util.Scanner;
import agenda.Agenda;
import agenda.*;
import tempo.*;
public class Uso {
	public static void main(String args[]) throws Exception {
		final int QTDE = 4;
		Agenda agenda = new Agenda();
		// variaveis auxiliares e temporarias
		String dtInicio, dtFim, horarioInicio, horarioFim, titulo, descricao, local;
		int prioridade, qtdMin, opcao;
		Periodo periodonew = null;

		for(int i=0; i < QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n (1)Fazer Lembrete\n (2)Fazer Meta\n (3)Fazer Evento\n (4)Listar Agenda\n (5)Por Prioridade\n (6)Por periodo\n (7)Lembretes em Ordem\n (8)Eventos em Ordem\n (9)Sair\n ");
			opcao = new Scanner(System.in).nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.println("Quantos minutos quer ser avisado antes: ");
					qtdMin = new Scanner(System.in).nextInt();
					System.out.println("Titulo: ");
					titulo = new Scanner(System.in).next();
					System.out.println("Descricao: ");
					descricao = new Scanner(System.in).next();
					System.out.println("Data Inicial (dd/mm/aaaa): ");
					dtInicio = new Scanner(System.in).next();
					System.out.println("Data Fim (dd/mm/aaaa): ");
					dtFim = new Scanner(System.in).next();
					System.out.println("Horario inicial (hh:mm:ss): ");
					horarioInicio = new Scanner(System.in).next();
					System.out.println("Horario Final (hh:mm:ss): ");
					horarioFim = new Scanner(System.in).next();
					try {
						agenda.insere(new Lembrete(titulo, descricao,dtInicio,dtFim,horarioInicio,horarioFim,qtdMin));
					} catch (Exception e) {
						System.out.println("Minutos inválido!");
					}
					break;
				case 2:
					System.out.println("Qual prioridade da sua meta: ");
					prioridade = new Scanner(System.in).nextInt();
					System.out.println("Titulo: ");
					titulo = new Scanner(System.in).next();
					System.out.println("Descricao: ");
					descricao = new Scanner(System.in).next();
					System.out.println("Data Inicial (dd/mm/aaaa): ");
					dtInicio = new Scanner(System.in).next();
					System.out.println("Data Fim (dd/mm/aaaa): ");
					dtFim = new Scanner(System.in).next();
					System.out.println("Horario inicial (hh:mm:ss): ");
					horarioInicio = new Scanner(System.in).next();
					System.out.println("Horario Final (hh:mm:ss): ");
					horarioFim = new Scanner(System.in).next();
					try {
						agenda.insere(new Meta(titulo, descricao,dtInicio,dtFim,horarioInicio,horarioFim,prioridade));
					} catch (Exception e) {
						System.out.println("Prioridade Incorreta");
					}
					break;
				case 3:
					System.out.println("Qual local do evento: ");
					local = new Scanner(System.in).next();
					System.out.println("Titulo: ");
					titulo = new Scanner(System.in).next();
					System.out.println("Descricao: ");
					descricao = new Scanner(System.in).next();
					System.out.println("Data Inicial (dd/mm/aaaa): ");
					dtInicio = new Scanner(System.in).next();
					System.out.println("Data Fim (dd/mm/aaaa): ");
					dtFim = new Scanner(System.in).next();
					System.out.println("Horario inicial (hh:mm:ss): ");
					horarioInicio = new Scanner(System.in).next();
					System.out.println("Horario Final (hh:mm:ss): ");
					horarioFim = new Scanner(System.in).next();
					try {
						agenda.insere(new Evento(local, titulo, descricao,dtInicio,dtFim,horarioInicio,horarioFim));
					} catch (Exception e) {
						System.out.println("Local Incorreto");
					}
					break;
				case 4:
					System.out.println(agenda.toString());
					break;
				case 5:
					System.out.println(agenda.metasPorPrioridade().toString());
					break;
				case 6:
					System.out.println("Data Inicial (dd/mm/aaaa): ");
					dtInicio = new Scanner(System.in).next();
					System.out.println("Data Fim (dd/mm/aaaa): ");
					dtFim = new Scanner(System.in).next();
					System.out.println("Horario inicial (hh:mm:ss): ");
					horarioInicio = new Scanner(System.in).next();
					System.out.println("Horario Final (hh:mm:ss): ");
					horarioFim = new Scanner(System.in).next();
					try {
						periodonew = new Periodo(dtInicio, dtFim, horarioInicio, horarioFim);
					} catch (Exception e) {
						System.out.println("Os parametros para fazer entre os periodos está em conflito");
					}
					System.out.println(agenda.porPeriodo(periodonew).toString());
					break;
				case 7:
					System.out.println(agenda.ordemLembrete().toString());
					break;
				case 8:
					System.out.println(agenda.localAlfabeticamente().toString());
					break;
				case 9:
					System.out.println("Até breve...");
					break;
				default:
					System.out.println("Digite numeros entre 1 e 9");
					break;
				}

			}catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
		
	}
}


