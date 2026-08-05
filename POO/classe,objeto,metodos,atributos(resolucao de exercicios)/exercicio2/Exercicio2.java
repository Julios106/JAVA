
class Produto{
	
	String nome;
	int quantidade;
	float preco;
	
	void mostrarProduto(){
		System.out.println("Nome do produto:"+nome);
		System.out.println("Quantidade no estoque:"+quantidade);
		System.out.println("Preco do produto:"+preco + " MT");
		
	}
	
	void venderProduto(int quantia){
		
		if(quantia > quantidade){
			System.out.println("erro! O produto nao tem essa quantia. Venda cancelada");
		}else{
			System.out.println("nova venda realizada");
			quantidade-=quantia;
		}
		

	}
	
}



public class Exercicio2{
	public static void main(String[] args){
		
		Produto produto1 = new Produto();
		
		produto1.nome = "xima";
		produto1.quantidade = 20;
		produto1.preco = 200;
		
		produto1.mostrarProduto();
		
		System.out.println(" ");
		
		produto1.venderProduto(19);//vender
		
		System.out.println(" ");
		produto1.mostrarProduto();//depois da venda
	}
	
	
}