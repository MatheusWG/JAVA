package br.edu.unoesc;

import java.util.Random;

public class Exer5 {

	public static int[] Dado() {
		Random rnd = new Random();
		int dado[] = new int[1000000];
		for (int i = 0; i < 1000000; i++) {
			dado[i] = 1 + rnd.nextInt(6);
		}
		return dado;
	}

	public static void main(String[] args) {
		int vlr1, vlr2, vlr3, vlr4, vlr5, vlr6;
		vlr1 = vlr2 = vlr3 = vlr4 = vlr5 = vlr6 = 0;
		int vet[] = new int[1000000];
		vet = Dado();
		for (int i = 0; i < 1000000; i++) {
			if(vet[i]==1)
				vlr1++;
			if(vet[i]==2)
				vlr2++;
			if(vet[i]==3)
				vlr3++;
			if(vet[i]==4)
				vlr4++;
			if(vet[i]==5)
				vlr5++;
			if(vet[i]==6)
				vlr6++;
			}

		System.out.println("Vezes em que deu numero 1:" + vlr1);
		System.out.println("Vezes em que deu numero 2:" + vlr2);
		System.out.println("Vezes em que deu numero 3:" + vlr3);
		System.out.println("Vezes em que deu numero 4:" + vlr4);
		System.out.println("Vezes em que deu numero 5:" + vlr5);
		System.out.println("Vezes em que deu numero 6:" + vlr6);
	}

}