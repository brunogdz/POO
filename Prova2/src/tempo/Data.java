package tempo;



/**
 * Usado para fazer as datas nas outras classes
 * <p>
 * CompareTo e Implementa estao no programa pra auxiliar caso necessite futuramente
 * 
 * @version 1.0 (junho 2019)
 * @author R2Eclipse
 *
 */

public class Data {
	/** numero dos dias, meses e anos que forem digitados*/
	private int dia, mes, ano;
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param _dia dia que o usuario digitar
  	 * @param _mes mes que o usuario digitar
  	 * @param _ano ano que o usuario digitar
  	 */

	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param _dia dia que o usuario digitar
  	 * @param _mes mes em forma de String
  	 * @param _ano ano que o usuario digitar
  	 */
	
	public Data(int _dia, String _mesStr, int _ano) throws Exception {
		this.setData(_dia, _mesStr, _ano);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param data em forma de String
  	 */
	
	public Data(String _dtStr) throws Exception {
		this.setData(_dtStr);
	}
	/**
  	 * construtor para inicializar valores nos campos
  	 *
  	 * @param data que não foi usado nenhum valor
  	 */
	
	public Data() throws Exception {
		this(1,1,1900);
	}	
	/**
  	 * pega o dia
  	 *
  	 * @return dia
  	 */

	public int getDia() {
		return this.dia;
	}
	/**
  	 * pega o mes
  	 *
  	 * @return mes
  	 */

	public int getMes() {
		return this.mes;
	}
	/**
  	 * pega o ano
  	 *
  	 * @return ano
  	 */

	public int getAno() {
		return this.ano;
	}
	/**
  	 * Método para fazer a data, fazendo a verificacao se é valida
  	 * 
  	 */

	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if(Data.isDataValida(_dia,_mes,_ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		}else {
			throw new Exception("Data invalida.");
		}
	}
	/**
  	 * Método usado para o formato, int, String, int.
  	 * <p>
  	 * Caso a pessoa digite o mes em forma String, entra no equals pra verificar o mes
  	 * 
  	 */

	public void setData(int _dia, String _mesStr, int _ano) throws Exception {
		int mes_int = 0;
		if(_mesStr.equals("janeiro")) _mesStr = "1" ;
		if(_mesStr.contentEquals("fevereiro")) _mesStr = "2" ;
		if(_mesStr.contentEquals("março")) _mesStr = "3";
		if(_mesStr.contentEquals("abril")) _mesStr = "4";
		if(_mesStr.contentEquals("maio")) _mesStr = "5";
		if(_mesStr.contentEquals("junho")) _mesStr = "6";
		if(_mesStr.contentEquals("julho")) _mesStr = "7";
		if(_mesStr.contentEquals("agosto")) _mesStr = "8";
		if(_mesStr.contentEquals("setembro")) _mesStr = "9";
		if(_mesStr.contentEquals("outubro")) _mesStr = "10";
		if(_mesStr.contentEquals("novembro")) _mesStr = "11";
		if(_mesStr.contentEquals("dezembro")) _mesStr = "12";
		mes_int = Integer.parseInt(_mesStr);
		this.setData(_dia, mes_int, _ano);
	}
	/**
  	 * Método para fazer a data caso não tenha o dia informado
  	 *
  	 */

	public void setData(int _mes, int _ano) throws Exception {
		this.setData(1, _mes, _ano);
	}
	
	/**
  	 * Método para fazer o formato da data de String para numeros, usando o indexOf pra pegar no 
  	 * formato correto. Sendo necessario que o usuario digite com "/"
  	 */

	public void setData(String dtStr) throws Exception {
		int _dia;
		int _mes;
		int _ano;
		int cont;
		cont = dtStr.indexOf("/");
		// Formato: "dd	"
		if(cont == 2) {
			_dia = Integer.parseInt(dtStr.substring(0,2));
			cont = dtStr.indexOf("/",3);	
			// Formato: "dd/m/aaaa"
			if(cont == 4) {
				_mes = Integer.parseInt(dtStr.substring(3,4));
				_ano = Integer.parseInt(dtStr.substring(5,9));
			}else {		// Formato: "dd/mm/aaaa"
				_mes = Integer.parseInt(dtStr.substring(3,5));
				_ano = Integer.parseInt(dtStr.substring(6,10));
			}
		// Formato: "d"
		}else {
			_dia = Integer.parseInt(dtStr.substring(0,1));
			cont = dtStr.indexOf("/",2);
			// Formato: "d/m/aaaa"
			if(cont == 3) {
				_mes = Integer.parseInt(dtStr.substring(2,3));
				_ano = Integer.parseInt(dtStr.substring(4,8));
			}else {		// Formato: "d/mm/aaaa"
				_mes = Integer.parseInt(dtStr.substring(2,4));
				_ano = Integer.parseInt(dtStr.substring(5,9));
			}
		}	
		this.setData(_dia,_mes,_ano);
	}
	/**
  	 * Método usado para verificar se há datas iguais
  	 * 
  	 * @return true ou false
  	 */

	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if( this.getDia() == (aux.getDia()) &&
				this.getMes() == (aux.getMes()) &&
				this.getAno() == (aux.getAno()) ) {
			return true;
		}
		return false;
	}
	/**
  	 * Método necessário, fornece um algoritmo compararar elementos
  	 *
  	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
  	 */

	public int compareTo(Data date2) throws Exception {
		if( this.getAno() > date2.getAno() ) {
			return 1;
		}
		if( this.getAno() < date2.getAno() ) {
			return -1;
		}
		else {
			if( this.getMes() > date2.getMes() ) {
				return 1;
			}
			if( this.getMes() < date2.getMes() ) {
				return -1;
			}
			else {
				if(this.getDia() > date2.getDia()) {
					return 1;
				}
				if(this.getDia() < date2.getDia()) {
					return -1;
				}
			}
		}
		return 0;
	}
	/**
  	 * Metodo para verificar se a data tem validade
  	 *
  	 * @return true se for valida e false se for invalida
  	 */

	public static boolean isDataValida(int d, int m, int a) {
		if(d<1 || d>31) return false;
		
		if(m<1 || m>12) return false;
			
		if(a < 1582) return false;
		
		if((m==4 || m==6 || m==9 || m==11) && (d>30)) return false;
		
		if(m==2 && d>=29) {
			if(d>29) return false;
			if( Data.isBissexto(a) == false ) return false;
		}
		return true;
	}	
	
	/**
  	 * Método estatico para verificar se é bissexto, caso for a data pode ser verificada caso 
  	 * o usuario digite um valor que nao esta no parametros
  	 * 
  	 * @return true ou falso
  	 */

	public static boolean isBissexto(int a) {
		if(a%4==0) {
			if(a%100!=0) return true;
			else {
				if(a%400==0) return true;
			}
		}
		return false;
	}
	/**
  	 * Método para acrescentar no dia, ou no mes ou ano
  	 *
  	 * @return dia+1 ou mes+1 ou ano+1
  	 */

	public void incrementa() {	
		try{
			this.setData(getDia()+1,getMes(),getAno());
		}
		catch(Exception dia){
			try{
				this.setData(1,getMes()+1,getAno());
			}
			catch(Exception mes){
				try {
					this.setData(1,1,getAno()+1);
				}
				catch(Exception ano) {
				}
			}
		}
		return;
	}
	
	/**
  	 * Método para verificar se os numeros estao certos e cria uma nova data se for errado
  	 *
  	 * @return data
  	 */

	public static Data verificaECriaData(int d, int m, int a) throws Exception {
		Data data;
		try{
			data = new Data(d,m,a);
		}
		catch(Exception e){
			return null;
		}
		return data;
	}
	/**
  	 * Método sobreposto para devolver os campos formatados em uma String
  	 *
  	 * @return retorna String com todos os valores dos campos
  	 */

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}	
}