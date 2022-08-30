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
    private double maxGasolina;
    private double velocidade;

    public automovel(boolean b, double comprimento, double altura, double peso, double cargaMaxima, int quantPassageiros, int currentPassangers, double litrosGasolina, double maxGasolina, double velocidade){
        this.isOn = b;
        this.comprimento = comprimento;        
        this.altura = altura;        
        this.peso = peso;        
        this.cargaMaxima = cargaMaxima;        
        this.quantPassageiros = quantPassageiros;        
        this.currentPassengers = currentPassangers;        
        this.litrosGasolina = litrosGasolina;
        this.maxGasolina = maxGasolina;        
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

    public double getMaxGasolina(){
        return maxGasolina;
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

    public double abastecer(double gasolina){
        double totalGasolina = getLitrosGasolina() + gasolina;
        if(totalGasolina > getMaxGasolina()){
            alertGasolina();
        }
        else{ //Incrementar junção com peso atual do carro

        }

        return getLitrosGasolina() + gasolina;
    }

    public void alertGasolina(){
        System.out.println("A quantidade de gasolina excedeu o máximo permitido");
    }

    public int embarque(int quantPessoas){
        int totalPassageiros = getCurrentPassengers() + quantPessoas;
        if(totalPassageiros > getQuantPassageiros()){
            return totalPassageiros;
        }
        else{
            currentPassengers = totalPassageiros;
        }
        return totalPassageiros;
    }

    public double reabastecer(){

        if(getLitrosGasolina() < getMaxGasolina()/4){
            //Finalizar função para checagem
            //Provavelmente string ()?
        }

        return 0;
    }

}