package Heranca;
import java.util.Scanner;

public class Uso {
	public static void main(String args[]) throws Exception {
		final int QTDE = 50;

		Contato vetor[] = new Contato[QTDE];
		String nome, gmail, endereco;
		double renda, celular, salario;
		int opcao;
		for(int i=0; i < QTDE; i++) {
			System.out.println("\nCadastro: " + (i+1) + "\n(1)Contato, (2)Cliente: ");
			opcao = new Scanner(System.in).nextInt();

			try {
				switch(opcao) {
				case 1: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).next();
					System.out.println("Email: ");
					gmail = new Scanner(System.in).next();
					vetor[i] = new Contato(nome, gmail);
					break;
				case 2: 
					System.out.println("Nome: ");
					nome = new Scanner(System.in).next();
					System.out.println("Email: ");
					gmail = new Scanner(System.in).next();
					System.out.println("Celular:");
					celular = new Scanner(System.in).nextDouble();
					System.out.println("Renda: ");
					renda = new Scanner(System.in).nextDouble();
					System.out.println("Endereco: ");
					endereco = new Scanner(System.in).next();
					vetor[i] = new Cliente(nome, gmail, celular, renda, endereco);
					break;
				default:
					i--;
					continue;
				}
			}

			catch(Exception e) {
				System.out.println(e);
				i--;
				continue;
			}
		}
	}
}
}