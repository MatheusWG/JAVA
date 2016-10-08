package br.edu.unoesc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {

	public static void menu() {
		System.out.println("Playlist opções");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar");
		System.out.println("3 - Tocar");
		System.out.println("4 - Próxima");
		System.out.println("5 - Anterior");
		System.out.println("6 - Excluir");
		System.out.println("7 - Aleatório");
		System.out.println("8 - Sair");
	}

	public static void main(String[] args) {
		List<String> musicas = new ArrayList<>();
		musicas.add("teste");
		int ctrl = 0;
		while (true) {
			menu();
			int op = Teclado.lerInt();
			if (op == 1) {
				System.out.println("Informe o nome da música");
				String faixa = Teclado.lerString();
				musicas.add(faixa);

			} else if (op == 2) {
				for (String faixa : musicas) {
					System.out.println(faixa);
				}

			} else if (op == 3) {
				System.out.println("Tocando a musica");
				System.out.println(musicas.get(ctrl));

			} else if (op == 4) {
				if (ctrl < musicas.size()-1)
					ctrl++;
				else
					ctrl = 0;
				System.out.println("Tocando a musica");
				System.out.println(musicas.get(ctrl));

			} else if (op == 5) {
				if (ctrl > 0)
					ctrl--;
				else
					ctrl = musicas.size() - 1;
				System.out.println("Tocando a musica");
				System.out.println(musicas.get(ctrl));

			} else if (op == 6) {
				System.out.println("Informe a musica que deseja excluir");
				String faixa = Teclado.lerString();
				if (!musicas.remove(faixa))
					System.out.println("Não conseguiu excluir");
				else
					System.out.println("Conseguiu excluir");

			} else if (op == 7) {
				Random sorteio = new Random();
				int i = sorteio.nextInt(musicas.size() - 1);
				System.out.println("Tocando");
				System.out.println(musicas.get(i));
			} else {
				System.out.println("Adquira..");
				break;
			}
		}
	}
}
