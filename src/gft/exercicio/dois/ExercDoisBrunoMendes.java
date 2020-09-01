package gft.exercicio.dois;

import gft.exercicio.dois.model.Pessoa;

public class ExercDoisBrunoMendes {

	public static void main(String[] args) {
		//Instanciando os objetos Pessoa() e adicionando valores aos atributos!:
		Pessoa p1 = new Pessoa("Henrique Vergara","Alameda Rio Negro, 585 - Alphaville Industrial","01140028922");
        Pessoa p2 = new Pessoa("Clecio Silva","Alameda Rio Negro, 585 - Alphaville Industrial","01121763253"); 
		 //Saida de dados:
        System.out.println("Nome: "+p1.getNome()+"\nEndereço: "+p1.getEndereco()+"\nTelefone: "+p1.getTelefone());
        System.out.println("\nNome: "+p2.getNome()+"\nEndereço: "+p2.getEndereco()+"\nTelefone: "+p2.getTelefone());

	}

}