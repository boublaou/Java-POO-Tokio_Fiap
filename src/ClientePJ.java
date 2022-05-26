public final class ClientePJ extends Cliente {

	private final long CNPJ;

	public ClientePJ(String nome, String endereco, String dataNasc, long cnpj) {
		super(nome, endereco, dataNasc);
		this.CNPJ = cnpj;
	}

	public long getCnpj() {
		return CNPJ;
	}
	
}
