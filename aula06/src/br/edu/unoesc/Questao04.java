package br.edu.unoesc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Questao04 {

	public static void main(String[] args) {
		List<String> listnomes = new ArrayList<>();
		Set<String> conjnomes = new HashSet<>();
		
		for(int i=0;i<999999999;i++){
			listnomes.add("joao da silva "+i);
			conjnomes.add("joao da silva "+i);
		}
		System.out.println("Informe o nome para busca");
		String nome = Teclado.lerString();
		double tempoInit = System.currentTimeMillis();
		listnomes.contains(nome);
		double tempofinal = System.currentTimeMillis();
		System.out.println("Tempo da Lista"+(tempofinal-tempoInit));
		
		tempoInit = System.currentTimeMillis();
		conjnomes.contains(nome);
		tempofinal = System.currentTimeMillis();
		System.out.println("Tempo Conjunto"+(tempofinal-tempoInit));
		
		
		
		
		
	}

}
