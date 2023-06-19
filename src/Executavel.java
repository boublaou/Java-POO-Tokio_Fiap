import java.text.ParseException;

public class Executavel {

	public static void main(String[] args) throws ParseException {

		CDB cdb = new CDB();
		LCI lCI = new LCI();

		Cliente clienteEmerson = new Cliente("Emerson", "Rua 1 2 3 de oliveira 4", "23/06/2003");
		ContaCorrente contaEmerson = new ContaCorrente(clienteEmerson, 1);

		Cliente clienteAdriane = new Cliente("Adriane", "Rua 1 2 3 de oliveira 4", "26/07/1977");
		ContaCorrente contaAdriane = new ContaCorrente(clienteAdriane, 1);

		// simulações
		contaEmerson.depositar(10000);
		contaEmerson.exibirSaldo();
		contaEmerson.exibirSaldo();
		contaEmerson.investir(lCI, 1000);
		contaEmerson.exibirSaldo();
		
		contaAdriane.depositar(10000);
		contaAdriane.exibirSaldo();

		contaAdriane.transferir(1000, contaEmerson);

		contaEmerson.exibirSaldo();
		contaAdriane.exibirSaldo();
		contaAdriane.resgatar(500);
		contaAdriane.exibirSaldo();
		
		contaEmerson.resgatar(1000);
		contaEmerson.exibirSaldo();

		Conta.exibirContador();

	}
}
