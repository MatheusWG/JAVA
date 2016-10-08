package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Exer2 {

	public static double calcularVolume(double h, double r) {

		double vol = Math.PI * Math.pow(r, 2) * h;
		return vol;
	}

	public static void main(String[] args) {
		NumberFormat ft = new DecimalFormat("#0.0");
		System.out.println("Digite a altura da lata: ");
		double h = Keyboard.lerDouble();
		System.out.println("Digite o diametro da lata: ");
		double r = Keyboard.lerDouble() / 2;
		double area = calcularVolume(h, r);
		System.out.println("Area da lata: " + ft.format(area) + "cm²w");
	}
}
