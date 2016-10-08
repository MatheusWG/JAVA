package br.edu.unoesc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exer03 {

	static double total = 0;
	static double money = 0;

	public static void menu() {

		System.out.println("\n\n     Supermercado:\n");
		System.out.println("1 - Comprar");
		System.out.println("2 - Verificar se item já está na lista");
		System.out.println("3 - Listar produtos normal");
		System.out.println("4 - Listar produtos lambda");
		System.out.println("5 - Produtos Sadia em sua lista");
		System.out.println("0 - Sair");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Set<String> produtos = new TreeSet<>();
		Map<String, Integer> estoque = new HashMap<>();
		List<String> compras = new ArrayList<>();
		Map<String, Double> precos = new HashMap<>();

		produtos.add("CarneSadia");
		produtos.add("CarneFriboi");
		produtos.add("Arroz");
		produtos.add("Feijão");
		estoque.put("CarneSadia", 10);
		estoque.put("CarneFriboi", 10);
		estoque.put("Arroz", 10);
		estoque.put("Feijão", 10);
		precos.put("CarneSadia", 20.00);
		precos.put("CarneFriboi", 18.50);
		precos.put("Arroz", 5.20);
		precos.put("Feijão", 7.10);

		System.out.println("Quanto dinheiro você tem?");
		money = Teclado.lerDouble();
		while (true) {
			menu();
			opcao = Teclado.lerInt();
			if (opcao == 1) {
				comprar(teclado, produtos, estoque, compras, precos);
			} else if (opcao == 2) {
				verificar(teclado, produtos, compras);
			} else if (opcao == 3) {
				listarnormal(produtos);
			} else if (opcao == 4) {
				listarlambda(produtos);
			} else if (opcao == 5) {
				Sadia(produtos, compras);
			} else if (opcao == 6)
				System.out.println(money);
			else
				break;
		}
	}
					//F
	private static void sotem50(List<String> compras, Map<String, Integer> estoque, Map<String, Double> precos,
			String prod) {
		if (money == 50 && total > money) {
			System.out.println("Voce nao tem mais dinheiro suficiente");
		} else {
			int a = estoque.get(prod);
			estoque.put(prod, (a - 1));
			money -= precos.get(prod);
		}
	}
					//C
	private static void removeritem(List<String> compras, Map<String, Integer> estoque, Map<String, Double> precos,
			String prod) {
		int a = 0;
		if (money > total) {
			a = estoque.get(prod);
			estoque.put(prod, (a - 1));
			money -= precos.get(prod);
		} else {
			System.out.println("Não tem mais dinheiro suficiente");
		}
	}
					//A
	private static void comprar(Scanner teclado, Set<String> produtos, Map<String, Integer> estoque,
			List<String> compras, Map<String, Double> precos) {
		System.out.println("Digite o nome do produto que deseja adicionar à lista");
		String prod = Teclado.lerString();
		if (precos.containsKey(prod)) {
			total = precos.get(prod);
			compras.add(prod);
			removeritem(compras, estoque, precos, prod);
			if(money==50)
			sotem50(compras, estoque, precos, prod);
		} else
			System.out.println("Produto indisponivel");
	}
					//B
	private static void verificar(Scanner teclado, Set<String> produtos, List<String> compras) {
		System.out.println("Digite o nome do produto no qual quer verificar");
		String prod = Teclado.lerString();
		if (compras.contains(prod)) {
			System.out.println("Seu produto ja está na lista");
		} else
			System.out.println("Seu produto ainda não está na lista");
	}
					//D
	private static void listarnormal(Set<String> produtos) {
		Iterator<String> it = produtos.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
					//E
	private static void listarlambda(Set<String> produtos) {
		produtos.forEach(p -> System.out.println(p));
	}
					//G
	private static void Sadia(Set<String> produtos, List<String> compras) {
		Set<String> Sadia = compras.stream().filter(p -> p.contains("Sadia")).collect(Collectors.toSet());
		System.out.println("Produtos Sadia em sua lista :" + Sadia);
	}
}