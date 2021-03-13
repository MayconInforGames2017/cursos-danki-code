import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random num_aleatorio = new Random();
		String nome;
		System.out.println("Seja bem-vindo ao jogo! Insira seu nome: ");
		nome = entrada.nextLine(); 
		System.out.println("Seja bem-vindo(a): " + nome);
		System.out.println("Voc� deseja avan�ar para qual dire��o?(w,s,a,d)");
		String comando = entrada.nextLine();
		if (comando.equals("w")) {
			System.out.println("Voc� est� indo para a frente!");
			System.out.println("Um inimigo surgiu, o que deseja fazer? (a=atacar, c=correr)");
			comando = entrada.nextLine();
			if (comando.equals("a")) {
				if (num_aleatorio.nextInt(100) < 75) {
					System.out.println("Voc� ganhou o jogo!");
				} else {
					System.out.println("Voc� perdeu o jogo!");
				}
			} else {
				System.out.println("Voc� correu! Game Over!!");
			}
		} else if (comando.equals("s")) {
			System.out.println("Voc� est� entrando em outro mapa...");
		}

	}

}
