package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFormat ft = new DecimalFormat("#0.0");
		NumberFormat ft1 = new DecimalFormat("#0");
		double a[] = new double[10];
		double b[] = new double[10];
		double c[] = new double[10];
		double s = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("A[" + (i + 1) + "] =");
			a[i] = sc.nextDouble();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("B[" + (i + 1) + "] =");
			b[i] = sc.nextDouble();
		}
		for (int i = 0; i < 10; i++) {
			s += a[i] * b[9 - i];
		}
		for (int j = 0; j < 10; j++) {
			c[j] = a[j] / b[j];
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println("C[" + (i + 1) + "] = " + ft.format(c[i]));
		}
		for (int i = 0; i < 10; i++) {
			if ((a[i] % 2) == 0)
				System.out.println("A[" + (i + 1) + "] = " + ft1.format(a[i]));

		}
		System.out.println("S = " + ft1.format(s));
		sc.close();

	}

}
