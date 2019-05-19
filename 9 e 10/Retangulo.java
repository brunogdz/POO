package Heranca;

public class Retangulo extends Ponto {

	public Retangulo(double x1, double y1, double x2, double y2) {
		/*super.setX(x1);
		super.setY(y1);
		super.setX(x2);
		super.setY(y2);
		*/
		Ponto primeiro = new Ponto(x1,y1);
		Ponto segundo = new Ponto(x2,y2);
		

	}
	public Retangulo(double _x1, double _y1) {
		Ponto terceiro = new Ponto(_x1,_y1);
	}
	
	public Retangulo() {
		Ponto quarto = new Ponto();
	}
	
	public double valorX() {
		return super.getX();
	}
	public double valorY() {
		return super.getY();
	}
	
	public static double Area(double x, double y) {
		return x*y;
	}
	public static double perimetro( double x, double y) {
		return ((2*x)+(2*y));
	}
	public String toString() {
		return super.toString()
				+ "- " +super.toString() ;
	}	
}
