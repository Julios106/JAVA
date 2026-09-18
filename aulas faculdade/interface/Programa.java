//pag 189 - 190   

interface User{
	
	void login(int pin);
	
}

interface Detalhes2 {
	
	void sair();
	boolean checkPin(int p);
	
}

class Detalhes implements User,Detalhes2{
	
	public void login(int x){
		
		if(x == 1111){
			IO.println("Bem vindo");
		}else{
			IO.println("Senha errada");
			
		}
		
	}
	
	void sair(){
		System.exit(0);
	}
	
	boolean checkPin(int p){
		if(p == 1111){
			return true;
		}else{
			return false;
			
		}
		
	}
	
	
}



class Programa{
	
	public static void main(String[] args){
		
		Detalhes us 
		
	}
	
}