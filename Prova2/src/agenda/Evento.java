package agenda;

import java.util.Comparator;

import tempo.Periodo;

/**
 * 
 * @author Bruno Gomes
 *
 */
public class Evento extends ItemAgenda implements Comparable<Evento>{
	/**Local do evento, será usado na Agenda*/
	private String local;

	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 *@param _local
  	 * @param_titulo
  	 * @param _descricao
  	 * @param_dtInicio
  	 * @param_dtFim
  	 * @param_horarioInicio
  	 * @param_horarioFim
  	 * 
  	 */
	public Evento(String _local, String _titulo, String _descricao, String _dtInicio, String _dtFim, String _horarioInicio, String _horarioFim) throws Exception {
		super(_titulo, _descricao,_dtInicio,_dtFim,_horarioInicio,_horarioFim);
		this.setLocal(_local);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param _local
  	 * @param_titulo
  	 * @param _descricao
  	 * @param _periodo
  	 * 
  	 */
	
	public Evento(String _local, String _titulo, String _descricao, Periodo _periodo) throws Exception {
		super(_titulo, _descricao,_periodo);
		this.setLocal(_local);
	}
	/**
  	 * @return prioridade
  	 */
	public String getLocal() {
		return this.local;
	}
	/**
  	 * Método para pegar a prioridade
  	 * 
  	 */
	public void setLocal(String _local) {
		this.local = _local;
	}

	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */
	@Override
	public String toString() {
		StringBuilder evento = new StringBuilder();
		evento.append("\n");
		evento.append(super.toString());
		evento.append("\nLocal: ").append(this.getLocal()).append("\n");
		return evento.toString();

	}
	/**
  	 * Método para comparar os eventos
  	 *
  	 * @return 0
  	 */
	public int compareTo(Evento o) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
/**
 * @return compara sem levar em consideracao letras maiuscula e minuscula
 */

class MeuComparador implements Comparator{
	public int compare(Evento local1, Evento local2) {

		return local1.getLocal().compareTo(local2.getLocal());
	}
	/**
	 * método para fazer a verificacao
	 */
	public int compare(int o1, int o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

