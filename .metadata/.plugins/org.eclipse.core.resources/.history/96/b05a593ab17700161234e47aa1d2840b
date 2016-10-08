package br.edu.unoesc;

import java.util.*;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Map<String,String> mp = new TreeMap<>();
		mp.put("SC", "Santa Catarina");
		mp.put("PR", "Paraná");
		mp.put("RS", "Rio Grande do Sul");
		System.out.println(mp.get("SC"));
		Set<String> conj = mp.keySet();
		Iterator<String> itc = conj.iterator();
		while(itc.hasNext()){
			String chave = itc.next();
			System.out.println(chave);
			System.out.println(mp.get(chave));
		}
		Collection<String> valores = mp.values();
		for (String nome:valores) {
			System.out.println(nome);
		}
		List<String> nomes = new ArrayList<>();
		nomes.add("joao");
		nomes.add("ana");
		nomes.add("claudia");
		Collections.sort(nomes);
		for(String nome:nomes){
			System.out.println(nome);
		}
		int posição = Collections.binarySearch(nomes, "joao");
		System.out.println("Posição na lista = "+posição);
	}

}
