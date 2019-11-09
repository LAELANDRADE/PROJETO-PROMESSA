package br.com.lael.promiseproject.samples;

public class Veiculo {

    String tipo;
    String placa;
    String marca;
    Integer rodas;

    public void buzina(){
        System.out.println("Bip-bip");
    }

    public void queTipoEuSou(){
        if(this instanceof Carro){
            // Conceito de polimorfismo
            ((Carro) this).bancos = 4; // Cast
        }
    }

}