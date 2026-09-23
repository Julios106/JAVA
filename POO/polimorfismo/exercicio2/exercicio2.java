class Animal {
    public void fazerSom() {
        System.out.println("Som de animal");
    }
}

class Cachorro extends Animal {
    public void latir() {
        System.out.println("Au au!");
    }
}

class Gato extends Animal {
    public void miar() {
        System.out.println("Miau!");
    }
}




class exercicio2{
	//metodo pra fazer casting
	public static Cachorro dogCast(Animal c){
		Cachorro t = null;
		
		if(c instanceof Cachorro){
			t = (Cachorro) c;		
		}
		
		
		return t;
	}
	
	public static Gato catCast(Animal c){
		Gato t = null;
		
		if(c instanceof Gato){
			t = (Gato) c;		
		}
		
		return t;
	}
	
	
	
	
	public static void main(String[] args){
		
		Animal t = new Cachorro();
		t.fazerSom();
		
		Cachorro c = dogCast(t);
		c.latir();
		
		Animal g = new Gato();
		g.fazerSom();
		
		Gato gg = catCast(g);
		gg.miar();
		
		
	}
	
}