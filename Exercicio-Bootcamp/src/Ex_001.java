import java.util.Scanner;

public class Ex_001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador =1;
        int valor =0;
        int soma =0;
        int maior =0;
        int n;


        System.out.print("quantos numeros quer digitar: ");
        n=leitor.nextInt();

        while(contador <=n){
            System.out.println("escreva um numero: ");
            valor = leitor.nextInt();          
            contador++;
            if (valor > maior){
                maior= valor;
            }
            soma = soma + valor;         
            
        }
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A soma dos numeros digitados é: "+ soma);
    }
}
