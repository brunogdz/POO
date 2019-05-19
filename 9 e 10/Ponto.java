package Heranca;

public class Ponto {
	private double x,y,limiteInf,limiteSup;
	static final public double  LIMITE_INFERIOR = 0;
	static final public double  LIMITE_SUPERIOR = 500;
	static private double valorInf = Ponto.LIMITE_INFERIOR;
	static private double valorSup = Ponto.LIMITE_SUPERIOR;


	public Ponto() {
		this.x= 0;
		this.y= 0;
	}
	public Ponto(double _x, double _y) {
		this.x= _x;
		this.y= _y;
	}
	public Ponto( String xy) {
		double x,y;
		int pos = xy.indexOf(",");
		int fim = xy.length();
		//Substring iniciando em 0 até posição do caracter especial
		x = (xy.substring(0, pos) );
		y = (xy.substring(pos,fim));
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public static void setLimiteInferior(double _valor) {
		Ponto.valorInf = _valor;
	}
	public static void setLimiteSuperior(double _valor) {
		Ponto.valorSup = _valor;
	}
	public static double getValorInf() {
	   	return Ponto.valorInf;
	   }
	public static double getValorSup() {
	   	return Ponto.valorSup;
	   }
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto other = (Ponto) obj;
		if (Double.doubleToLongBits(limiteInf) != Double.doubleToLongBits(other.limiteInf))
			return false;
		if (Double.doubleToLongBits(limiteSup) != Double.doubleToLongBits(other.limiteSup))
			return false;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}
	public void criaSwap(double _x, double _y)
	{
	     double aux = _x;
	     _x = _y;
	     _y = aux;
	}
	public boolean temEixoComum (double x1, double y1, double x2, double y2) {
		if ( x1 == x2) {
			return true;
		}
		if ( y1 == y2) {
			return true;
		}
		return false;
	}
	public static double distancia(double x1, double y1, double x2, double y2) {
		double d;
		 d = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		 return d;
	}
	public void calcularDoisParametros(double _x, double _y) {
		distancia(_x,_y,0,0);
	}
	public void calcularQuatroParametros(double _x, double _y,double _x2, double _y2) {
		distancia(_x,_y,_x2,_y2);
	}
	public double distancia(Ponto _ponto){
     	return Ponto.distancia(this.getX(),this.getY(),_ponto.getX(),_ponto.getY());
	}
	public double distanciaDaOrigem(){
     	return Ponto.distancia(this.getX(),this.getY(),0,0);
	}
	public int compareTo(Ponto _ponto){
     	if (this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
            	return 1;
     	else if(this.distanciaDaOrigem() < _ponto.distanciaDaOrigem())
            	return -1;
     	else
            	return 0;
	}

}

