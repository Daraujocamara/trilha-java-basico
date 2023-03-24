import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];//criando o array
        int quantidadeDeConsoantes = 0; //contador para identificar consoantes

        int count = 0;

        do{

            System.out.println("Letra: ");// pedindo ao usuario a letra
            String letra= scan.next();//gardando na variavel letra
            //comparamos a letra digitada para saber se são iguais as vogais que não queremos 
            if( !(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u")) ) {
            //começamos a contagem para encontrar consoantes, dentro do array
            consoantes[count] = letra;
            //se acharmos iremos adicionar a variavel de quantidade de consoantes
            quantidadeDeConsoantes++;
        }            

        count++;

        }while(count < consoantes.length);
        //aqui criamos a variavel consoante para mostras os dados salvos dentro do array consoantes
        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)//para não mostrar o resultado null abaixo
                System.out.print (consoante + " ");//na impressao aparece as vogais como null pq o array sempre sera preenchido com algo
            
        }

        System.out.println("\nQuantidad de consoantes: " + quantidadeDeConsoantes);

    }
    
}
