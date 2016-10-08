package br.edu.unoesc;

import java.util.Scanner;

public class Exer8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maioridade = 0;
		double total = 0;
		double  f = 0;
		for (int i = 0; i < 10000000; i++) {
			String eyescolor[] = new String[i+1];
			String haircolor[] = new String[i+1];
			String sexo[] = new String[i+1];
			Integer idade[] = new Integer[i+1];
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			if(idade[i] == -1)
				break;
			if(idade[i]>maioridade)
				maioridade = idade[i];
			
			System.out.println("Cor dos olhos: ");
			eyescolor[i] = sc.next();
			System.out.println("Cor do cabelo: ");
			haircolor[i] = sc.next();
			System.out.println("Sexo: ");
			sexo[i] = sc.next();
			if(sexo[i].equalsIgnoreCase("f")&&idade[i]>18&&idade[i]<35&&eyescolor[i].equalsIgnoreCase("verde")&&haircolor[i].equalsIgnoreCase("louro"))
				f++;
			total++;
		}
		double p = (f/total)*100;
		System.out.println("Maior idade dentre os habitantes: "+maioridade);
		System.out.println("Porcentagem de mulheres com idade entre 18 e 35 anos com olhos verde e cabelos louros: "+p+"%");
		sc.close();
	}
}
