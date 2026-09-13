class Mat{
	
	public float Area(float c,float l){
		
		return c * l;
		
	}

	
}

class Matematica extends Mat {
	
	public float Area(float c,float l){
		
		return (c * l)/2;
		
	}
	
	
	public float oldArea(float c,float l){
		
		return super.Area(c,l);
		
	}
}




public class Exercicio01{
	
	public static void main(String [] args){
		Matematica area = new Matematica();
		
		IO.println("Area do triangulo: " + area.Area(21,2) + " cm");
		IO.println("Area do retangulo: " + area.oldArea(4,10) + " cm");
		
	}
	
	
}