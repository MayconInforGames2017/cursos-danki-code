package metodos;

public class Launch_v3 {

	private static int exemplo() {
		return 10;
	}
	
	private static String exemplo2() {
		return "Maycon";
	}
	
	public void outroMetodo(int n1, String nome) {
		System.out.println(n1);
		System.out.println(nome);
	}
	
	public static void main(String[] args) {
		
		System.out.println(exemplo());
		new Launch_v3().outroMetodo(10, "Maycon");
	}

}
