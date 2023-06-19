import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente { 
                                                                                                              
	// atributos
	protected String nome;
	protected String endereco;
	protected final Date dataNasc; //transforma a variável em constante     

	// construtor
	public Cliente(String nome, String endereco, String dataNasc) throws ParseException{
		this.nome = nome;
		this.endereco = endereco;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataNasc = formato.parse(dataNasc); 
	}

	//métodos getters / setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNasc() {
		return dataNasc;
	}
}
