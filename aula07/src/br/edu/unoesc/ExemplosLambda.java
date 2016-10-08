package br.edu.unoesc;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosLambda {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Percorrendo elementos da forma usual");

		for (Integer n : numeros) {
			System.out.println(n);
		}
		System.out.println("Percorrendo os numeros usando lambda");
		numeros.forEach(s -> System.out.println(s));

		System.out.println("Somando os elementos da forma usual");
		Integer soma = 0;

		for (Integer n : numeros) {
			soma += n;
		}

		System.out.println("Soma = " + soma);
		System.out.println("Somando os elementos usando stream");

		Integer soma2 = numeros.stream().mapToInt(p -> p).sum();
		Integer maior = numeros.stream().mapToInt(p -> p).max().getAsInt();
		Integer menor = numeros.stream().mapToInt(p -> p).min().getAsInt();
		Double media = numeros.stream().mapToInt(p -> p).average().getAsDouble();
		Integer soma3 = numeros.stream().filter(p -> p > 3).mapToInt(p -> p).sum();

		System.out.println("Maior = " + maior);
		System.out.println("Menor = " + menor);
		System.out.println("Media = " + media);
		System.out.println("Soma2 = " + soma2);
		System.out.println("Soma maior que 3 = " + soma3);

		List<String> nomes = Arrays.asList("a1", "b2", "c2", "c1", "d1");
		nomes.stream().filter(p -> p.startsWith("c")).map(String::toUpperCase).sorted()
				.forEach(p -> System.out.println(p));

		Set<String> set = nomes.stream().filter(p -> p.startsWith("c")).collect(Collectors.toSet());
		System.out.println(set);
		
		Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::println);
		
		Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println);
		
		IntStream.range(1,4).forEach(System.out::println);

		//1
		//2
		//3

		Arrays.stream(new int[] {1,2,3}).map(n -> 2*n+1).average().ifPresent(System.out::println);
		
		Stream.of("a1","a2","a3").map(s -> s.substring(1))
		.mapToInt(Integer::parseInt).max()
		.ifPresent(System.out::println);
		
		IntStream.range(1,4).mapToObj(i -> "a" + i)
		.forEach(System.out::println);
		
		Stream.of(1.0,2.0,3.0).mapToInt(Double::intValue).mapToObj(i -> "a" + i).forEach(System.out::println);
	}
}
