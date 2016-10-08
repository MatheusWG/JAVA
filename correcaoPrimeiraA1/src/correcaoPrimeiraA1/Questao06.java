package correcaoPrimeiraA1;

public class Questao06 {

	public double exponenciacao(double base, double expoente) {
		double resultado = 1;
		for (int i=0; i<expoente; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		Questao06 obj6 = new Questao06();
		double n1, n2;
		n1 = 2.0;
		n2 = 3.0;
		System.out.println("Resultado " + obj6.exponenciacao(n1,n2) );	
	}

}
