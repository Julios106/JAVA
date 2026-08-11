import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1{
	
	public static void mostrarCompras(ArrayList<String> compras){
		System.out.println("");
		System.out.println("<>Produtos<>");
		System.out.println("");
		for(int i = 0 ; i<compras.size();i++)
			System.out.println("  <>" + compras.get(i));
		System.out.println("");		
		
	}
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		ArrayList <String> compras = new ArrayList<>();
		
		compras.add("Manga");
		compras.add("xima");
		compras.add("arroz");
		compras.add("carne");
		compras.add("cornoflaks");
		
		
		mostrarCompras(compras);

		System.out.println("Escolha um produto para remover:");
		String produto = input.nextLine();
		
		if(compras.contains(produto)){
			int posicao = compras.indexOf(produto);
			
			System.out.println("<>" + compras.get(posicao) + " Esta na posicao " + posicao + " do arrayList e sera removido");
			compras.remove(posicao);
			
		}else{
			
			System.out.println("Produto nao existe");
		}
		
		mostrarCompras(compras);
		
		
	}
	
	
}