package br.edu.unoesc;

public class Questao03 {

	public static void main(String[] args) {
		double divida = 5000;
		double aplic = 1500;
		int ac = 0;
		while (divida > aplic) {
			divida += divida * 0.025;
			aplic += aplic * 0.04;
			ac++;
		}
		System.out.println("Sua divida sera paga em " + ac + " meses");
	}

}
