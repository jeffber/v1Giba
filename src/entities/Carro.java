package entities;

public class Carro extends Veiculos{
    private String aibag;
    private String ar;
    private String portamalas;
    private String abs;
    private double motor;

    public Carro(String luxoOuComum, int qntPessoas, String marca, String modelo, String aibag, String ar, String portamalas, String abs, double motor) {
        super(luxoOuComum, qntPessoas, marca, modelo);
        this.aibag = aibag;
        this.ar = ar;
        this.portamalas = portamalas;
        this.abs = abs;
        this.motor = motor;
    }
    public Carro () {

    }


    public String getAibag() {
        return aibag;
    }

    public void setAibag(String aibag) {
        this.aibag = aibag;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getPortamalas() {
        return portamalas;
    }

    public void setPortamalas(String portamalas) {
        this.portamalas = portamalas;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return  marca + " " + modelo +
                " - Acessorios: Aibag = " + this.aibag +
                ", Ar = " + this.ar +
                ", Abs = " + this.abs +
                ", Portamalas = " + this.portamalas +
                ".\nQuantidade de pessoas suportadas = " + this.qntPessoas
                ;
    }
}
