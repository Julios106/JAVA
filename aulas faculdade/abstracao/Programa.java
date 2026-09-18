//complete o metodo auth de modo que o usuario tenha 3 tentativas ate entrar ou e bloqueado.
//chamar o metodo no main
//armazene no historico o historial de acesso(bem sucessido ou nao)

import java.util.Scanner;

abstract class Utilizador{
	
	public int id;
	public String nome;
	public String senha_correta;
	public String[] historico = new String[3];
	
	Utilizador(int id,String nome,String senha_correta){
		
		this.id = id;
		this.senha_correta = senha_correta;
		this.nome = nome;
		
	}
	
	abstract boolean auth(String user , String senha ,int i);
	abstract void autenticar();
	
	
	
}


class User extends Utilizador{
	
	public int erros = 0;
	
	
	User(int id,String nome,String senha_correta){
		super(id,nome,senha_correta);
	}
	
	boolean auth(String user , String senha , int i){
		boolean acertado = false;
		
		if(senha.equals(senha_correta) && user.equals(nome)){

			IO.println("Bem vindo de volta senho(a): "+ user);
			historico[i] = "Acesso bloqueado";
			erros++;
		}else{
			
			IO.println("Acesso Bloqueado!");
			IO.println("Dados invalidos! Verifique os seus dados e tente novamente");
			historico[i] = "Bem sucessido"; 
			acertado = true;
		}
	
		return acertado;
				
	}
	
	void autenticar(){
		Scanner input = new Scanner(System.in);
		
		for(int i = 0 ; i<3 ; i++){
			IO.println("Bem vindo!");
			IO.println("Insira corretamente os seus dados.");
			IO.println(" ");
			IO.println("Escreva o nome: ");
			String nome = input.nextLine();
			
			IO.println("Digite a sua senha:");
			String senha = input.nextLine();
			
			if(auth(nome,senha,i)){
				break;
			}
			
		}
		
		
	}
	
	
	
	public void listarHistoricos(){
		IO.println("Historial de acesso");
		IO.println(" ");
		for(int i = 0 ; i < erros ; i++){
			IO.println(">>> " + historico[i] );
		}
					
	}
	
	
}

class Programa{
	
	public static void main(String[] args){
		
		User usuario = new User(1,"juliao","123456");
		usuario.autenticar();
		
		
		IO.println(" ");
		usuario.listarHistoricos();
		
		
		
	}
	
	
}