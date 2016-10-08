package br.edu.unoesc;

import java.util.Scanner;

public class Exer2 {

	public static boolean isZero(float num){
		boolean resposta = false;
		if(num!=0)
			resposta = true;
		return resposta; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número para saber se é nulo");
		float num = sc.nextFloat();
		boolean resposta = isZero(num);
		if(resposta)
		System.out.println("O numero nao é nulo");
		else
		System.out.println("O numero é nulo");
		sc.close();

	}

}
