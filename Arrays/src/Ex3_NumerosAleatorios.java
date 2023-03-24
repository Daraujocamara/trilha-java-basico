import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();//calsse que gera numeros aleatorios

        int [] numerosAleatorio = new int [20]; // criando o array

        for(int i=0; i < numerosAleatorio.length; i++){
            //criamos a variavel numero para armazenar o que sai do for e o bound é o limite, ira ate 100
            int numero = random.nextInt(100);
            numerosAleatorio[i] = numero;
        }

        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorio) {
            System.out.print(numero + " ");
            
        }

        System.out.print("\nSucessor dos numeros Aleatorios: ");
        for (int numero : numerosAleatorio) {
            System.out.print((numero+1) + " ");
            
        }

    }
}
