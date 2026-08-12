import java.util.Scanner;
import java.util.ArrayList;

class Livro{
	private String titulo;
	private String autor;
	private int ano;
	private boolean disponivel;
	
	Livro(String titulo,String autor,int ano){	
		if(ano > 0){
			this.titulo = titulo;
			this.autor = autor;
			this.ano = ano;
			this.disponivel = true;				
		}else{
			System.out.println("Objeto nao criado. Dados invalidos");
		}
	}
	
	//getters
	public String getAutor(){
		return autor;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getAno(){
		return ano;
	}
	
	public String getDisponivel(){
		if(disponivel == true){
			return "Disponivel";
		}else{
			return "Emprestado";
		}
	}
	
	//setters
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public void setDisponivel(boolean disponivel){
		this.disponivel = disponivel;
	}
		
	//metodos 	
	public void mostrarLivro(){
		System.out.printf("\n \n  >Titulo:%s\n  >Autor:%s\n  >Ano:%d\n  >Estado:%s\n\n ",titulo,autor,ano,getDisponivel());
	}
		
}

class Sistema{
	
	public static void adicionaLivro(Scanner input,ArrayList<Livro> livros){
		  
		
	}
	
	public static void listarLivros(ArrayList<Livro> livros){
		
			
	}
	
	public static void procurarLivro(Scanner input,ArrayList<Livro> livros){
		
		
	}
	
	public static void emprestarLivro(Scanner input,ArrayList<Livro> livros){
		
	}
	
	public static void devolverLivro(Scanner input,ArrayList<Livro> livros){
		
		
	}
	
	public static void removerLivro(Scanner input,ArrayList<Livro> livros){
		
	}
	
}

public class Biblioteca{
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Livro> livros = new ArrayList<>();
		
		while(true){
			System.out.printf("1 - Adicionar Livro\n2 - Listar Livros\n3 - Procurar Livro\n4 - Emprestar livro\n5 - Devolver livro\n6 - Remover livro\n0-Sair\n\nSelecione uma opcao:");
			int opcao = input.nextInt();
			input.nextLine();	
			
			
			switch(opcao){
					
					case 1:
						System.out.println("");
						Sistema.adicionaLivro(input,livros);
						break;
					case 2:
						Sistema.listarLivros(livros);
						break;
						
					case 3:
						Sistema.procurarLivro(input,livros);
						break;
						
					case 4:
						Sistema.emprestarLivro(input,livros);
						break;
						
					case 5:
						Sistema.devolverLivro(input,livros);
						break;
						
					case 6:
						Sistema.removerLivro(input,livros);
						break;
					case 0:
						System.out.println("saindo");
						break;
					
					default:
						System.out.println("Opcao invalida");
						break;
				}		

				if(opcao == 0){
					break;
				}
		}		
		
		
	}
		
}
	
