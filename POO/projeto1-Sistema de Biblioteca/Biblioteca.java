import java.util.Scanner;
import java.util.ArrayList;

class Config{
	
	public static void limpar(){
		for(int i = 0;i<30;i++)
			System.out.println(" ");
	}
	
	
}

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
	
	public boolean isDisponivel(){
		return disponivel;
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
		System.out.println(" ");
		IO.println("Adicionar nov Livro");
		System.out.println(" ");
		
		IO.println("Titulo:");
		String titulo = input.nextLine();
		
		IO.println("Autor:");
		String autor = input.nextLine();
		
		IO.println("Ano:");
		int ano = input.nextInt();
		
		livros.add(new Livro(titulo,autor,ano));
		
		IO.println("Livro adicionado com sucesso!");
		System.out.println(" ");
		
	}
	
	public static void listarLivros(ArrayList<Livro> livros){
		System.out.println(" LIVROS NO SISTEMA ");
		
		for(Livro livro : livros)
			livro.mostrarLivro();
			
	}
	
	//funcoes de procura do livro
	public static void filtroTitulo(String titulo,ArrayList<Livro> livros){
		boolean encontrado = false;
		for(int i = 0; i<livros.size() ; i++){
			
			if(livros.get(i).getTitulo().equals(titulo)){
				livros.get(i).mostrarLivro();	
			}
			
		}
		
		if(encontrado == false){
			IO.println("Livro nao encontrado");
		}
	}
	
	public static void filtroAutor(String autor,ArrayList<Livro> livros){
		int totalEncontrado = 0;
		for(int i = 0; i<livros.size() ; i++){
			
			if(livros.get(i).getAutor().equals(autor)){
				livros.get(i).mostrarLivro();	
				totalEncontrado++;
			}
			
		}	

		if(totalEncontrado <= 0){
			IO.println("Nao foram encontrados nenhum livro desse ano");
		}		
		
	}
	
	public static void filtroAno(int ano,ArrayList<Livro> livros){
		
		int totalEncontrado = 0;
		for(int i = 0; i<livros.size() ; i++){
			
			if(livros.get(i).getAno() == ano){
				livros.get(i).mostrarLivro();
				totalEncontrado++;
			}
			
		}
		
		if(totalEncontrado <= 0){
			IO.println("Nao foram encontrados nenhum livro desse ano");
		}
	}
	
	public static void filtroEstado(int estado,ArrayList<Livro> livros){
		//1 - Disponivel
		//2 - Emprestado
		
		if(estado == 1){
			IO.println("Livros disponiveis");
			
			System.out.println(" ");
			for( int i = 0; i <livros.size() ; i++){
				if(livros.get(i).isDisponivel() == true){
					livros.get(i).mostrarLivro();
				}
			}
			
		}else if(estado == 2){
			IO.println("Livros Emprestados");
			
			System.out.println(" ");
			
			for( int i = 0; i <livros.size() ; i++){
				if(livros.get(i).isDisponivel() == false){
					livros.get(i).mostrarLivro();
				}
			}			
			
		}
		
		
		
		
	}
	//fim
	
	public static void procurarLivro(Scanner input,ArrayList<Livro> livros){
		while(true){
			IO.println("Escolha o metodo de busca");
			System.out.println(" ");
			
			IO.println("1 - Buscar por titulo:");
			IO.println("2 - Buscar pelo autor:");
			IO.println("3 - Buscar por ano:");
			IO.println("4 - MosTrar por Estado(Disponivel/emprestado) :");
			IO.println("0 - Terminar Busca");
			System.out.println(" ");
			
			IO.println("Opcao:");
			int opcao = input.nextInt();
			input.nextLine();
			
			if(opcao == 1){
				
				Config.limpar();
				System.out.println("Digite o titulo: ");
				String titulo = input.nextLine();
				
				filtroTitulo(titulo,livros);
				System.out.println(" ");
				System.out.println(" ");
				
			}else if(opcao == 2){
				Config.limpar();
				System.out.println("Digite o nome do autor: ");
				String autor =  input.nextLine();
				
				filtroAutor(autor,livros);
				System.out.println(" ");
				System.out.println(" ");
				
			}else if(opcao == 3){
				Config.limpar();
				System.out.println("Digite o ano: ");
				int ano = input.nextInt();
				
				filtroAno(ano,livros);
				System.out.println(" ");
				System.out.println(" ");
				
			}else if(opcao == 4){
				Config.limpar();
				IO.println("1 - DispONIvEL:");
				IO.println("2 - Emprestado:");
				IO.println("Digite a opcao:");
				int estado = input.nextInt();
				
				filtroEstado(estado,livros);
			}else if(opcao == 0){
				Config.limpar();
				break;
			}
			
			
			
			
		}
		
	}
	
	public static void emprestarLivro(Scanner input,ArrayList<Livro> livros){
		IO.println("Esceva o titulo do livro para emprestar");
		String titulo = input.nextLine();
		boolean emprestado = false;
		
		for(int i = 0; i<livros.size() ; i++){
			if( livros.get(i).getTitulo().equals(titulo) && livros.get(i).isDisponivel() == true){
				IO.println("Livro emprestado com sucesso devolva");
				emprestado = true;
				livros.get(i).setDisponivel(false);
				break;
			}
		}
		
		if(emprestado == false)
		{
			IO.println("Este livro nao EsTA DispONIvEL! voltE MAis tarde");
		}
		
	}
	
	public static void devolverLivro(Scanner input,ArrayList<Livro> livros){
	
		IO.println("Esceva o titulo do livro para devolver");
		String titulo = input.nextLine();
		boolean devolvido = false;
		
		for(int i = 0; i<livros.size() ; i++){
			if( livros.get(i).getTitulo().equals(titulo) && livros.get(i).isDisponivel() == false){
				IO.println("Livro devolvido com sucesso! volte sempre");
				devolvido = true;
				livros.get(i).setDisponivel(true);
				break;
			}
		}
		
		if(devolvido == false)
		{
			IO.println("Este livro ja foi devolvido! obrigado");
		}
		
		
		
	}
	
	public static void removerLivro(Scanner input,ArrayList<Livro> livros){
		IO.println("Esceva o titulo do livro para remover");
		String titulo = input.nextLine();
		boolean encontrado = false;
		int indice = -1 ;
		
		for(int i = 0; i<livros.size() ; i++){
			if( livros.get(i).getTitulo().equals(titulo)){
				indice = i;
				encontrado = true;
				break;
			}
		}
		
		if(encontrado == true){
			IO.println("livro do titulo " + livros.get(indice).getTitulo() + " foi removido com sucesso");
			livros.remove(indice);	
		}
		
		if(encontrado == false){
			IO.println(" erro este livro nao foi encontrado no sistema");
		}
		
		

				
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
			Config.limpar();
			
			switch(opcao){
					
					case 1:
						System.out.println("");
						Sistema.adicionaLivro(input,livros);
						Config.limpar();
						break;
					case 2:
						Sistema.listarLivros(livros);
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");
						break;
						
					case 3:
						Sistema.procurarLivro(input,livros);
						Config.limpar();
						break;
						
					case 4:
					
						Sistema.emprestarLivro(input,livros);
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");						
						break;
						
					case 5:
						Sistema.devolverLivro(input,livros);
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");
						break;
						
					case 6:
						Sistema.removerLivro(input,livros);
						System.out.println(" ");
						System.out.println(" ");
						System.out.println(" ");
						break;
					case 0:
						System.out.println("saindo");
						break;
					
					default:
						System.out.println("Opcao invalida");
						Config.limpar();
						break;
				}		

				if(opcao == 0){
					break;
				}
		}		
		
		
	}
		
}
	
