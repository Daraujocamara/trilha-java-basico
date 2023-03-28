import javax.lang.model.util.ElementScanner14;

public class emprestimo {
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresparcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
 
        if(parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final de emprestimo em duas parcelas: R$ " + valorFinal);
        } else if( parcelas == 3){
            double valorFinal = valor + (valor * getTaxaTresparcelas());
            System.out.println("Valor final do emoretimo em três parcelas: R$ " + valorFinal);

        } else {
            System.out.println("Quantidade de parcelas não acietas!");
        }
    }
}
