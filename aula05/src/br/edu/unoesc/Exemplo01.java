
package br.edu.unoesc;

import java.util.List;
import java.util.ArrayList;

public class Exemplo01 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		//numeros.add("joao da silva");
		
	//	numeros.remove(2);
	//	numeros.remove(20); // IndexOutOfBounds remove pela posicao
	//	numeros.remove(new Integer(20)); //Remove pelo objeto
		
	
		//numeros.clear(); // remove todos
		/*int pos = numeros.indexOf(20);
		if (pos != -1) {
			numeros.remove(pos);
		}*/

		numeros.isEmpty(); // true se estiver vazio
		numeros.contains(20); // true se o elemento existir
		numeros.set(0, 1000); // alterar elemento na posicao 0
		
		// foreach
		for(Integer n : numeros) {
			System.out.println(n);
		}
		
		int soma = 0;
		for(int i=0;i<numeros.size(); i++) {
			//if (numeros.get(i) instanceof Integer) {
				soma = soma + numeros.get(i);
			//}
				System.out.println(numeros.get(i));
		}
		System.out.println(soma);
		
	}

}
