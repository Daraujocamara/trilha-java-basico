import java.util.Random;

public class Ex4_ArraysMultiDimensionais {
    public static void main(String[] args) {
        Random random = new Random(); // classe que gera numeros aleatorios

        int [] [] M = new int [4] [4];//criando a matriz
        
        //para :variavel i=0 ate o i menor que tamanho da matriz(array multidimencional), acresentando 1
        for(int i=0; i<M.length; i++){//navegando na matriz
            //para a variavel j =0, ate o i menor que tamnho da linha, acresentando mais 1
            for(int j=0; j< M[i].length; j++){//navegando na linha (array unidimencional)
                M[i][j] = random.nextInt(9);//atribuindo numero aleatorio a posição do elemento
                }

            }


            System.out.println("Matriz: ");
            for (int[] linha : M) {
                for (int coluna : linha) {
                    System.out.print(coluna + " ");
                    
                }
                System.out.println();
                
            }

        }
    
    
}
