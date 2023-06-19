import java.util.Date;

//superclass
public abstract class Conta {

	// atributos
	protected final Cliente cliente; // composição
	protected final long numeroConta;
	protected double saldo;
	protected Date dataAbertura;
	private static long contador;

	public Conta(Cliente cliente, long numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.dataAbertura = new Date();
		contador++;
	}

	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public void transferir(double valor, Conta conta) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	public abstract void exibirSaldo(); // abstract no m�todo for�a a reescrita.

	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}

}
