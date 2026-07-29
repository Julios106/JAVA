import java.util.Scanner;

public class main{ 

	public static void main(String[] args) { 
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		int idade = tec.nextInt();
		
		if(idade >= 18){
			System.out.println("maior de idade");
		}else{
			System.out.println("Menor de idade");
			
		}
	
	} 
	
}