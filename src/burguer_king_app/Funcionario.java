package burguer_king_app;

public class Funcionario extends Pessoa {
	//Atributos específicos
	String matricula;
	double salario;
	String cargo;
	
	//Construtores
	Funcionario(){
		
	}
	
	Funcionario(String matricula, double salario, String cargo){
		this.matricula = matricula;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	//Metodos
	void cozinhar() {
		//syso ctrl+espaço para colocar o print
		System.out.println("Cozinhando");
		}
	
	void aceitarPedido() {
		System.out.println("Aceitei...");
	}
	
}
