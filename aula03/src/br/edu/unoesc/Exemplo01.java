package br.edu.unoesc;

public class Exemplo01 {

	/*public static double calcularMedia(double n1, double n2) {
		
		double md = ((n1 + n2) / 2);
		return md;
	}*/

	public static void main(String[] args) {
		
		double n1 = 7.5;
		double n2 = 8.0;

		double media = Matematica.calcularMedia(n1, n2);
		System.out.println("Media = " +media);
	}
}
