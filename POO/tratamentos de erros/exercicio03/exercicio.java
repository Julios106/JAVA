import java.util.Scanner;

class exercicio{
	
	public static void verificar(int idade) throws Exception {
		if(idade < 0){		
			throw new IllegalArgumentException("Idade invalida..");		
		}		
		
		
		IO.println("Idade11:" + idade);
			
	}
	
	public static void main(String[] a){
		Scanner t = new Scanner(System.in);
		int idade = -4;
		
		if(idade < 0){		
			throw new IllegalArgumentException("Idade invalida..");		
		}
		
		IO.println("Idade:" + idade);
		
		try{
			verificar(10);
		}catch(Exception e){
			IO.println(e.toString ());
		}
		
	}
}