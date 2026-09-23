package sistema;
import funcionario.Funcionario;
import programador.Programador;
import gerente.Gerente;
import designer.Designer;

import java.util.Scanner;
import java.util.ArrayList;




public class Sistema{
	public static void interfaceFuncionario(){
		IO.println("1 - Gerente\n2 - Programador\n3 - Designer");
	}
	
	public static int opcao(){
		Scanner i = new Scanner(System.in);
		IO.println("Digite uma opcao:");
		int opcao = i.nextInt();
		return opcao;
	} 
	
	public static void adicionarFuncionario(ArrayList<Funcionario> f , Scanner i){
		interfaceFuncionario();
		int opc = opcao();
		if(opc == 1){
			funcoes.adicionarGerente(f,i);
		}else if(opc == 2){
			funcoes.adicionarProgramador(f,i);
		}else if(opc == 3){
			funcoes.adicionarDesigner(f,i);
		}else{
			IO.println("\n opcao invalida \n");
		}
	}
	
	public static void listar(ArrayList<Funcionario> f){
		interfaceFuncionario();
		IO.println("4 - Todos funcionarios");
		int opc = opcao();

		if(opc == 1){
			funcoes.listarGerentes(f);
		}else if(opc == 2){
			funcoes.listarProgramadores(f);
		}else if(opc == 3){
			funcoes.listarDesigners(f);
		}else if(opc == 4){
			funcoes.listarFuncionarios(f);
		}else{
			IO.println("\n opcao invalida \n");
		}		
		
	}
	
	//opcoes de um funcionario pelo indice
	public static void opcFuncionario(ArrayList<Funcionario> f , Scanner i){
		IO.println("Digite o indice:");
		int opc = i.nextInt();
		
		if(opc >= f.size() || opc < 0){
			IO.println("Opcao invalida");
		}else{
			f.get(opc).informacoes();
		}
	}
	
	public static void calcularBonusFuncionarios(ArrayList<Funcionario> f ){
		
		for(int i = 0 ; i<f.size() ; i++){
			double salario = f.get(i).getSalario();
			double bonus = f.get(i).calcularBonus(salario);
			IO.println(" ");
			IO.println("Nome:" + f.get(i).getNome());
			IO.println("Salario:" + salario);
			IO.println("Bonus:" + bonus);
			IO.println("Total:" + (f.get(i).getSalario() + bonus) );
			
		}
		
	}
	
	public static void procurar(ArrayList<Funcionario> f , Scanner i){
		IO.println("Escolha um filtro ");
		IO.println(" ");
		interfaceFuncionario();
		IO.println("4 - Nao tem conhecimento de nenhum dos filtros? Escolha esta opcao!");
		
		int opc = opcao();

		if(opc == 1){
			funcoes.procurarGerente(f,i);
		}else if(opc == 2){
			funcoes.procurarProgramador(f,i);
		}else if(opc == 3){
			funcoes.procurarDesigner(f,i);
		}else if(opc == 4){
			funcoes. procurarFuncionarios(f,i);
		}else{
			IO.println("\n opcao invalida \n");
		}
	}
	
	

}