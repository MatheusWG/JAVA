package br.edu.unoesc;

public class Questão01 {

	public static double passagemdeparametroporreferencia(double a, double b) {
		double soma = a + b;
		return soma;
	}

	public static void passagemdeparametroporvalor(int vet[]){
		vet[0] = 1;
		vet[1] = 2;
		vet[2] = 3;
	}

	public static void main(String[] args) {
		System.out.println("Passagem de parametro por referencia faz uma copia do valor para determinada variavel.");
		
		

		double a = 50;
		double b = 80;
		double soma = passagemdeparametroporreferencia(a, b);
		
		System.out.println(soma);
		System.out.println();
		System.out.println("Passagem de parametro por valor substitui o valor da variavel e permanece no mesmo espaco de memoria.");
		
		
		int vet[] = {0,12,24,48};
		
		passagemdeparametroporvalor(vet);
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
	}

}


