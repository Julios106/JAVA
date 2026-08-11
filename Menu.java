import java.util.Scanner;
public class Menu{
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  String matricula[] = new String[2];
  String marca[] = new String[2];
  String modelo[] = new String[2];
  int quil[] = new int[2];
  int ano[] = new int[2];
  int opc;
    do{
    System.out.println("-------Menu------");
    System.out.println("1- Cadastrar Veiculo");
    System.out.println("2-Listar");
    System.out.println("3-Geracao dos veiculos");
    System.out.println("4-Sair");
    System.out.println("Escolha a opcao: ");
    opc = s.nextInt();
	s.nextLine();
  
     switch(opc){
	  case 1:
	   for(int i=0; i<2;i++){
	   System.out.print("Digite a Matricula:");
	   matricula[i] = s.nextLine();
	   System.out.print("Marca: ");
	   marca[i] = s.nextLine();
	   System.out.print("Modelo: ");
	   modelo[i] = s.nextLine();
	   System.out.print("Quilometragem: ");
       quil[i] = s.nextInt();
	   System.out.print("Ano: ");
	   ano[i] = s.nextInt();
	   s.nextLine();
	   System.out.println();
	   }
	    break;
	   case 2:
	    for(int i=0;i<2;i++){
		 System.out.println("Matricula: "+matricula[i]);
		 System.out.println("Marca: "+marca[i]);
		 System.out.println("Modelo: "+modelo[i]);
         System.out.println("Quilometragem: "+quil[i]);
         System.out.println("Ano:"+ano[i]);
		 System.out.println();
		}
		 break;
       case 3:
		 for(int i=0;i<2;i++){
		  if(ano[i] <= 2000){
          System.out.println("Modelo Antigo");
          System.out.println("Matricula: "+matricula[i]);
		  System.out.println("Marca: "+marca[i]);
		  System.out.println("Modelo: "+modelo[i]);
          System.out.println("Quilometragem: "+quil[i]);
          System.out.println("Ano:"+ano[i]); 
	      System.out.println();
		  }else{
          System.out.println("Modelo Recente");
		  System.out.println("Matricula: "+matricula[i]);
		  System.out.println("Marca: "+marca[i]);
		  System.out.println("Modelo: "+modelo[i]);
          System.out.println("Quilometragem: "+quil[i]);
          System.out.println("Ano:"+ano[i]); 
	      System.out.println(); 
		  }
		 }
		 break;
		case 4:
		 System.out.println("Encerrando...");
		 break;
		default:
		 System.out.println("Opcao invalida");
	   } 
    }while(opc != 4);
  }
}  