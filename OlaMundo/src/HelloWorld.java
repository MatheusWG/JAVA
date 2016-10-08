import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cidade;
		cidade = sc.nextLine();
		System.out.print(cidade);
		sc.close();
	}
}