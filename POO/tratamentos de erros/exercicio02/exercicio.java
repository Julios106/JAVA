import java.util.Scanner;

class exercicio{
	
	public static void main(String[] a){
		Scanner t = new Scanner(System.in);
		
		try{
			int[] numeros = {10, 20, 30};
			
			for(int n : numeros)
				IO.println("=> " + n + "\n");
			
			IO.println("Escolha um indice e depois divide por um numero");
			IO.println("Idice:");
			int i = t.nextInt();
			
			IO.println("numero para dividir:");
			int n = t.nextInt();
			
			int x = numeros[i] / n;
			
			IO.println("Resultado:" + x);
		}catch(ArithmeticException e){
			
			IO.println("Erro: pode ter dividido por o =>" + e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			IO.println("Erro:Indice invalido para o array ou nao existe => " + e.getMessage());
		}catch(Exception e){
			IO.println("Erro:Algo deu errado tente novamente => " + e.getMessage());
			e.printStackTrace();
		}
	}
}