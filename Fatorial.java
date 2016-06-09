class Fatorial {

	private long valorFinal = 1;
	
	public long fatorar(long valor) {

		if (valor != 0) {
			valorFinal = valorFinal * valor;
			fatorar(valor - 1);
		}

		return valorFinal;

	}

}

