import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, idade, peso, cidade, estado, pais;
		System.out.println("Digite o seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = scan.nextLine();
		System.out.println("Digite o seu peso: ");
		peso = scan.nextLine();
		System.out.println("Digite a sua cidade: ");
		cidade = scan.nextLine();
		if (cidade == "G") {
			System.out.println("Show!! Sou de G tamb�m!!");
		} else {
			System.out.println("Que pena, voc� n�o � de G");
		}
		System.out.println("Digite o seu estado: ");
		estado = scan.nextLine();
		System.out.println("Digite o seu pa�s: ");
		pais = scan.nextLine();
		
		// Gerar resultados
		System.out.println("--------------------------------");
		System.out.println("Aqui est� o resultado do teste: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + estado);
		System.out.println("Pa�s: " + pais);
		
		
	}

}
