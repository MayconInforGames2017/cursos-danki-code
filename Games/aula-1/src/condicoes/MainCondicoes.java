package condicoes;

public class MainCondicoes {

	public static void main(String[] args) {
		
		int vida = 100;
		if (vida == 100) {
			vida += 100;
			System.out.println("Minha vida � igual a 100!");
		} else {
			System.out.println("Minha vida n�o � igual a 100!");
		}

		String nome = "Maycon";
		if (nome == "Maycon") {
			System.out.println("Nome igual a " + nome);
		} else if (nome == "Santana") {
			System.out.println("Nome igual a " + nome);
		} else {
			System.out.println("Nome n�o encontrado!");
		}
		
		if (nome != "Santana") {
			System.out.println("O nome � diferente de Santana");
		}
		
		boolean var = true;
		if (var) {
			System.out.println("Verdade");
		} else {
			System.out.println("Falso");
		}
		
		boolean var2 = true;
		if (var2)
			System.out.println("Verdade");
		System.out.println("");
	}

}
