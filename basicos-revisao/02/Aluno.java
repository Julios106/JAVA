import java.util.Scanner;

public class Aluno{
	public static void main(String [] args){
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = tec.nextLine();
		
		System.out.println("Nota 1:");
		double n1 = tec.nextDouble();
		
		System.out.println("Nota 2:");
		double n2 = tec.nextDouble();
		
		System.out.println("Nota 3:");
		double n3 = tec.nextDouble();
		
		double media = (n1 + n2 + n3)/3;
		
		//mostrar dados
		System.out.println("Nome:"+nome);
		System.out.printf("Media:%.2f Valores \n",media);
		
		if(media >= 13.5){
			System.out.println("Situacao:Dispensado");
		}else if(media > 9){
			System.out.println("Situacao:Aprovado");			
		}else{
			System.out.println("Situacao:Reprovado");
		}
		
	}
	
}