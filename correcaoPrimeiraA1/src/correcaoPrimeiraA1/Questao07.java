package correcaoPrimeiraA1;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int globo=0, sbt=0, band=0, record=0, total=0;
		while(true) {
			System.out.println("Informe sua preferencia 1-globo");
			System.out.println("2-sbt 3-band 4-record");
			int voto = teclado.nextInt();
			if (voto == 1) globo++;
			else if (voto == 2) sbt++;
			else if (voto == 3) band++;
			else if (voto == 4) record++;
			total ++;
			System.out.println("Continua (1-sim, 2-nao)");
			int continua = teclado.nextInt();
			if (continua == 2) break;
		}
		System.out.println("Total " + total);
		System.out.println("Perc Globo " + (globo*100/total) );
		System.out.println("Perc SBT " + ((double)sbt/total*100) );
		System.out.println("Perc BAND " + ((double)band/total*100) );
		System.out.println("Perc Record " + ((double)record/total*100) );
		teclado.close();
	}
}
