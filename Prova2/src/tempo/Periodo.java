package tempo;
/**
 * 
 * @author Bruno
 *
 */
public class Periodo {
	/**
	 * Ter o horario inicial e final do periodo
	 */
	Data dtInicio, dtFim;
	Horario horarioInicio, horarioFim;

	/**
	 * construtor para inicializar valores nos campos
	 * 
	 * @param_dtInicio
	 * @param_dtFim
	 * @param_horarioInicio
	 * @param_horarioFim
	 * 
	 */
	public Periodo(Data _dtInicio, Data _dtFim, Horario _horarioInicio, Horario _horarioFim) {
		this.setDtInicio(_dtInicio);
		this.setDtFim(_dtFim);
		this.setHorarioInicio(_horarioInicio);
		this.setHorarioFim(_horarioFim);
	}
	/**
	 * construtor para inicializar valores nos campos
	 * 
	 * @param_dtInicio se for uma String
	 * @param_dtFim se for em String
	 * @param_horarioInicio
	 * @param_horarioFim
	 * 
	 */

	public Periodo(String _dtInicioStr, String _dtFimStr, Horario _horarioInicio, Horario _horarioFim) throws Exception {
		this.setDtInicio(new Data(_dtInicioStr));
		this.setDtFim(new Data(_dtFimStr));
		this.setHorarioInicio(_horarioInicio);
		this.setHorarioFim(_horarioFim);
	}
	/**
	 * construtor para inicializar valores nos campos
	 * 
	 * @param_dtInicio se for uma String
	 * @param_dtFim se for em String
	 * @param_horarioInicio se for em String
	 * @param_horarioFim se for em String
	 * 
	 */

	public Periodo(String _dtInicioStr, String _dtFimStr, String _horarioInicio, String _horarioFim) throws Exception {
		this.setDtInicio(new Data(_dtInicioStr));
		this.setDtFim(new Data(_dtFimStr));
		this.setHorarioInicio(new Horario(_horarioInicio));
		this.setHorarioFim(new Horario(_horarioFim));
	}
	/**
	 * 
	 * @return a data inicio
	 */
	public Data getDtInicio() {
		return this.dtInicio;
	}
	/**
	 * 
	 * @param _dtInicio
	 */
	public void setDtInicio(Data _dtInicio) {
		this.dtInicio = _dtInicio;
	}
	/**
	 * 
	 * @return a data final
	 */
	public Data getDtFim() {
		return this.dtFim;
	}
	/**
	 * 
	 * @param _dtFim
	 */
	public void setDtFim(Data _dtFim) {
		this.dtFim = _dtFim;
	}
	/**
	 * 
	 * @return o horario inicial
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}
	/**
	 * 
	 * @param _horarioInicio
	 */
	public void setHorarioInicio(Horario _horarioInicio) {
		this.horarioInicio = _horarioInicio;
	}
	/**
	 * 
	 * @return horario final
	 */
	public Horario getHorarioFim() {
		return this.horarioFim;
	}
	/**
	 * 
	 * @param _horarioFim
	 */
	public void setHorarioFim(Horario _horarioFim) {
		this.horarioFim = _horarioFim;
	}
	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */
	public String toString() {
		StringBuilder periodo = new StringBuilder();
		periodo.append("\nData Inicial:");
		periodo.append(this.getDtInicio());
		periodo.append("\nData Fim:");
		periodo.append(this.getDtFim());
		periodo.append("\nHorario Inicial:");
		periodo.append(this.getHorarioInicio());
		periodo.append("\nHorario Final:");
		periodo.append(this.getHorarioFim());
		return periodo.toString();		
	}
}
