package prova1;

public class CarroFerroviario extends VeiculoLinha {
    
    private int quantPassageiros;

    public CarroFerroviario(double peso, double largura, double altura, double comprimento, double pesoMaxSuportado, int quantPassageiros) {
        super(peso, largura, altura, comprimento, pesoMaxSuportado);
        this.quantPassageiros = quantPassageiros;
    }

    public void setQuantPassageiros(int quantPassageiros){
        this.quantPassageiros = quantPassageiros;
    }

    public int getQuantPassageiros(){
        return this.quantPassageiros;
    }

    public static CarroFerroviario createCarroFerroviario(){
        return new CarroFerroviario(0,0,0,0,0,0);
    }

    @Override
    protected double pesoTotal(){
        return (getQuantPassageiros() * 80) + getPeso();
    }

}
