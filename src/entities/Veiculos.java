package entities;

public class Veiculos {

    protected int qntPessoas;
    protected String marca;
    protected String modelo;

    public Veiculos(String placa, int qntPessoas, String marca, String modelo) {
        this.qntPessoas = qntPessoas;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Veiculos(){

    }

    public int getQntPessoas() {
        return qntPessoas;
    }

    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
