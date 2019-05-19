import java.util.Scanner;

public class Uso{
	public static void main(String[] args) {
		/*
    	Data x = new Data(11,02,2010);
        Data y = new Data(12,02,2009);
        Data z = new Data(03,2009);
        Data t = new Data(10,"Fevereiro",2009);
        Data v = new Data();
        Data i = new Data(11,02,2010);




        x.isDataValida(29, 2, 2008);

        x.isDataValida(30, 2, 2008);

        x.isDataValida(29, 2, 2009);

        x.isDataValida(31, 4, 2009);

        x.isDataValida(31, 3, 2009);

        x.isDataValida(32, 12, 2009);

        x.isDataValida(31, 13, 2009);

        x.isDataValida(31, 12, 1581);


        System.out.println("Os dois objetos são iguais:" + x.equals(i));
		 
		int j=0;
		while(j!=4){

			try{
				Data teste = new Data();
				System.out.println("Escreva o dia:");
				int dia = new Scanner(System.in).nextInt();
				System.out.println("Escreva o mes:");
				int mes = new Scanner(System.in).nextInt();
				System.out.println("Escreva o ano:");
				int ano = new Scanner(System.in).nextInt();
				teste.setData(dia, mes, ano);
				System.out.println(teste);
				break;
			}
			catch(Exception e){
				System.out.println("Data inválida, digite novamente!");
				j++;
				if(j==3){
					Data teste = new Data();
					try{
						teste.setData(1, 1, 1900);
						System.out.println(teste);
						break;
					}catch(Exception e2){

					}

				}
			}
		}

		*/


		int o;
		try{
			Data incre = new Data();
			System.out.println("Escreva o dia:");
			int dia = new Scanner(System.in).nextInt();
			System.out.println("Escreva o mes:");
			int mes = new Scanner(System.in).nextInt();
			System.out.println("Escreva o ano:");
			int ano = new Scanner(System.in).nextInt();
			incre.setData(dia, mes, ano);
			System.out.println("Escreva a quantidade de incrementos:");
			int valorloop = new Scanner(System.in).nextInt();
			for(o=0;o<valorloop;o++){
				incre.incrementar();

			}
			System.out.println(incre);
			
		}
		catch(Exception e){
			System.out.println("Data inválida, digite novamente!");
			

			/*
	private static void While(boolean b) {
		// TODO Auto-generated method stub

	}*/
		}
	}
}
