//Custum Exceptions

class InvalidAgeException extends Exception{
	
	private int statusCode;
	
	public InvalidAgeException(String msg, int statusCode){
		super(msg);
		this.statusCode = statusCode;
	}
	
	public void getDataException(){
		IO.println(getMessage());
		IO.println("statusCode:" + statusCode);
		IO.println(toString());
		
	}
	
	public int getStatusCode(){
		return statusCode;
	}
	
	
}

class SaldoInsuficienteException extends RuntimeException{
	public SaldoInsuficienteException(String msg){
		super(msg);
	}
}





class Main{
	
	public static void verificarIdade(int idade) throws InvalidAgeException{
		
		if(idade <= 0)
			throw new InvalidAgeException("Idade invalida vagabundo..." , 401);
		
		IO.println("idade valida");
	}
	
	public static void sacar(double saldo , double valor){
		
		if(valor <= 0)
			throw new IllegalArgumentException("Valor invalido!");
		
		if(valor > saldo)
			throw new SaldoInsuficienteException("O seu saldo nao e suficiente");
		
		double saldoRestante = saldo - valor;
		IO.println("Compra realizada com sucesso. Saldo restante:" + saldoRestante + " MT");
	}
	
	public static void main(String[] d) {
		sacar(8000,4000);
		

	
		try{
			verificarIdade(0);			
		}catch(InvalidAgeException e){
			e.getDataException();
		}
	}
	
}