//exemplo de sobrecarga metodos
public class Quadrilatero {
    public static void arae (double lado){
        System.out.println("Area do quadrado: " + lado * lado);
    }

    public static void arae (double lado1 , double lado2){
        System.out.println("Area do retangulo: " + lado1 * lado2);
    }

    public static void arae (double baseMaior, double baseMenor, double altura){
        System.out.println("Area do triangulo: " + (baseMaior+baseMenor)*altura/2);
    }

    public static void area (double diagonal1, double diagonal2){
        System.out.println("Area do losango: " + (diagonal1*diagonal2/2));

    }
}
