import java.util.Scanner;

class Actividade{
	
	static final int tamanho = 5;
	
	//Complete as funções abaixo e as chame correctamente no main
	static void inserir(int ar[]){
		//preenche o array pelo teclado
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("preencha as posicoes do array:");
		System.out.println("O tamanho do array e " + ar.length);
		for(int i = 0; i<ar.length ; i++){
			System.out.println("Posicao "+ i + "/" + (ar.length - 1) + ":");
			int valor = input.nextInt();
			ar[i] = valor;	
		}
		
	} 
	static void show(int ar[]){
		//visualisa o array
		for(int i = 0;i<ar.length;i++)
			System.out.println("posicao " + i + ":" + ar[i]);	
	}  
	static boolean check(int ar[],int x){
		//verifica se x existe em ar 
		
		boolean existe = false;		
		for(int i = 0;i<ar.length;i++){

			if(ar[i] == x){
				existe = true;
				break;
			}
			
		}
		
		return existe;
		
		
	}
	static int cont(int ar[],int x){
		//Retorna o número de ocorrências de x em ar(quantas vezes o x aparece em ar) 
		
		int ocorrencia = 0;
		
		for(int i = 0;i<ar.length;i++){
			if(ar[i] == x){
				ocorrencia++;
			}	
		}
		
		return ocorrencia;
	}
	
	static void update(int ar[],int ind, int v){
		//actualiza em v unidades o valor de ar no indice ind 
		if(ind > (ar.length -1) || ind < 0){
			System.out.println("Erro o indice excedeu o tamanho do array...");
			return;
		}
		
		int atualizar = ar[ind] + v;
		ar[ind] = atualizar;
		System.out.printf("O valor da posicao %d atualizou para %d \n",ind,ar[ind]);
	}
	
	static void troca(int ar1[],int ar2[]){
		//Efectua a troca de elementos entre os dois arrays
		
		int aux1 = 0;
		int aux2 = 0;
		for(int i = 0; i<6 ; i++){
			aux1 = ar1[i];
			aux2 = ar2[i];
			ar1[i] = aux2;
			ar2[i] = aux1;

		}
		
		System.out.println("array 1");
		for(int i = 0;i<ar1.length;i++){
			
			System.out.printf("%d ",ar1[i]);
		}
		
		System.out.println("\n array 2");
		for(int i = 0;i<ar2.length;i++){
			System.out.printf("%d ",ar2[i]);
		}
		
	}
	static void pauta(float ar[][]){
		//visualiza a matriz em forma de pauta
		System.out.print("        ");
		for (int j = 0; j < tamanho; j++) {
			System.out.printf(" Coluna %d   ", j);
		}
		System.out.println();
		
		for(int i = 0;i<tamanho;i++){
			
			System.out.printf(" Linha%d", i);
			for(int n = 0; n<tamanho;n++){
				
				System.out.printf("    %.0f       ",ar[i][n]);
			}
			System.out.println(" ");
		}
		
		
	}
	
	public static void atividadeInterface(){
		Scanner input = new Scanner(System.in);
		int[] array = new int[tamanho];
		
		int[] ar1 = {1,2,3,4,5,6};
		int[] ar2 = {60,50,40,30,20,10};
		
		float[][] matriz = {
			{1 , 3, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 }
			
		};
		
		while(true){
			System.out.printf("1 - Inserir valores no Array\n2 - Visualizar Array\n3 - Verificar existência de um valor\n4 - Contar ocorrências de um valor\n5 - Atualizar valor de uma posição\n6 - Trocar elementos entre Arrays\n7 - Visualizar Pauta\n0-Sair\n\nSelecione uma opcao:");
			int opcao = input.nextInt();
			input.nextLine();	
			
			
			switch(opcao){
					
					case 1:
						System.out.println("");
						inserir(array);
						break;
					case 2:
						show(array);
						break;
						
					case 3:
						System.out.println("");
						System.out.println(check(array,13));
						break;
						
					case 4:
						System.out.println("A ocorencia e: " + cont(array,12));
						break;
						
					case 5:
						update(array,2,10);
						break;
						
					case 6:
						troca(ar1,ar2);
						break;
						
					case 7:
						pauta(matriz);
						break;
					case 0:
						System.out.println("saindo");
						break;
					
					default:
						System.out.println("Opcao invalida");
						break;
				}		

				if(opcao == 0){
					break;
				}
		}		
		
		
		
	}
	
	public static void main(String[] args){
		//int[] array = new int[tamanho];
		
		//inserir(array);
		
		//show(array);
		
		//System.out.println(check(array,13));
		
		//update(array,2,10);
		
		//int[] ar1 = {1,2,3,4,5,6};
		//int[] ar2 = {60,50,40,30,20,10};
		
		//troca(ar1,ar2);
		
		/*float[][] matriz = {
			{1 , 3, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 },
			{1 , 2, 3 , 4 , 5 }
			
		};
		
		pauta(matriz);
		*/
		
		//atividadeInterface();
	}
}



