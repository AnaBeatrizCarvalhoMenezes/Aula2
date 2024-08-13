package br.edu.cliente;

import java.util.Scanner;

public class Cliente {
		Scanner sc = new Scanner(System.in);
		private String nome;
		private String endereço;
		private String cpf;
		
		private void alterarNome() {
			System.out.println("Qual o novo nome?");
			nome = sc.next();
		}
		private void alterarEndereço() {
			System.out.println("Qual o novo endereço?");
			nome = sc.next();
		}
		
}
