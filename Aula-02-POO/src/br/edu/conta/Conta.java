package br.edu.conta;

import java.util.Scanner;

public class Conta {
	Scanner sc = new Scanner(System.in);
	
	private int numero;
	private double saldo;
	private double limite;
	private String nome;
	
	public double saca(double valor) {
		System.out.println("Qual o valor do saque? Seu saldo atual � de " + saldo);
		valor = sc.nextDouble();
		saldo = saldo - valor;
		System.out.println("Seu novo saldo � de: " + saldo);
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
	* Endere�o
	*/
	public void definirEndereco() {
		System.out.println("Digite o seu endere�o: ");
		endereco = sc.next();
	}
	public void alterarEndere�o() {
		System.out.println("Digite o seu novo endere�o: ");
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
	* Pa�s
	*/
	public void definirPais() {
		System.out.println("Digite o seu Pa�s: ");
		pais = sc.next();
	}
	public void alterarPais() {
		System.out.println("Digite o seu novo Pa�s: ");
		pais = sc.next();
	}
	/**
	* N�mero de cart�o de cr�dito
	*/
	public void definirNumeroCartaoCredito() {
		System.out.println("Digite o seu n�mero de cart�o de cr�dito: ");
		numeroCartaoCredito = sc.next();
	}
	public void alterarNumeroCartaoCredito() {
		System.out.println("Digite o seu novo n�mero de cart�o de cr�dito: ");
		numeroCartaoCredito = sc.next();
	}
	/**
	* Validade Cart�o
	*/
	public void definirNumeroCartaoCredito() {
		System.out.println("Digite o seu n�mero de cart�o de cr�dito: ");
		numeroCartaoCredito = sc.next();
	}
	public void alterarNumeroCartaoCredito() {
		System.out.println("Digite o seu novo n�mero de cart�o de cr�dito: ");
		numeroCartaoCredito = sc.next();
	}
	
}
