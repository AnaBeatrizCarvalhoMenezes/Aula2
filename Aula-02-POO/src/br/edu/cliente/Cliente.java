package br.edu.cliente;

import java.util.Scanner;

public class Cliente {
		Scanner sc = new Scanner(System.in);
		private String nome;
		private String endere�o;
		private String cpf;
		
		private void alterarNome() {
			System.out.println("Qual o novo nome?");
			nome = sc.next();
		}
		private void alterarEndere�o() {
			System.out.println("Qual o novo endere�o?");
			nome = sc.next();
		}
		
}
