package br.edu.unoesc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Desafio02 {

	public static void menu() {
		System.out.println("1 - cadastrar produto");
		System.out.println("2 - cadastrar estoque");
		System.out.println("3 - comprar");
		System.out.println("4 - listar produtos");
		System.out.println("5 - verificar estoque");
		System.out.println("6 - refrigerantes");
		System.out.println("7 - total em estoque");
		System.out.println("0 - sair");
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Set<String> produtos = new TreeSet<>();
		Map<String, Integer> estoque = new HashMap<>();
		List<String> compras = new ArrayList<>();
		while (true) {
			menu();
			opcao = teclado.nextInt();
			if (opcao == 1) {
				cadastrarProduto(teclado, produtos, estoque);
			} else if (opcao == 2) {
				cadastrarEstoque(teclado, produtos, estoque);
			} else if (opcao == 3) {
				comprar(teclado, produtos, estoque, compras);
			} else if (opcao == 4) {
				listar(produtos);
			} else if (opcao == 5) {
				estoqueab5(estoque, produtos);
				maiorEstoque(estoque, produtos);
				menorEstoque(estoque, produtos);
				mediaEstoque(estoque, produtos);
				mostrarEstoque(produtos, estoque);
			} else if (opcao == 6) {
				refri(produtos);
			} else if (opcao == 7) {
				totalProd(produtos, estoque);

			} else
				break;
		}
		teclado.close();
	}

	private static void mostrarEstoque(Set<String> produtos, Map<String, Integer> estoque) {
		System.out.println("Estoque:");
		for (String nome : produtos) {
			System.out.println(nome + " = " + estoque.get(nome)+" unidades");
		}
	}

	private static void listar(Set<String> produtos) {
		for (String p : produtos) {
			System.out.println(p);
		}
	}

	private static void comprar(Scanner teclado, Set<String> produtos, Map<String, Integer> estoque,
			List<String> compras) {
		System.out.println("Digite o nome do produto que deseja comprar e sua quantidade: ");
		String opc = Teclado.lerString();
		int qtdi = Teclado.lerInt();
		int qtdf = estoque.get(opc) - qtdi;
		if (qtdf < 0) {
			System.out.println("Temos apenas " + estoque.get(opc) + " unidades deste produto");
		} else {
			compras.add(opc);
			estoque.remove(opc, qtdf);
			estoque.put(opc, qtdf);
		}
	}

	private static void cadastrarEstoque(Scanner teclado, Set<String> produtos, Map<String, Integer> estoque) {
		System.out.println("Nome produto");
		String opc = Teclado.lerString();
		if (produtos.contains(opc) && estoque.get(opc) == 0) {
			System.out.println("Informe o Estoque");
			int qtdadd = Teclado.lerInt();
			estoque.put(opc, qtdadd);
		} else if (produtos.contains(opc)) {
			System.out.println("Informe o Estoque");
			int qtdadd = Teclado.lerInt();
			int novaqtd = estoque.get(opc);
			novaqtd += qtdadd;
			estoque.remove(opc, estoque.get(opc));
			estoque.put(opc, novaqtd);
		} else
			System.out.println("Favor cadastrar o produto:");
	}

	private static void cadastrarProduto(Scanner teclado, Set<String> produtos, Map<String, Integer> estoque) {
		System.out.println("Nome produto");
		String prod = Teclado.lerString();
		produtos.add(prod);
		estoque.put(prod, 0);
	}

	private static void refri(Set<String> produtos) {
		Set<String> set = produtos.stream().filter(p -> p.contains("refri")).collect(Collectors.toSet());
		System.out.println(set);
	}

	private static void menosComprado(List<String> compras) {
		Iterator<String> itl = compras.iterator();
		while (itl.hasNext()) {
			// Map<String, Integer> menosComprado =
			// compras.stream().equals(itl.next()) ;
		}
	}

	private static void maisComprado(List<String> compras) {

	}

	private static void maiorEstoque(Map<String, Integer> estoque, Set<String> produtos) {
		Collection<Integer> maiorEstoque = estoque.values();
		Integer maiorEst = maiorEstoque.stream().mapToInt(p -> p).max().getAsInt();
		Set<String> maiorEstoq = new TreeSet<>();
		for (String n : produtos) {
			if (estoque.get(n) == maiorEst) {
				maiorEstoq.add(n);
			}
		}

		System.out.println("Produto(s) com maior quantidade em estoque:" + maiorEstoq);
	}
	
	private static void menorEstoque(Map<String, Integer> estoque, Set<String> produtos) {
		Collection<Integer> menorEstoque = estoque.values();
		Integer maiorEst = menorEstoque.stream().mapToInt(p -> p).min().getAsInt();
		Set<String> menorEstoq = new TreeSet<>();
		for (String n : produtos) {
			if (estoque.get(n) == maiorEst) {
				menorEstoq.add(n);
			}
		}

		System.out.println("Produto(s) com maior quantidade em estoque:" + menorEstoq);
	}
	
	private static void mediaEstoque(Map<String, Integer> estoque, Set<String> produtos) {
		Collection<Integer> mediaEstoque = estoque.values();
		Integer mediaEst = (int)mediaEstoque.stream().mapToInt(p -> p).average().getAsDouble();
		

		System.out.println("Media do estoque:" + mediaEst);
	}

	private static void totalProd(Set<String> produtos, Map<String, Integer> estoque) {
		Collection<Integer> totals = estoque.values();
		Integer total = totals.stream().mapToInt(p -> p).sum();
		System.out.println("Total de Produtos em Estoque: " + total);
	}

	private static void estoqueab5(Map<String, Integer> estoque, Set<String> produtos) {
		Set<String> abaixode5 = new TreeSet<>();
		for (String n : produtos) {
			if (estoque.get(n) < 5) {
				abaixode5.add(n);
			}
		}
		System.out.println("Produto(s) com quantidade em estoque abaixo de 5:" + abaixode5);
	}

}
