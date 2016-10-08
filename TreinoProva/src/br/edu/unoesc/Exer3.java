package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer3 {

	public static float maiorNum(float a,float b,float c){
		float max = Math.max(a,b);
		max = Math.max(max,c);
		return max;
	}
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat ("#0");
		System.out.println("Digite 3 números para saber qual o maior deles");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float max = maiorNum(a, b, c);
		System.out.println("O maior é: "+ft.format(max));
		sc.close();
	}

}
