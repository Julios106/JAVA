import java.util.Scanner;

class Cofre{
	public static double valorTotal = 0;
	public static int numeroContribuicoes = 0;
	
	public static void listarContribuentes(Pessoa[] array){
		
		for(int i = 0 ; i<numeroContribuicoes ; i++)
			array[i].mostrarPessoa();
		
	}
	
	public static void maiorContribuicao(Pessoa[] array){
		double valorMaximo = 0;
		for(int i = 0 ; i<numeroContribuicoes ; i++){
			
			if(array[i].valorContribuido > valorMaximo){
				valorMaximo = array[i].valorContribuido;		
			}
		}
		
		IO.println(">>>Contribuentes mais generosos<<<");
		for(int i = 0 ; i<numeroContribuicoes  ; i++){
			
			
			
			if(array[i].valorContribuido == valorMaximo){
				
				array[i].mostrarPessoa();
				
			}
			
		}
		
	}
	
	public static void novaContribuicao(Pessoa[] array,Scanner input){
		if(numeroContribuicoes >= array.length){
			IO.println("Desculpe. O cofre ja esta cheio, Obrigado!");
			return;
		}
		
		for (int i = numeroContribuicoes; i<array.length ; i++){
			
			IO.println("Digite o seu nome:");
			String nome = input.nextLine();
			
			IO.println("Digite a sua idade:");
			int idade = input.nextInt();
			
			IO.println("Digite o valor que quer contribur");
			double valor = input.nextDouble();
			
			if(valor <= 10 ){
				IO.println("Valor muito baixo,fica com ele");
				continue;
			}
			
			valorTotal += valor;
			
			array[i] = new Pessoa(nome,idade,valor);
			
			numeroContribuicoes++;
			
			break;
			
		}
		
		
		
	}
	
	public static void confreInterface(){
		IO.println(" ");
		IO.println(" BEM VINDO ");
		IO.println(" ");
		IO.println(" 1 - Fazer Nova Contribuicao ");
		IO.println(" 2 - Listar Contribuentes ");
		IO.println(" 3 - Melhores Contribuidores ");
		IO.println(" 4 - Valor Total Contribuido ");
		IO.println(" 0 - Terminar ");
		
	}

	
}


class Pessoa {  
	public String nome;
	public int idade;
	public double valorContribuido;
	
	Pessoa(String nome,int idade,double valorContribuido){
		this.nome = nome;
		this.idade = idade;
		this.valorContribuido = valorContribuido;
		
	}
	
	public void mostrarPessoa(){
		IO.println(" ");
		IO.println("Nome:" + nome);
		IO.println("idade:" + idade);
		IO.println("Valor contribuido:" + valorContribuido + "MT");
		IO.println(" ");
		
	}


}

public class Static {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Pessoa[] contribuintes = new Pessoa[3];
		
		while(true){
			
			Cofre.confreInterface();
			
			IO.println(" Digite uma opcao:");
			int opcao = input.nextInt();
			IO.println(" ");
			
			
			switch (opcao){
				case 1:
					input.nextLine();
					Cofre.novaContribuicao(contribuintes,input);
					break;
				
				case 2:
					input.nextLine();
					IO.println(" ");
					Cofre.listarContribuentes(contribuintes);
					break;
				
				case 3:
					input.nextLine();
					Cofre.maiorContribuicao(contribuintes);
					break;
					
				case 4:
					input.nextLine();
					IO.println("O valor total obtido e de " + Cofre.valorTotal + "MT"); 
					break;
					
				case 0:
					break;
					
				default:
					IO.println("Opcao invalida. Erro!");
					break;
				
			}
			
			if(opcao == 0){
				break;
				
			}
					
			
		}	
		
	}
	
}