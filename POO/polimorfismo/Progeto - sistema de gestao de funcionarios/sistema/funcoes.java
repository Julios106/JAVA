package sistema;
import funcionario.Funcionario;
import programador.Programador;
import gerente.Gerente;
import designer.Designer;

import java.util.Scanner;
import java.util.ArrayList;


public class funcoes{
	public static void adicionarGerente(ArrayList<Funcionario> f , Scanner i){
		IO.println("Nome:");
		String nome = i.nextLine();
		
		IO.println("Idade:");
		int idade = i.nextInt();
		
		i.nextLine();
		
		IO.println("Salario:");
		double salario = i.nextDouble();
		i.nextLine();
		
		IO.println("Departamento:");
		String dep = i.nextLine();
		
		IO.println("Numeros de funcionarios:");
		int n_funcionarios = i.nextInt();
		
		i.nextLine();
		
		f.add(new Gerente(nome,idade,salario,dep,n_funcionarios));
	}
	
	public static void adicionarProgramador(ArrayList<Funcionario> f , Scanner i){
		IO.println("Nome:");
		String nome = i.nextLine();
		
		IO.println("Idade:");
		int idade = i.nextInt();
		
		i.nextLine();
		
		IO.println("Salario:");
		double salario = i.nextDouble();
		i.nextLine();
			
		IO.println("Linguagem:");
		String ling = i.nextLine();
		
		IO.println("Experiencia:");
		String exp = i.nextLine();
		
		f.add(new Programador(nome , idade ,salario ,ling , exp));
	}
	
	public static void adicionarDesigner(ArrayList<Funcionario> f , Scanner i){
		IO.println("Nome:");
		String nome = i.nextLine();
		
		IO.println("Idade:");
		int idade = i.nextInt();
		
		i.nextLine();
		
		IO.println("Salario:");
		double salario = i.nextDouble();
		i.nextLine();
	
		IO.println("Ferramenta:");
		String fer = i.nextLine();
		
		f.add(new Designer(nome , idade , salario , fer) );
		
	}
	
	public static void listarGerentes(ArrayList<Funcionario> f){
		
		boolean find = false;
		
		for(int i = 0 ; i<f.size() ; i++){
			if(f.get(i) instanceof Gerente){
				f.get(i).informacoes();
				find = true;
			}
		}
		
		if(find == false){
			IO.println("Nenhum gerente cadastrado no sistema ainda");
		}
	}

	public static void listarProgramadores(ArrayList<Funcionario> f){
		boolean find = false;
		
		for(int i = 0 ; i<f.size() ; i++){
			if(f.get(i) instanceof Programador){
				f.get(i).informacoes();
				find = true;
			}
		}
		
		if(find == false){
			IO.println("Nenhum Programador cadastrado no sistema ainda");
		}				
	}
	
	public static void listarDesigners(ArrayList<Funcionario> f){
		boolean find = false;
		
		for(int i = 0 ; i<f.size() ; i++){
			if(f.get(i) instanceof Designer){
				f.get(i).informacoes();
				find = true;
			}
		}

		if(find == false){
			IO.println("Nenhum Designer cadastrado no sistema ainda");
		}
			
	}
	
	public static void listarFuncionarios(ArrayList<Funcionario> f){
		for(Funcionario funcionario : f)
			funcionario.informacoes();
	}	
	
	public static void procurarGerente(ArrayList<Funcionario> f ,Scanner in ){
		IO.println("Escreva o nome:");
		String nome = in.nextLine();
		boolean found = false;
		
		for(int i = 0 ; i<f.size() ; i++){
			if(f.get(i) instanceof Gerente){
				if(f.get(i).getNome().equals(nome)){
					f.get(i).informacoes();
					found = true;
				}				
			}			
		}
		
		if(found == false){
			IO.println("Nao foi possivel encontrar ninguem com esse nome");
		}
		
	}
	
	public static void procurarProgramador(ArrayList<Funcionario> f ,Scanner in ){
		IO.println("Escreva o nome:");
		String nome = in.nextLine();
		boolean found = false;
		
		for(int i = 0 ; i<f.size() ; i++){
			if(f.get(i) instanceof Programador){
				if(f.get(i).getNome().equals(nome)){
					f.get(i).informacoes();
					found = true;
				}				
			}			
		}
		
		if(found == false){
			IO.println("Nao foi possivel encontrar ninguem com esse nome");
		}
		
	}	
	
	public static void procurarDesigner(ArrayList<Funcionario> f ,Scanner in ){
		IO.println("Escreva o nome:");
		String nome = in.nextLine();
		boolean found = false;
		
		for(int i = 0 ; i<f.size() ; i++){
			if(f.get(i) instanceof Designer){
				if(f.get(i).getNome().equals(nome)){
					f.get(i).informacoes();
					found = true;
				}				
			}			
		}
		
		if(found == false){
			IO.println("Nao foi possivel encontrar ninguem com esse nome");
		}
		
	}
		//sem nenhum filtro
	public static void procurarFuncionarios(ArrayList<Funcionario> f ,Scanner in ){
		IO.println("Escreva o nome:");
		String nome = in.nextLine();
		boolean found = false;
		
		for(int i = 0 ; i<f.size() ; i++){

			if(f.get(i).getNome().equals(nome)){
				f.get(i).informacoes();
				found = true;
			}							
		}
		
		if(found == false){
			IO.println("Nao foi possivel encontrar ninguem com esse nome");
		}
		
	}	
}