package prova1;

public abstract class VeiculoLinha {
    
    private double peso;
    private double largura;
    private double altura;
    private double comprimento;
    private double pesoMaxSuportado; //Soma de vagões

    public VeiculoLinha(double peso, double largura, double altura, double comprimento, double pesoMaxSuportado){
        this.peso = peso; // Soma de peso dos vagões?
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setPesoMaxSuportado(double pesoMaxSuportado){
        this.pesoMaxSuportado = pesoMaxSuportado;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getLargura(){
        return this.largura;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getComprimento(){
        return this.comprimento;
    }

    public double getPesoMaxSuportado(){
        return this.pesoMaxSuportado;
    }

    protected double pesoTotal(){
        return 0;
    };

}
