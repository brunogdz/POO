package agenda;

import tempo.Periodo;
/**
 * 
 * @author Bruno
 *
 */

abstract public class ItemAgenda {
	/**Titulo e descricao e o periodo de tempo dos itens da Agenda*/
	private String titulo, descricao;
	Periodo periodo;
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param_titulo
  	 * @param _descricao
  	 * @param_dtInicio
  	 * @param_dtFim
  	 * @param_horarioInicio
  	 * @param_horarioFim
  	 * 
  	 */
	
	public ItemAgenda(String _titulo, String _descricao, String _dtInicio, String _dtFim, String _horarioInicio, String _horarioFim) throws Exception {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(new Periodo(_dtInicio, _dtFim, _horarioInicio, _horarioFim));
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param_titulo
  	 * @param _descricao
  	 * @param _periodo
  	 * 
  	 */
	public ItemAgenda(String _titulo, String _descricao, Periodo _periodo) throws Exception {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
	}
	/**
  	 * @return titulo
  	 */
	
	public String getTitulo() {
		return this.titulo;
	}
	/**
  	 * Método para pegar o titulo
  	 * 
  	 */
	
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}
	/**
  	 * @return descricao
  	 */
	
	public String getDescricao() {
		return this.descricao;
	}
	/**
  	 * Método para pegar a descricao
  	 * 
  	 */
	
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}
	/**
  	 * @return periodo
  	 */
	
	public Periodo getPeriodo() {
		return this.periodo;
	}
	/**
  	 * metodo para pegar o periodo 
  	 */
	
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}
	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */
	
	public  String toString() {
		StringBuilder itemAgenda = new StringBuilder();
		itemAgenda.append("Titulo:");
		itemAgenda.append(this.getTitulo());
		itemAgenda.append("\nDescricao:");
		itemAgenda.append(this.getDescricao());
		itemAgenda.append("\nData Inicial:");
		itemAgenda.append(this.getPeriodo().getDtInicio());
		itemAgenda.append("\nData Fim:");
		itemAgenda.append(this.getPeriodo().getDtFim());
		itemAgenda.append("\nHorario Inicial:");
		itemAgenda.append(this.getPeriodo().getHorarioInicio());
		itemAgenda.append("\nHorario Final:");
		itemAgenda.append(this.getPeriodo().getHorarioFim());
		return itemAgenda.toString();		
	}
	/**
  	 * Método para fazer a comparacao do periodo 
  	 *
  	 * @return retorna o compareTo dos periodos do inicio dos 2 objetos
  	 */
	
	public int compare(ItemAgenda o1, ItemAgenda o2) throws Exception {
		return o1.getPeriodo().getDtInicio().compareTo(o2.getPeriodo().getDtInicio());
	}
	/**
  	 * Método para fazer a comparacao do evento, feito pelo proprio compilador para nao dar erro
  	 * na classe Evento
  	 *
  	 * @return 0
  	 */
	
	public int compare(Evento local1, Evento local2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
 
}

