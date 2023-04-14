import java.util.Scanner;

import javax.crypto.MacSpi;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;
        

        System.out.println("escreva seu nome: ");
        nome = scan.next();
        //System.out.println("Seu nome é: " + nome);
        System.out.println("escreva seu sobrenome: ");
        sobrenome = scan.next();
        System.out.println("escreva sua idade: ");
        idade = scan.nextInt();

        System.out.println(String.format("Seu nome completo é: %s %s, você tem %d anos", nome, sobrenome, idade));

        if(idade>18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade!");
        }

        
    }
}
