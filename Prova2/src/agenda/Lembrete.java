package agenda;

import tempo.Periodo;
/**
 * 
 * @author Bruno
 *
 */
public class Lembrete extends ItemAgenda implements Comparable<Lembrete>{
	/**quantidade Minutos*/
	private int qtdMin;
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param_titulo
  	 * @param _descricao
  	 * @param_dtInicio
  	 * @param_dtFim
  	 * @param_horarioInicio
  	 * @param_horarioFim
  	 * @param _qtdMin
  	 * 
  	 */
	public Lembrete(String _titulo, String _descricao, String _dtInicio, String _dtFim, String _horarioInicio, String _horarioFim, int _qtdMin)throws Exception {
		super(_titulo, _descricao,_dtInicio,_dtFim,_horarioInicio,_horarioFim);
		this.setQtdMin(_qtdMin);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param_titulo
  	 * @param _descricao
  	 * @param _periodo
  	 * @param _qtdMin
  	 * 
  	 */
	public Lembrete(String _local, String _titulo, String _descricao, Periodo _periodo, int _qtdMin) throws Exception {
		super(_titulo, _descricao,_periodo);
		this.setQtdMin(_qtdMin);
	}
	/**
  	 * @return a quantidade de minutos
  	 */
	public int getQtdMin() {
		return this.qtdMin;
	}
	/**
  	 * Método para pegar a quantidade de minutos
  	 * 
  	 */
	public void setQtdMin(int _qtdMin) {
		this.qtdMin = _qtdMin;
	}
	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */
	public String toString() {
		StringBuilder lembrete = new StringBuilder();
		lembrete.append("\n");
		lembrete.append(super.toString());
		lembrete.append("\nMinutos antes do evento: ").append(this.getQtdMin()).append("\n");
		return lembrete.toString();
	
	}
	/**
  	 * Método necessário, fornece um algoritmo compararar elementos
  	 *
  	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
  	 */
	public int compareTo(Lembrete novo) {

        if(this.qtdMin > novo.qtdMin){

            return -1;
        }
        else if(this.qtdMin < novo.qtdMin){

            return 1;

        }
        else {
       	 return 0;
        }
}
}
