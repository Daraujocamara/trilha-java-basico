public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio retorno:");

        //retorno
        //criamos variaveis para armazenar os valores
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Area do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3, 3);
        System.out.println("Area do Retangulo: " + areaRetangulo);

        double areaTriangulo = Quadrilatero.area(4, 5, 2);
        System.out.println("Area do Triangulo: " + areaTriangulo);
    }   
}
