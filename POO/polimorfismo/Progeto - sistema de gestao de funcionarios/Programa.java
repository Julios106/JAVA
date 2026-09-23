import funcionario.Funcionario;
import programador.Programador;
import gerente.Gerente;
import designer.Designer;
import sistema.Sistema;

import java.util.Scanner;
import java.util.ArrayList;

class Programa{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		

		
		ArrayList<Funcionario> f = new ArrayList<>();
		
		f.add(new Programador());
		f.add(new Gerente());
		
		//IO.println(f.size());
		
		//Sistema.adicionarFuncionario(f , input);		
		//Sistema.listar(f);
		//Sistema.opcFuncionario(f,input);
		//Sistema.calcularBonusFuncionarios(f);
		//Sistema.procurar(f,input);

		while(true){
			System.out.printf("1. Adicionar funcionário\n2. Listar funcionários\n3. Mostrar informações de um funcionário\n4. Calcular bônus de todos\n5. Procurar funcionário\n0-Sair\n\nSelecione uma opcao:");
			int opcao = input.nextInt();
			input.nextLine();	
			
			if(opcao == 0){
				break;
			}
			
			switch(opcao){
					
					case 1:
						System.out.println("");
						Sistema.adicionarFuncionario(f , input);	
						break;
					case 2:
						Sistema.listar(f);
						break;
						
					case 3:
						Sistema.opcFuncionario(f,input);
						break;
						
					case 4:
						Sistema.calcularBonusFuncionarios(f);
						break;
						
					case 5:
						Sistema.procurar(f,input);
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