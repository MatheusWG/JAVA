package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer7 {

	public static double custoCarro(double custo){
		custo += (custo*0.28)+(custo*0.45);
		return custo;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#0.00");
		System.out.println("Custo de fábrica: ");
		double custof = sc.nextDouble();
		double custo = custoCarro(custof);
		System.out.println("O valor final do seu carro é de: R$ "+ft.format(custo));
		sc.close();

	}

}
