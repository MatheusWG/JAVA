package br.edu.unoesc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exer01 {

	public static void main(String[] args) {
		// A

		Map<Integer, String> pessoas = new HashMap<>();
		List<Integer> cpfs = new ArrayList<>();

		cpfs.add(Teclado.lerInt());
		cpfs.add(Teclado.lerInt());
		cpfs.add(Teclado.lerInt());

		pessoas.put(cpfs.indexOf(0), "João");
		pessoas.put(cpfs.indexOf(1), "Maria");
		pessoas.put(cpfs.indexOf(2), "Pedro");

		int i = 0;
		for (Integer n : cpfs) {
			String nome = null;
			switch (i) {
			case 0:
				nome = "João";
				break;
			case 1:
				nome = "Maria";
				break;
			case 2:
				nome = "Pedro";
				break;
			}
			pessoas.put(n, nome);
			i++;
		}
		// B

		i = 1;
		for (Integer n : cpfs) {
			System.out.println("CPF " + i + ": " + n);
			i++;
		}

		// C

		
while(true){
	System.out.println("Digite o cpf da pessoa, ou digite 0 para encerrar");
	Integer cpf = Teclado.lerInt();
	if(cpf==0)
		break;;
		if (cpfs.contains(cpf) == true) {
			System.out.println("Cpf de " + pessoas.get(cpf));
		}
		else
			System.out.println("CPF não encontrado");
}

	}

}
