import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;

public class main {
    public static void main(String[] args) {
        //calculadora
        System.out.println("Exercicio calculadora:");
        calculadora.soma(3, 6);
        calculadora.subtracao(8, 1.8);
        calculadora.multiplicação(7, 8);
        calculadora.divisao(5, 2.5);
   
        System.out.println("Exercicio mensagem:");
        mansagem.obterMensagem(12);
        mansagem.obterMensagem(14);
        mansagem.obterMensagem(19);


        //empretimo
        System.out.println("Exercicio empretimo:");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

    }
        
}
