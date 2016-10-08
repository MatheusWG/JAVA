package br.edu.unoesc;

import java.util.Scanner;

public class Keyboard {
	public static void main(String[] args) {
	}

	static Scanner sc = new Scanner(System.in);
	public static double lerDouble() {
		double a = sc.nextDouble();
		return a;
	}

	public static int lerInt() {
		int a = sc.nextInt();
		return a;
	}

	public static String lerString() {
		String a = sc.next();
		return a;
	}

}