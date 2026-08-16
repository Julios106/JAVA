import java.util.Scanner;

class Cliente{
	
	public int id;
	public String nome;
	public float conta;
	
	public void gravar(int id,String nome,float conta){
		this.id = id;
		this.nome = nome;
		this.conta = conta;
	}
	
	public void mostrar(){
		//Scanner input = new Scanner(System.in);
		
		IO.println("ID:" + id);
		IO.println("nome:" + nome);
		IO.println("Conta:" + conta);
	}
	

}

class Programa{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		//cliente1.id = 1;
		
		///cliente1.nome = input.nextLine();
		//System.out.println(cliente1.nome);
		
		cliente1.gravar(1,"julio",1222);
		cliente1.mostrar();
		
		
		
	}
}