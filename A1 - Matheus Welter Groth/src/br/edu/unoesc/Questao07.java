package br.edu.unoesc;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questao07 {

	public static void main(String[] args) {
		NumberFormat ft = new DecimalFormat("#0.00");

		double globo = 0;
		double sbt = 0;
		double record = 0;
		double band = 0;
		double pglobo = 0;
		double psbt = 0;
		double precord = 0;
		double pband = 0;
		double total = 0;
		String emissora[] = new String[10];
		for (int i = 0; i < 10; i++) {
			emissora[i] = Teclado.lerString();
			if (emissora[i].equalsIgnoreCase("globo"))
				globo++;
			else if (emissora[i].equalsIgnoreCase("sbt"))
				sbt++;
			else if (emissora[i].equalsIgnoreCase("record"))
				record++;
			else if (emissora[i].equalsIgnoreCase("band"))
				band++;
			total++;
		}
		pglobo = (globo / total) * 100;
		psbt = (sbt / total) * 100;
		precord = (record / total) * 100;
		pband = (band / total) * 100;
		System.out.println("Total de entrevistados: " + total);
		System.out.println("Porcentagem de entrevistados que assistem determinada emissora: ");
		System.out.println("Globo : " + ft.format(pglobo) + "%");
		System.out.println("SBT : " + ft.format(psbt) + "%");
		System.out.println("Record : " + ft.format(precord) + "%");
		System.out.println("Band : " + ft.format(pband) + "%");

	}

}
