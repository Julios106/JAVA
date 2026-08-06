class Produto{
	
	String nome;
	int quantidade;
	double preco;
	
	Produto(String nome,int quantidade,double preco){
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		
	}
	
	void mostrarProduto(){
		System.out.println("Nome do produto:"+nome);
		System.out.println("Quantidade no estoque:"+quantidade);
		System.out.println("Preco do produto:"+preco + " MT");
		
	}
	
	void venderProduto(int quantia){
		
		if(quantia > quantidade){
			System.out.println("erro! O produto nao tem essa quantia. Venda cancelada");
		}else{
			System.out.println("nova venda realizada! "+quantia+" unidades");
			quantidade-=quantia;
		}
		

	}
	
}




public class Exercicio2 {
	
	public static void main(String[] args){
		
		Produto produto1 = new Produto("arroz",20,300);
		
		produto1.mostrarProduto();
		
		produto1.venderProduto(10);
		
		produto1.mostrarProduto();

		
		
	}
	
}