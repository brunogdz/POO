package exercicio24;

public class Sorteio {
	 
	private Data data;
	private NumerosSorteados numeros;
	
	
	public Sorteio(Data _data) {
		this.setData(_data);
		this.setNumeros(new NumerosSorteados());
	}
	
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public NumerosSorteados getNumeros() {
		return numeros;
	}

	public void setNumeros(NumerosSorteados numeros) {
		this.numeros = numeros;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getData().toString());
		dados.append(" ");
		dados.append(this.getNumeros().toString());
		return dados.toString();
	}
	
	
}