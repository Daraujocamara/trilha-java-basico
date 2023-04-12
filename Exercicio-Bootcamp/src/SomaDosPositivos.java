import java.util.Scanner;

public class SomaDosPositivos {

    public static void main(String[] args) {
      System.out.println("Iniciando médias: ");//pedindo os valores a serem ditados
      Scanner leitor = new Scanner(System.in);//recebendo entrada do teclado
      //variaveis para armazenar a quantidade de positivo e o total da soma dos positivos
      int contPositivo = 0;
      double totalValores = 0;

        for(double i=0; i<6; i++){//criando a repetição 
          double valor = leitor.nextDouble();//guardando o que  foi digitado
          if(valor>0){//se o valor digitado for maior que 0 sera contabilizado como positivo
            contPositivo++;//armazenando os positivos 
            totalValores = totalValores + valor;// somamos os positivos 
          }
        }

        double media = totalValores / contPositivo;//media da soma dos valores positivos pela quantidade de valores positivos 
        System.out.println(String.format("Quantidade de numeros positivos: %d", contPositivo));//mostra a quantidade de positivos 
        System.out.println(String.format("Média de valores digitados: %.1f", media));//mostra a media alcançada

       }
}