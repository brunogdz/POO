package agenda;

import java.io.Serializable;
import java.util.*;
import java.util.Comparator;
import tempo.Data;
import tempo.Periodo;
/**
 * @version 1.0
 * @author Bruno
 *
 */

/**
 *Crio uma lista de Item Agenda e nomeio de Itens Agenda
 */

public class Agenda implements Serializable {
	private LinkedList<ItemAgenda> ItensAgenda;

	public Agenda() {
		ItensAgenda = new LinkedList<ItemAgenda>();
	}
	public LinkedList<ItemAgenda> getItensAgenda() {
		Collections.sort((List) this.ItensAgenda);
		return this.ItensAgenda;
	}
	
	//Insiro na lista o objeto criado, podendo ser qualquer classe a partir da ItemAgenda
	public void insere(ItemAgenda object) {
		this.ItensAgenda.add(object);
	}
	/**
	 * Este método faz a ordenacao de acordo com o maiores numeros da prioridade, há uma iteracao
	 * verificando até a ultima posicao da lista, e após isso é feita no objeto meta, a adicao dos metas
	 * já feitos, e no final é feito a ordenacao.
	 * <p>
	 * Cria uma nova agenda só para o armazenamento das metas
	 * @return a agenda contendo todas as metas ordenadas 
	 */
	public Agenda metasPorPrioridade() {
		Iterator<ItemAgenda> i = ItensAgenda.iterator();
		Agenda agenda = new Agenda();
		ItemAgenda object;
		while(i.hasNext()) {
			object = i.next();
			if(object.getClass() == Meta.class) {				
				agenda.getItensAgenda().add(object);
			}
		}
		
		Collections.sort((List)agenda.getItensAgenda());
		
		return agenda;
	}
	/**
	 * Este método faz a verificao se está no intervalo de tempo
	 * <p>
	 * Cria uma nova agenda só para o armazenamento dos periodos
	 * @return a agenda contendo todos os periodos pré-estabelecidos 
	 */
	public Agenda porPeriodo(Periodo periodo) throws Exception {
		Iterator<ItemAgenda> i = ItensAgenda.iterator();
		Agenda agenda = new Agenda();
		ItemAgenda object;
		while(i.hasNext()) {
			object = i.next();
			if((object.getPeriodo().getDtInicio().compareTo(periodo.getDtInicio()) == 1 && object.getPeriodo().getDtInicio().compareTo(periodo.getDtFim()) == -1) 
					&& (object.getPeriodo().getDtFim().compareTo(periodo.getDtFim())) == 1 || (object.getPeriodo().getDtFim().compareTo(periodo.getDtFim())) == 0 ){
				agenda.getItensAgenda().add(object);
			}
		}
		return agenda;
	}
	/**
	 * Este método faz a ordenacao alfabeticamente dos locais que o usuario digitou
	 * <p>
	 * Cria uma nova agenda, (objeto) só para o armazenamento dos locais e verificar 
	 * @return a agenda contendo todos os locais ordenados
	 */
	public Agenda localAlfabeticamente() {
		Iterator<ItemAgenda> i = ItensAgenda.iterator();
		Agenda agenda = new Agenda();
		ItemAgenda object;
		while(i.hasNext()) {
			object = i.next();
			if(object.getClass() == Evento.class) {				
				agenda.getItensAgenda().add(object);
			}
			Collections.sort((List)agenda.getItensAgenda());
		}
		return agenda;
	}
	/**
	 * Este método faz a ordenacao de acordo com o maior numero de tempo para ser avisado no lembrete,
	 * tem a quantidade de minutos, usando o compareTo.
	 * @return a agenda contendo todos os lembretes ordenados. 
	 */
	public Agenda ordemLembrete() {
		Iterator<ItemAgenda> i = ItensAgenda.iterator();
		Agenda agenda = new Agenda();
		ItemAgenda object;
		while(i.hasNext()) {
			object = i.next();
			if(object.getClass() == Lembrete.class) {				
				agenda.getItensAgenda().add(object);
			}
			Collections.sort((List)agenda.getItensAgenda());
		}
		return agenda;
	}
	/**
	 * @return a agenda
	 */
	@Override
	public String toString() {
		int j = 1;
		StringBuilder dados = new StringBuilder();
		Iterator<ItemAgenda> i = ItensAgenda.iterator();
		ItemAgenda object;
		dados.append("Agenda: \n");
		while(i.hasNext()) {
			object = i.next();
			dados.append(object.toString()).append("------------------\n");
			j++;
		}
		return dados.toString();
	}
}
