package entities;

public class Moto extends Veiculos{

    private int capacete;

    public Moto(String luxoOuComum, int qntPessoas, String marca, String modelo, int capacete) {
        super(luxoOuComum, qntPessoas, marca, modelo);
        this.capacete = capacete;
    }
    public Moto () {

    }

    public int getCapacete() {
        return capacete;
    }

    public void setCapacete(int capacete) {
        this.capacete = capacete;
    }

    @Override
    public String toString() {
        return  marca + " " + modelo +
                " - Acessorios: Quantidade de capacetes = " + capacete +
                ". \nQuantidade de pessoas suportadas = " + qntPessoas
                ;
    }
}

