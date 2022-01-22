package br.com.contaorobj;

import java.util.Scanner;

import br.com.contaorobjmodel.contaInvestimento;
import br.com.contaorobjmodel.contaPoupanca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int op;
		int oc;
		contaPoupanca cp = null;
		contaInvestimento ci = null;
		
		do {
		System.out.println("1.Abrir Conta"); 
		System.out.println("2.Sacar");
		System.out.println("3.Depositar");
		System.out.println("4.Saldo");
		System.out.println("5.Sair");
		op = input.nextInt();
		
		if (op==1) {
			System.out.println("Qual tipo de conta?\n1.Poupança\n2.Investimento");
			oc = input.nextInt();
			if(oc == 1) {
				cp = new contaPoupanca();
			}else {
				ci = new contaInvestimento();
			}
			System.out.println("Conta criada com sucesso!");
		}else if (op==2) {
			
		}else if (op==3) {
			
		}else if (op==4) {
			System.out.println("Qual tipo de conta?\n1.Poupança\n2.Investimento");
			oc = input.nextInt();
			if (oc==1) {
				System.out.println("Saldo da sua conta Poupança é: "+cp.getSaldo());
			}else {
				System.out.println("Saldo da sua conta Investimento é: "+ci.getSaldo());
			
			}
		}
		
		}while(op!=5);

	}

}
