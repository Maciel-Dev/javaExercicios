package tarefa01;

public class automovel{

    private boolean isOn;
    private double comprimento;
    private double altura;
    private double peso;
    private double cargaMaxima;
    private int quantPassageiros;
    private int currentPassengers;
    private double litrosGasolina;
    private double velocidade;

    public automovel(boolean b, double comprimento, double altura, double peso, double cargaMaxima, int quantPassageiros, int currentPassangers, double litrosGasolina, double velocidade){
        this.isOn = b;
        this.comprimento = comprimento;        
        this.altura = altura;        
        this.peso = peso;        
        this.cargaMaxima = cargaMaxima;        
        this.quantPassageiros = quantPassageiros;        
        this.currentPassengers = currentPassangers;        
        this.litrosGasolina = litrosGasolina;        
        this.velocidade = velocidade;        
    }

    public double getComprimento(){
        return comprimento;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public double getCargaMaxima(){
        return cargaMaxima;
    }

    public int getQuantPassageiros(){
        return quantPassageiros;
    }

    public int getCurrentPassengers(){
        return currentPassengers;
    }

    public double getLitrosGasolina(){
        return litrosGasolina;
    }

    public double getVelocidade(){
        return velocidade;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public String acelera(double velocidadeNova){
        
        if(getIsOn() == true){

            if(getVelocidade() < velocidadeNova){
                velocidade = velocidadeNova;
                return "Acelerou";
            }
            else{
                velocidade = velocidadeNova;
                return "Freiou";
            }

        }
        else{
            return "Carro desligado";
        }
    }

    public double pesoAtualCarro(){
        return getLitrosGasolina()+(getQuantPassageiros()*80);
    }

    public String alertaPesoMaximo(){
        if(pesoAtualCarro() > getCargaMaxima()){
            return "Carro está acima da capacidade suportada de peso!";
        }
        else{
            return "Carro está estável com seu peso abaixo do limite estabelecido!";
        }
    }

    public double abastecer(){
        
    }

}