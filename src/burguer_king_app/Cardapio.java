package burguer_king_app;

public class Cardapio {
	 String[] itens = new String[5];
	 double[] preco = new double[5];
	 String[] ingredientes = new String[5];
	 
	 Cardapio(){}
	 
	 Cardapio(String[] itens, double[] preco, String[] ingredientes){
		 this.itens = itens;
		 this.preco = preco;
		 this.ingredientes = ingredientes;
	 }
	 
	 String[] modificarCardapio(){
		 return itens;
	 }
	 
	 
}
