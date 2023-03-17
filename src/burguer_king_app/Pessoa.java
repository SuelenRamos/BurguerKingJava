package burguer_king_app;

public class Pessoa {
	//Atributos
	String nome;
	int idade;
	String email;
	String cpf;
	
	
	//Construtores
	Pessoa(){}
	
	Pessoa(String nome, int idade, String email, String cpf){
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
	}
}