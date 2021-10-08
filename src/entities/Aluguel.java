package entities;

public class Aluguel {
    private int dia;
    private double custoPdia;

    public Aluguel(int dia, double custoPdia) {
        this.dia = dia;
        this.custoPdia = custoPdia;
    }
    public Aluguel (){

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getCustoPdia() {
        return custoPdia;
    }

    public void setCustoPdia(double custoPdia) {
        this.custoPdia = custoPdia;
    }
    public double calc (){
        return this.dia * this.custoPdia;
    }
}
