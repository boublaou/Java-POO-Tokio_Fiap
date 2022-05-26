
public class Executavel {

	public static void main(String[] args) {

		CDB cdb = new CDB();
		LCI lCI = new LCI();

		Cliente clienteEmerson = new ClientePF("Emerson", "Rua 1 2 3 de oliveira 4", "1978", 1231241431);
		ContaCorrente contaEmerson = new ContaCorrente(clienteEmerson, 1);

		Cliente clienteAdriane = new ClientePJ("Adriane", "Rua 1 2 3 de oliveira 4", "1977", 1434413213);
		ContaCorrente contaAdriane = new ContaCorrente(clienteAdriane, 1);

		// simulações
		contaEmerson.depositar(10000);
		contaEmerson.exibirSaldo();
		try {
			contaEmerson.investir(cdb, 100);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		contaEmerson.exibirSaldo();
		
		try {
			contaEmerson.sacar(-1000000);
		} catch (SaldoInsuficiente e1) {
			e1.printStackTrace();
		}
		
		try {
			contaEmerson.investir(lCI, 1000);
		} catch (SaldoInsuficiente e1) {
			e1.printStackTrace();
		}
		
		contaEmerson.exibirSaldo();
		contaAdriane.depositar(10000);
		contaAdriane.exibirSaldo();
		
		
		try {
			contaAdriane.transferir(1000, contaEmerson);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		contaEmerson.exibirSaldo();
		contaAdriane.exibirSaldo();
		try {
			contaAdriane.resgatar(500);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		contaAdriane.exibirSaldo();
		try {
			contaEmerson.resgatar(1000);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		contaEmerson.exibirSaldo();

		Conta.exibirContador();

	}
}
