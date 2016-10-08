package br.edu.unoesc;

import java.util.Stack;

public class Exer01 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		pilha.push("a"); /// adiciona no topo
		pilha.push("b");
		pilha.pop(); // remove o topo
		System.out.println("Elemento do topo: " + pilha.peek());
		String topo = pilha.pop();
		System.out.println(topo);
		if (pilha.empty()) {
			System.out.println("Pilha Vazia");
		}
		System.out.println("Tamanho = " + pilha.size());
		
		System.out.println("Solução torres de hanoi:");
		
		Stack<String> torreA = new Stack<>();
		Stack<String> torreB = new Stack<>();
		Stack<String> torreC = new Stack<>();
		
		torreA.push("disco 3");
		torreA.push("disco 2");
		torreA.push("disco 1");
		
		torreC.push(torreA.pop());
		torreB.push(torreA.pop());
		torreB.push(torreC.pop());
		torreC.push(torreA.pop());
		torreA.push(torreB.pop());
		torreC.push(torreB.pop());
		torreC.push(torreA.pop());
		
		while( ! torreC.empty()){
			System.out.println(torreC.pop());
		}
	}
}
