class Carro {
    
    String cor;
    String modelo;
    int capacidadeTanque; 

    //contrutor aqui
    //sobrecarga de contrutor
    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        //colocando valores nos atributos
        this.cor = cor;// this tem relação com o objeto, diferencia o que pertence ao objeto
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    } 
    // get e set tanque

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }
    
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
