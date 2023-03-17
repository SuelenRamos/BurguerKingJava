package burguer_king_app;

public class Cupom {
	String titulo;
	double desconto;
	String validade;
	int quantidade;
	
	Cupom(){
		
	}
	
	Cupom(String titulo, double desconto, String validade, int quantidade){
		this.titulo = titulo;
		this.desconto = desconto;
		this.validade = validade;
		this.quantidade = quantidade;
	}
	
	void adicionarCupom() {
		System.out.println("Adicionando cupom...");
	}
}
