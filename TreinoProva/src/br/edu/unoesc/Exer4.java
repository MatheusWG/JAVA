package br.edu.unoesc;

import java.util.Random;

public class Exer4 {

	public static int Dado(){
		Random rnd = new Random();
		int dado = rnd.nextInt(5) + 1;
		return dado;
	}

	public static void main(String[] args) {
		System.out.println("Resultado do dado:"+Dado());
	}

}
