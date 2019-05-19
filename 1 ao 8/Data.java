/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author R2Eclipse
 */
public class Data {
	private int dia, mes, ano;

	
	public Data(int _dia, int _mes, int _ano)throws Exception{
		this.setData(_dia, _mes, _ano);
	}
	public Data(int _mes, int _ano)throws Exception{
		this.setData(1, _mes, _ano);
	}

	public Data(){
		this.dia = 1;
		this.mes = 1;
		this.ano = 1900;
	}
	public Data(String data) throws Exception{
		int dia, mes, ano;
		dia = Integer.parseInt(data.substring(0,2));
		mes = Integer.parseInt(data.substring(3,5));
		ano = Integer.parseInt(data.substring(6,10));
		this.setData(dia, mes, ano);
	}

	public Data(int _dia, String mesa, int _ano) throws Exception{  
		int mesint = 0;
		switch (mesa) {

		case "Janeiro":mesint= 1;break; 
		case "Fevereiro":mesint= 2; break;
		case "Março":mesint= 3; break;
		case "Abril":mesint= 4; break;
		case "Maio":mesint= 5; break;
		case "Junho":mesint= 6; break;
		case "Julho":mesint= 7; break;
		case "Agosto":mesint= 8; break;
		case "Setembro":mesint= 9; break;
		case "Outubro":mesint= 10; break;
		case "Novembro":mesint= 11; break;
		case "Dezembro":mesint= 12; break;
		default: break;

		}
		this.setData(_dia, mesint, _ano);
	}
	/* Métodos de interface para acesso aos campos privados */


	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;    
	}

	public void setData(int _dia, int _mes, int _ano) throws Exception {
		
		if(isDataValida(_dia, _mes, _ano) == true){
			this.dia= _dia;
			this.mes= _mes;
			this.ano= _ano;
		}
		
		else{
			throw new Exception("data invalida");

		}
	}
	
	public void incrementar(){
		try{
			this.setData(this.getDia()+1, this.getMes(), this.getAno());
		}catch(Exception e){
			try{
				this.setData(1, this.getMes()+1, this.getAno());
			}catch(Exception e2){
				try{
					this.setData(1, 1, this.getAno()+1);
				}catch(Exception e3){
					
				}
			}
		}
	}

	public static boolean isBissexto(int ano){

		if(ano % 400 == 0){
			return true;
			// se o ano for menor que 400
		} else if((ano % 4 == 0) && (ano % 100 != 0)){
			return true;
		} else{
			return false; 
		}
	}
	public void Printar() {
		if(isDataValida(dia, mes, ano) == true) {
			System.out.println("Valido");
		} if(isDataValida(dia, mes, ano) == false){
			System.out.println("Invalido");
		}
	}
	public String toString(){
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		
		return dados.toString();
	} 

	public static boolean isDataValida (int dia, int mes, int ano) {

		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


		boolean test;
		if (isBissexto(ano) == true) {

			if((mes == 2) && (dia == 29)) {
				return true;
			}
		}if (mes <= 12) {
			test = true;
		}else {
			return false;
		}
		if (days[(mes-1)] >= dia) {
			test = true;
		}else {
			return false;
		}

		if (ano >= 1582) {
			test = true;
		}
		else {
			return false;
		}
		return test;
	}
	public boolean equals(Object objeto) {
		Data aux = (Data)objeto;
		if (objeto == null) {
			return false;
		}
		if ((this.getDia() == (aux.getDia())) && this.getMes() == aux.getMes() && this.getAno() == aux.getAno()){
			return true;
		}else {
			return false;
		}
	}
	
	public int compareTo(Data date2) throws Exception{
		if(this.getAno() > date2.getAno()) {
			return 1;
		}
		if( this.getAno() < date2.getAno()) {
			return -1;
		}
		else {
			if( this.getMes() > date2.getMes()) {
				return 1;
			}
			if(this.getMes() < date2.getMes()) {
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
	@SuppressWarnings("finally")
	static Data verificaECriaData (int dia, int mes, int ano) {
		try {
			Data veri = new Data();
			isDataValida(dia, mes, ano);
			if(isDataValida(dia, mes, ano) == true) {
				veri.setData(dia, mes, ano);
			}
		}finally{
			return null;
		}
	}

}

