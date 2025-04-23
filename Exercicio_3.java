package lista_repetição;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;

		System.out.print("Informe seu nome: ");
		nome = ler.next();

		for (int i = 1; i <= 10; i++) {
		System.out.println ("Seu nome é: " + nome);

		}

	}

}
