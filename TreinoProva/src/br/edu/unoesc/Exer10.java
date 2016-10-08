package br.edu.unoesc;

public class Exer10 {

	static double multi = 0;
	static double divi = 0;
	public static void Multi(double a,double b){
		multi = a*b;
		divi = a/b;
	}
	
	public static void main(String[] args) {
		double a = Teclado.lerDouble();
		double b = Teclado.lerDouble();
		Multi(a,b);
		System.out.println("Multi = "+multi+"      "+divi);

	}
}
