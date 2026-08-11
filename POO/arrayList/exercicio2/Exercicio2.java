import java.util.Scanner;
import java.util.ArrayList;


class Nome{
	
	private String nome;
	
	Nome(String nome){
		this.nome = nome;	
	}
	
	public String getNome(){
		return nome;	
	}
	
	public void setNome(String nomeNovo,String nomeAntigo){
		
		if( nomeAntigo.equals(getNome()) ){
			this.nome = nomeNovo;	
		}else{
			System.out.println("Erro! vc digitou errado o nome antigo");
		}
	}
	
	
}

class Logica{
	public static void adicionarNome(Scanner input,ArrayList<Nome> nomes){
		System.out.println("Digite o novo nome:");
		String newNome = input.nextLine();
		nomes.add(new Nome(newNome));
		System.out.println("nome " + newNome + "  adicionado com sucesso!");
			
	}
	
	public static void listarNomes(ArrayList<Nome> nomes){
		System.out.println("");
		System.out.println("===========================");
		System.out.println("    <>Lista de Nomes<>    ");
		System.out.println("===========================");
		
		for(Nome nome : nomes)
			System.out.println("   <>" + nome.getNome());	
		
		System.out.println("");
	}
	
	public static void procurarNome(Scanner input,ArrayList<Nome> nomes){
		System.out.println("Digitr o nome que deseja encontrar:");
		String nome = input.nextLine();
		boolean encontrado = false;
		
		for(int i = 0;i<nomes.size();i++){
			if(nomes.get(i).getNome().equals(nome)){
				System.out.println("Nome encontrado na posicao "+ i);
				System.out.println(" <>" + nomes.get(i).getNome());
				System.out.println("");	
				
				encontrado = true;
			}
			
			
		}
		
		if(encontrado == false){
			System.out.println("Nome nao encontrado...");
			System.out.println("");
		}
	}
	
	public static void removerNome(Scanner input ,ArrayList<Nome> nomes){
		
		System.out.println("Digite o nome que deseja remover");
		String nome = input.nextLine();
		int posicao = 0;
		boolean encontrado = false;
		
		for(int i = 0;i<nomes.size();i++){
			if(nomes.get(i).getNome().equals(nome)){
				posicao = i;
				encontrado = true;
				break;
			}
			
		}
	
		
		if(encontrado == true){
			nomes.remove(posicao);
			System.out.println("Nome removido com sucesso!");
			System.out.println("");
			
		}else{
			System.out.println("Esse nome nao existe....");
			System.out.println("");
		}
		
	}
	
	public static void alterarNome(Scanner input,ArrayList<Nome> nomes){
		System.out.println("Nome atual:");
		String nomeAtual = input.nextLine();
		
		System.out.println("Novo nome:");
		String nomeNovo = input.nextLine();
		
		boolean mudou = false;
		for(int i = 0;i<nomes.size();i++){
			
			if(nomes.get(i).getNome().equals(nomeAtual)){
				
				nomes.get(i).setNome(nomeNovo,nomeAtual);
				mudou = true;
			}
			
			
		}
		
		if(mudou == false){
			System.out.println("Nome nao encontrado");
		}
		
		
		
	}
	
	
}


class Sistema{

	public static void sistemaInterface(){
		Scanner input = new Scanner(System.in);
		ArrayList <Nome> nomes = new ArrayList<>();
	
		
		int opcao = 90;
		
		while(opcao != 0){
			System.out.printf("1 - Adicionar nome\n2 - Listar nomes\n3 - Procurar nome\n4 - Remover nome\n5 - Alterar nome\n0-Sair\n\nSelecione uma opcao:");
			opcao = input.nextInt();
			input.nextLine();	
			
			
			switch(opcao){
					
					case 1:
						System.out.println("");
						Logica.adicionarNome(input,nomes);
						break;
					case 2:
						Logica.listarNomes(nomes);
						break;
						
					case 3:
						Logica.procurarNome(input,nomes);
						break;
						
					case 4:
						Logica.removerNome(input,nomes);
						break;
						
					case 5:
						Logica.alterarNome(input,nomes);
						break;
					case 0:
						System.out.println("saindo");
						break;
					
					default:
						System.out.println("Opcao invalida");
						break;
				}						
		}		
		
		
	}
	
}



public class Exercicio2{
	
	public static void main(String[] args){
		Sistema.sistemaInterface();
	}
	
	
}