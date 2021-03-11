package arrays;

public class MainArrays {

	public static void main(String[] args) {

		// Array Simples
		
		String[] nomeTime = new String[5];
		nomeTime[0] = "Bayern de Muniquer";
		nomeTime[1] = "Chelsea";
		nomeTime[2] = "Juventus";
		nomeTime[3] = "Real Madrid";
		nomeTime[4] = "São Paulo";

		// Array Multidimensional

		String[][] nomeFederacoes = new String[5][5];
		nomeFederacoes[0][0] = "CBF";
		nomeFederacoes[1][1] = "CAF";
		nomeFederacoes[2][2] = "CIF";
		nomeFederacoes[3][3] = "CEF";
		nomeFederacoes[4][4] = "CInglesaF";
		
		System.out.println(nomeTime[4] + "!" + " Este clube está em um array normal");

		System.out.println(nomeFederacoes[1][1] + " essa federação está em um array multidimensional");

	}

}
