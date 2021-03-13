package launch;

import oo.TesteAbstract;

public class LaunchGame_V2 extends TesteAbstract {

	public static void main(String[] args) {

		new TesteAbstract();

	}

	public void iniciarJogo() {

	}

	public void chamarJogo() {
		iniciarJogo();
	}

	public void instanceMain2() {
		new Main2().print1();
	}

	private class Main2 {
		public void print1() {
			System.out.println("Chamando meu método");
		}
	}

}
