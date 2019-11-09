package br.com.lael.promiseproject.samples;
/*
        Conceito de herança
 */
public class Carro extends Veiculo {

    Integer portas;
    Integer bancos;

    public Carro(Veiculo veiculo) {
        buzina();
       if(veiculo instanceof Carro) {
           System.out.println();
       }
    }

    // Sobrescrita de métodos
    @Override
    public void buzina() {
        System.out.println("Fom fom");
    }
}
