import java.io.IOException;

class Main{
    public static void testar() throws IOException {
        throw new IOException("Erro de leitura");
    }	
	
	
	public static void main(String[] a) throws IOException{
        testar();

        IO.println("Programa terminou.");		
	}
	
	
}