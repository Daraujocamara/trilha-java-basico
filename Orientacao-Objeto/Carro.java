public class Carro {
    
    String cor;
    String modelo;
    int capacidadeTanque; 

    //contrutor aqui
    //sobrecarga de contrutor
    Carro (){

    }

    Carro (String cor, String modelo, int capacidadeTanque){
        //colocando valores nos atributos
        this.cor = cor;// this tem relação com o objeto, diferencia o que pertence ao objeto
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    // get e set tanque
    void setCapacidadeTanque (int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque (double valorCombustivel){

        return  valorCombustivel * capacidadeTanque;
    }
     
    //metodos para encher o tanque
}
