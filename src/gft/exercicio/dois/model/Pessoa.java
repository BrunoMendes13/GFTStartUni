package gft.exercicio.dois.model;

public class Pessoa {
	//Declaração de atributos!
	private String nome;
	private String endereco;
	private String telefone;
	//Metodo Construtor
	public Pessoa() {

	}
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
    //Metodos Acessores 
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    //Metodos Modificadores
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	

}