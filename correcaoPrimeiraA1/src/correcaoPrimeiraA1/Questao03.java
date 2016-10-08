package correcaoPrimeiraA1;

public class Questao03 {

	public static void main(String[] args) {
		double divida = 5000;
		double aplicacao = 1500;
		int meses = 0;
		while (aplicacao < divida) {
			divida = divida + (divida * 2.5 / 100);
			aplicacao = aplicacao + (aplicacao * 4.0 / 100);
			meses ++;
		}
		System.out.println("Meses " + meses);
	}

}
