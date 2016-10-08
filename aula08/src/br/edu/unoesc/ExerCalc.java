package br.edu.unoesc;

import java.util.Stack;

public class ExerCalc {

	public static void main(String[] args) {
		Stack<Integer> Calc = new Stack<>();
		System.out.println("Digite a expressão numerica:");
		String exp = Teclado.lerString();

		for (int i = 0; i < exp.length(); i++) {
			char letra = exp.charAt(i);
			Integer n1 = 0;
			Integer n2 = 0;
			if (letra == '+' || letra == '-' || letra == '/' || letra == '*') {
				n1 = Calc.pop();
				n2 = Calc.pop();
				if (n1 < n2) {
					Integer aux = n1;
					n1 = n2;
					n2 = aux;
				}
				if (letra == '+')
					Calc.push(n1 + n2);
				if (letra == '/')
					Calc.push(n1 / n2);
				if (letra == '*')
					Calc.push(n1 * n2);
				if (letra == '-')
					Calc.push(n1 - n2);
			} else {
				Calc.push(Integer.parseInt("" + letra));
			}
		}
		System.out.println("Resultado = " + Calc.peek());
	}
}
