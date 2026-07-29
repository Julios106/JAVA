import java.util.Scanner;

public class Turma{
	public static void main(String [] args){
		Scanner tec = new Scanner(System.in);
		String melhorAluno = "Not yet";
		String piorAluno = "Not yet";
		double maxMedia = 0;
		double minMedia = 1000;
		int aprovado = 0;
		int reprovado = 0;
		double totalMedia = 0;
		
		System.out.println("Qual e o numero de alunos na turma");
		int n = tec.nextInt();
		
		
		for(int i =0 ;i<n;i++){
			tec.nextLine();//para limpar o enter
			int posicao = i+1;
			System.out.println("Aluno "+posicao);
			System.out.println("Digite o nome do aluno:");
			String nome = tec.nextLine();
			
			System.out.println("Digite nota1:");
			double n1 = tec.nextDouble();
			
			
			System.out.println("Digite a nota2:");
			double n2 = tec.nextDouble();
	
			
			double media = (n1+n2)/2;		
			totalMedia+=media;
			
			System.out.println("");
			System.out.println("");
			
			if(maxMedia < media){
				melhorAluno = nome;
				maxMedia = media;
			}
			
			if(minMedia > media){
				piorAluno = nome;
				minMedia = media;
			}
			
			if(media >= 10){
				aprovado++;
			}else{
				reprovado++;
			}
		}
		double mediaTurma = totalMedia/(double)n;
		
		System.out.println("Quant aprovados:"+aprovado);
		System.out.println("Quant reprovados:"+reprovado);
		System.out.printf("Media da turma:%.2f \n",mediaTurma);
		System.out.printf("Maior Media:%.2f \n",maxMedia);
		System.out.println("Melhor aluno:"+melhorAluno);
		System.out.println("pior aluno:"+piorAluno);
		System.out.printf("Maior Media:%.2f \n",minMedia);
		
		
	}
	
}
