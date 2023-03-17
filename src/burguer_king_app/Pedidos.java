package burguer_king_app;

public class Pedidos {
	//Atributos
	String id;
	double valorTotal;
	String[] itens = new String[5];
	String data;
	String status;
	 
	 Pedidos(String id, double valorTotal, String[] itens, String data, String status){
		 this.id=id;
		 this.valorTotal = valorTotal;
		 this.itens = itens;
		 this.data = data;
		 this.status= status;
	 }
	 
	 Pedidos(){
		 
	 }
	 
	 void fecharPedido() {
		 System.out.println("Fechando o pedido...");
	 }
	 
	 double calculaValor() {
		 return valorTotal;
	 }
	 
	 String[] retirarItem() {
		 return itens;
	 }
	
}
