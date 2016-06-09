class Principal {
	
	public static void main(String[] args) {

		long valorAFatorar = Long.parseLong(args[0]);
		Fatorial fatorial = new Fatorial();

		System.out.println("Fatorial de " + valorAFatorar + ": " + fatorial.fatorar(valorAFatorar));

	}
}