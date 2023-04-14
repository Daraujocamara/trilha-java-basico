import java.util.Scanner;

public class SomaDasNotas {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int cont = 1;
    int valor;

    System.out.print("Até quando devo contar? ");
    valor = leitor.nextInt();

    //System.out.println("O limite definido foi: " + valor);

    while (cont <= valor){
      System.out.println(cont); 
      cont++;
     
      
    }
    

  }
}
