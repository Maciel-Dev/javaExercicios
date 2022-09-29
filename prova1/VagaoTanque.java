package prova1;

public class VagaoTanque extends VeiculoLinha {
    
    private double pressMaxima;
    private double pesoCarga;

    public VagaoTanque(double peso, double largura, double altura, double comprimento, double pesoMaxSuportado, double pressMaxima, double pesoCarga){
        super(peso, largura, altura, comprimento, pesoMaxSuportado);
        this.pressMaxima = pressMaxima;
        this.pesoCarga = pesoCarga;
    }

    public void setPressMaxima(double pressMaxima){
        this.pressMaxima = pressMaxima;
    }

    public void setPesoCarga(double pesoCarga){
        this.pesoCarga = pesoCarga;
    }

    public double getPressMaxima(){
        return this.pressMaxima;
    }

    public double getPesoCarga(){
        return this.pesoCarga;
    }

    public static VagaoTanque createVagaoTanque(){
        return new VagaoTanque(0,0,0,0,0,0,0);
    }

    @Override
    protected double pesoTotal(){
        return this.pesoCarga + getPeso();
    }
}
