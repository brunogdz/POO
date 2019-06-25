package tempo;

/**
 * Usado para fazer os horarios nas outras classes
 * <p>
 * CompareTo e Implementa estao no programa pra auxiliar caso necessite futuramente
 * 
 * @version 1.0 (junho 2019)
 * @author R2Eclipse
 *
 */
public class Horario {
	/** numero das horas, minutos e segundos que forem digitados*/
	private int hora, min, seg;
	
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param _hora hora 
  	 * @param _min minutos 
  	 * @param _seg segundos
  	 */

	public Horario(int _hora, int _min, int _seg) throws Exception {
		this.setHorario(_hora, _min, _seg);
	}
	/**
  	 * construtor para inicializar somente hora e minutos
  	 *
  	 * @param _hora hora 
  	 * @param _min minutos 
  	 */
	
	public Horario(int _hora, int _min) throws Exception {
		this.setHorario(_hora, _min);
	}
	/**
  	 * construtor para inicializar somente a hora
  	 *
  	 * @param _hora hora
  	 */
	
	public Horario(int _hora) throws Exception {
		this.setHorario(_hora);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param _horarioStr formato em String para facilitar na digitalização nas outras classes
  	 */
	
	public Horario(String _horarioStr) throws Exception{
		this.setHorario(_horarioStr);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 */

	public Horario() throws Exception {
		this.setHorario(0, 0, 0);
	}
	/**
  	 * pega a hora
  	 *
  	 * @return hora
  	 */
	
	public int getHora() {
		return this.hora;
	}
	/**
  	 * pega os minutos
  	 *
  	 * @return min
  	 */

	public int getMin() {
		return this.min;
	}
	/**
  	 * pega os segundos
 	 *
 	 * @return seg
 	 */

	public int getSeg() {
		return this.seg;
	}
	/**
  	 * Método para fazer o horario e verificando se tem validade
  	 * 
  	 */

	public void setHorario(int _hora, int _min, int _seg) throws Exception {
		if (Horario.isHorarioValido(_hora, _min, _seg)) {
			this.hora = _hora;
			this.min = _min;
			this.seg = _seg;
		} else {
			throw new Exception("Horario invalido.");
		}
	}
	/**
  	 * Método para fazer o horario com apenas horas e minutos
  	 * 
  	 */

	public void setHorario(int _hora, int _min) throws Exception {
		this.setHorario(_hora, _min, 0);
	}
	/**
  	 * Método para fazer o horario somente com as horas
  	 * 
  	 */

	public void setHorario(int _hora) throws Exception {
		this.setHorario(_hora, 0, 0);
	}
	/**
  	 * Método para fazer o horario no formato String
  	 * 
  	 */

	public void setHorario(String horarioStr) throws Exception {
		int _hora;
		int _min;
		int _seg;
		int cont;
		cont = horarioStr.indexOf(":");
		// Formato: "dd	"
		if(cont == 2) {
			_hora = Integer.parseInt(horarioStr.substring(0,2));
			cont = horarioStr.indexOf(":",3);	
			// Formato: "00/0/00"
			if(cont == 4) {
				_min = Integer.parseInt(horarioStr.substring(3,4));
				_seg = Integer.parseInt(horarioStr.substring(5,7));
			}else {		// Formato: "00/00/00"
				_min = Integer.parseInt(horarioStr.substring(3,5));
				_seg = Integer.parseInt(horarioStr.substring(6,8));
			}
		// Formato: "hora - 0/00/00"
		}else {
			_hora = Integer.parseInt(horarioStr.substring(0,1));
			cont = horarioStr.indexOf(":",2);
			// Formato: "0/0/00"
			if(cont == 3) {
				_min = Integer.parseInt(horarioStr.substring(2,3));
				_seg = Integer.parseInt(horarioStr.substring(4,6));
			}else {		// Formato: "0/00/00"
				_min = Integer.parseInt(horarioStr.substring(2,4));
				_seg = Integer.parseInt(horarioStr.substring(5,7));
			}
		}	
		this.setHorario(_hora,_min,_seg);
	}
	/**
  	 * Método estático para ver se o horario tem validade
  	 * 
  	 * @return true ou false
  	 */

	public static boolean isHorarioValido(int _hora, int _min, int _seg) {
		if(_hora<0 || _hora>24) return false;

		if(_min<0 || _min>59) return false;

		if(_seg<0 || _seg>59) return false;

		return true;
	}
	/**
  	 * Método para acrescentar 1 na hora ou no minuto ou nos segundos
  	 * 
  	 * @return hora+1 ou min+1 ou seg+1
  	 */

	public void incrementa() {	
		try{
			this.setHorario(getHora()+1,getMin(),getSeg());
		}
		catch(Exception hora){
			try{
				this.setHorario(0,getMin()+1,getSeg());
			}
			catch(Exception min){
				try {
					this.setHorario(0,0,getSeg()+1);
				}
				catch(Exception seg) {
				}
			}
		}
		return;
	}
	/**
  	 * Método para fazer a verificacao se sao iguais
  	 * 
  	 * @return true ou false
  	 */

	public boolean equals(Object objeto) {
		Horario aux = (Horario)objeto;
		if( this.getHora() == (aux.getHora()) &&
				this.getMin() == (aux.getMin()) &&
				this.getSeg() == (aux.getSeg()) ) {
			return true;
		}
		return false;
	}
	/**
  	 * Método necessário, fornece um algoritmo compararar elementos
  	 *
  	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
  	 */

	public int compareTo(Horario horario2) throws Exception {
		if( this.getHora() > horario2.getHora() ) {
			return 1;
		}
		if( this.getHora() < horario2.getHora() ) {
			return -1;
		}
		else {
			if( this.getMin() > horario2.getMin() ) {
				return 1;
			}
			if( this.getMin() < horario2.getMin() ) {
				return -1;
			}
			else {
				if(this.getSeg() > horario2.getSeg()) {
					return 1;
				}
				if(this.getSeg() < horario2.getSeg()) {
					return -1;
				}
			}
		}
		return 0;
	}
	/**
  	 * Método para verificar se os numeros estao certos e cria uma novo horario se for errado
  	 *
  	 * @return horario
  	 */
	public static Horario verificaECriaHorario(int h, int m, int s) throws Exception {
		Horario horario;
		try{
			horario = new Horario(h,m,s);
		}
		catch(Exception e){
			return null;
		}
		return horario;
	}
	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getHora());
		dados.append(":");
		dados.append(this.getMin());
		dados.append(":");
		dados.append(this.getSeg());
		return dados.toString();
	}
}