package br.edu.unoesc;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exemplo012 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Percorrendo os elementos da forma usual");
		for (Integer n : numeros) {
			System.out.println(n);
		}
		System.out.println("Percorrendo lista usando lambdas");
		numeros.forEach(p -> System.out.println(p));

		System.out.println("Somando os elementos");
		Integer soma = 0;
		for (Integer n : numeros) {
			soma += n;
		}
		System.out.println("Resultado: " + soma);

		System.out.println("Somando os elementos usando stream");
		Integer soma2 = numeros.stream().mapToInt(p -> p).sum();
		Integer maior = numeros.stream().mapToInt(p -> p).max().getAsInt();
		Integer menor = numeros.stream().mapToInt(p -> p).min().getAsInt();
		Double media = numeros.stream().mapToInt(p -> p).average()
				.getAsDouble();
		Integer sM3 = numeros.stream().filter(p -> p > 3).mapToInt(p -> p)
				.sum();

		System.out.println("Resultado: " + soma2);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Media: " + media);
		System.out.println("Soma maior 3: " + sM3);

		List<String> nomes = Arrays.asList("a1", "b1", "c2", "c1", "d1", "c1");
		nomes.stream().filter(p -> p.startsWith("c")).map(String::toUpperCase)
				.sorted().forEach(p -> System.out.println(p));

		// Lista para Set
		Set<String> set = nomes.stream().filter(p -> p.startsWith("c"))
				.collect(Collectors.toSet());

		System.out.println(set);

		Arrays.asList("a1", "a2", "a3").stream().findFirst()
				.ifPresent(System.out::println); // a1

		Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println); // a1

		IntStream.range(1, 4).forEach(System.out::println);

		// 1
		// 2
		// 3

		Arrays.stream(new int[] { 1, 2, 3 }).map(n -> 2 * n + 1).average()
				.ifPresent(System.out::println); // 5.0
		
		int[] n = {1,2,3};
		int s1 = 0;
		for(int i=0; i<3; i++) {
			n[i] = 2 * n[i] + 1;
			s1 += n[i];
		}
		double m = s1 / 3;
		if (s1 > 0) {
			System.out.println("Media " + m);
		}
		
		

		Stream.of("a1", "a2", "a3").map(s -> s.substring(1))
				.mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println); // 3
		
		String letras[] = {"a1", "a2", "a3"};
		int cont = 0;
		for (String letra : letras) {
			letras[cont] = letra.substring(1); 
			cont++;
		}
		// "1", "2", "3"
		int numeroMaior = 0;
		int num[] = new int[letras.length];
		for(int i=0; i<letras.length; i++) {
			num[i] = Integer.parseInt(letras[i]);
			if (num[i] > numeroMaior) {
				numeroMaior = num[i];
			}
		}
		if (num.length > 0) {
			System.out.println(numeroMaior);
		}
		
		
		
		
		

		IntStream.range(1, 4).mapToObj(i -> "a" + i)
				.forEach(System.out::println);

		for(int i=1; i<4; i++) {
			System.out.println("a" + i);
		}
		
		
		
		
		
		// a1
		// a2
		// a3

		Stream.of(1.0, 2.0, 3.0).mapToInt(Double::intValue)
				.mapToObj(i -> "a" + i).forEach(System.out::println);
		
		double reais[] = {1.0, 2.0, 3.0};
		int inteiros[] = new int[3];
		for (int i = 0; i < reais.length; i++) {
			inteiros[i] = (int) reais[i];
			System.out.println("a" + inteiros[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		

		// a1
		// a2
		// a3

	}

}