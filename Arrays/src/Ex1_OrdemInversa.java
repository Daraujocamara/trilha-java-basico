public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        
        int [] vetor=  {-5, -6, 15, 50, 8, 4};
        
        System.out.print("Vetor: ");
        int count =0; //criamos um contador para rodar no array

        while(count < (vetor.length)){//aqui falamos que deve ir somente ate a posicao 5 pois a posicao 6 nao exite
            System.out.print(vetor[count] + " ");//pedimos para mostrar o vetor na posicao do contador
            count++;
        }
        System.out.print("\nVetor: ");
        for(int i=vetor.length-1; i >=0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
    
}
