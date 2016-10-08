package br.edu.unoesc;

public class Questao08 {

	public static void main(String[] args) {
		System.out.println(
				"Os modificadores de acesso servem para impedir ou nao o acesso de determinado metodo ou classe.");
		System.out.println("Ex: Se criarmos um metodo denominado private static double raiz(double a),");
		System.out.println(
				"esse metodo só poderia ser usado pela classe em que está presente, nenhuma outra classe do projeto que tentasse usa-la conseguiria.");
		System.out.println("Já o modificador public pode ser usado por qualquer classe do projeto.");
		System.out.println("O modificador static, pré-carrega a classe ou metodo na memoria,fazendo com que, ");
		System.out.println("possa ser acessada ou usada a qualquer momento.");
	}

}
