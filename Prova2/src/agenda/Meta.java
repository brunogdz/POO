package agenda;

import tempo.Periodo;
/**
 * 
 * @author Bruno Gomes
 *
 */

public class Meta extends ItemAgenda implements Comparable<Meta>{
	/**prioridade que será usado na Agenda*/
	private int prioridade;

	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param_titulo
  	 * @param _descricao
  	 * @param_dtInicio
  	 * @param_dtFim
  	 * @param_horarioInicio
  	 * @param_horarioFim
  	 * @param _prioridade
  	 * 
  	 */
	public Meta(String _titulo, String _descricao, String _dtInicio, String _dtFim, String _horarioInicio, String _horarioFim, int _prioridade)throws Exception {
		super(_titulo, _descricao,_dtInicio,_dtFim,_horarioInicio,_horarioFim);
		this.setPrioridade(_prioridade);
	}
	
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param_titulo
  	 * @param _descricao
  	 * @param _periodo
  	 * @param _prioridade
  	 * 
  	 */
	public Meta(String _local, String _titulo, String _descricao, Periodo _periodo, int _prioridade) throws Exception {
		super(_titulo, _descricao,_periodo);
		this.setPrioridade(_prioridade);
	}
	/**
  	 * @return prioridade
  	 */
	public int getPrioridade() {
		return this.prioridade;
	}
	/**
  	 * Método para pegar a prioridade
  	 * 
  	 */

	public void setPrioridade(int _prioridade) {
		this.prioridade = _prioridade;
	}
	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */
	
	public String toString() {
		StringBuilder meta = new StringBuilder();
		meta.append("\n");
		meta.append(super.toString());
		meta.append("\nPrioridade: ").append(this.getPrioridade()).append("\n");
		return meta.toString();
	}
	/**
  	 * Método necessário, fornece um algoritmo compararar elementos
  	 *
  	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
  	 */
	public int compareTo(Meta novo) {

		         if(this.prioridade > novo.prioridade){

		             return -1;
		         }
		         else if(this.prioridade < novo.prioridade){

		             return 1;

		         }
		         else {
		        	 return 0;
		         }
	 }

	
	

}



