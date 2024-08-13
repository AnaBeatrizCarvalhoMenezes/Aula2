package br.edu.conta;

import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);
	
	private int numero;
	private double saldo;
	private double limite;
	private String nome;
	
	public double saca(double valor) {
		System.out.println("Qual o valor do saque? Seu saldo atual é de " + saldo);
		valor = sc.nextDouble();
		saldo = saldo - valor;
		System.out.println("Seu novo saldo é de: " + saldo);
		return valor;
	}
	
	/**
	 * Nome
	 */
	public void definirNome() {
		System.out.println("Digite o seu nome: ");
		nome = sc.next();
	}

	public void alterarNome() {
		System.out.println("Digite o seu novo nome: ");
		nome = sc.next();
	}
	
	/**
	* Endereço
	*/
	public void definirEndereco() {
		System.out.println("Digite o seu endereço: ");
		endereco = sc.next();
	}
	public void alterarEndereço() {
		System.out.println("Digite o seu novo endereço: ");
		endereco = sc.next();
	}
	/**
	* Telefone
	*/
	public void definirTelefone() {
		System.out.println("Digite o seu telefone: ");
		telefone = sc.next();
	}
	public void alterarTelefone() {
		System.out.println("Digite o seu novo telefone: ");
		telefone = sc.next();
	}
	/**
	* Email
	*/
	public void definirEmail() {
		System.out.println("Digite o seu email: ");
		email = sc.next();
	}
	public void alterarEmail() {
		System.out.println("Digite o seu novo email: ");
		email = sc.next();
	}
	/**
	* CPF
	*/
	public void definirCPF() {
		System.out.println("Digite o seu CPF: ");
		cpf = sc.next();
	}
	public void alterarCPF() {
		System.out.println("Digite o seu novo CPF: ");
		cpf = sc.next();
	}
	/**
	* Cidade
	*/
	public void definirCidade() {
		System.out.println("Digite a sua Cidade: ");
		cidade = sc.next();
	}
	public void alterarCidade() {
		System.out.println("Digite a sua nova Cidade: ");
		cidade = sc.next();
	}
	/**
	* CEP
	*/
	public void definirCEP() {
		System.out.println("Digite o seu CEP: ");
		cep = sc.next();
	}
	public void alterarCEP() {
		System.out.println("Digite o seu novo CEP: ");
		cep = sc.next();
	}
	/**
	* País
	*/
	public void definirPais() {
		System.out.println("Digite o seu País: ");
		pais = sc.next();
	}
	public void alterarPais() {
		System.out.println("Digite o seu novo País: ");
		pais = sc.next();
	}
	/**
	* Número de cartão de crédito
	*/
	public void definirNumeroCartaoCredito() {
		System.out.println("Digite o seu número de cartão de crédito: ");
		numeroCartaoCredito = sc.next();
	}
	public void alterarNumeroCartaoCredito() {
		System.out.println("Digite o seu novo número de cartão de crédito: ");
		numeroCartaoCredito = sc.next();
	}
	/**
	* Validade Cartão
	*/
	public void definirNumeroCartaoCredito() {
		System.out.println("Digite o seu número de cartão de crédito: ");
		numeroCartaoCredito = sc.next();
	}
	public void alterarNumeroCartaoCredito() {
		System.out.println("Digite o seu novo número de cartão de crédito: ");
		numeroCartaoCredito = sc.next();
	}
	
}
