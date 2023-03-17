package burguer_king_app;

public class Cliente extends Pessoa{
	String endereco;
	String telefone;
	
	Cliente(){}
	
	//preciso incluir os outros atrubutos num construtor aqui?
	Cliente(String endereco, String telefone){
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	void comprar() {
		System.out.println("Comprando...");
	}
	
	void aplicarCupom() {
		System.out.println("Aplicando cumpom");
	}
}
