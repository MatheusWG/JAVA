package correcaoPrimeiraA1;

public class Questao10 {

	public static int somar(int matriz[][], int peca) {
		int soma = 0;
		for (int i=0; i<8; i++) 
			for (int j=0; j<8; j++)
				if (matriz[i][j] == peca)
					soma = soma + matriz[i][j];
		return soma;
	}
	public static void main(String[] args) {
		int xadres[][] = {{1,3,0,5,4,0,2,1},
				          {1,0,1,0,0,1,0,0},
				          {0,0,-0,0,1,0,6,0},
				          {1,0,0,1,1,0,0,1},
				          {0,1,0,4,0,0,1,0},
				          {0,0,3,1,0,0,1,1},
				          {1,0,6,6,0,0,1,0},
				          {1,0,5,0,1,1,0,6}};
		System.out.println(somar(xadres,1));
	}

}
