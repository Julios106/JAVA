import java.util.Scanner;

class exercicio{
	
	public static void main(String[] a){
		Scanner t = new Scanner(System.in);
		try{
			
			
			IO.println("n:");
			int n = t.nextInt();
			
			IO.println("n:");
			int n2 = t.nextInt();
			
			int d = n/n2;
			
			IO.println("result:" + d);
			
			
		}catch(ArithmeticException e){
			IO.println("Erro:" + e.getMessage());
		}catch(Exception e){
			IO.println("Erro:" + e.getMessage());
		}finally{
			IO.println("Processo terminado...");
		}
	}
}