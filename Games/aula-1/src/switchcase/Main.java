package switchcase;

public class Main {

	public static void main(String[] args) {
		
		int vida = 100;
		
		switch(vida)
		{
			case 90:
			
			System.out.println("Quero eu meu personagem corra mais rápido");
			break;
			case 30:
				
			System.out.println("Minha vida é igual a 30!");
			break;
			default:
			System.out.println("Nenhuma condição bateu! Eu tenho 100 de vida!");
			break;
		}

	}

}
