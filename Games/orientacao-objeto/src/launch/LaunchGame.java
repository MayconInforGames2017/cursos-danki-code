package launch;

import oo.Inimigo;
import oo.Player;

public class LaunchGame {

	public static void main(String[] args) {
		Player player = new Player();
		player.iniciarJogador();
		Inimigo inimigo = new Inimigo();
		inimigo.iniciarInimigo();

	}

}
