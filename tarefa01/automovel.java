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

    public automovel(boolean isOn, double comprimento, double altura, double peso, double cargaMaxima, int quantPassageiros, int currentPassangers, double litrosGasolina, double maxGasolina, double velocidade){
        this.isOn = isOn;
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

    public boolean ligar(){
        if(getIsOn() == false){
            isOn = true;
            System.out.println("Ligando o carro!");
        }
        else{
            System.out.println("O carro já está ligado!");
        }

        return isOn;
    }

    public boolean desligar(){
        if(isOn == true){

            if(getVelocidade() != 0){
                System.out.println("O carro está em movimento! Pare o carro para poder desligá-lo!");
                isOn = true;
            }
            else{
                isOn = false;
                System.out.println("Desligando o carro!");
            }
        }
        else{
            System.out.println("O carro já está desligado!");
        }
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
            return getLitrosGasolina();
        }
        else{
            return getLitrosGasolina() + gasolina; 
        }
    }

    public void alertGasolina(){
        System.out.println("A quantidade de gasolina excedeu o máximo permitido"); 
    }

    public int embarque(int quantPessoas){
        int totalPassageiros = getCurrentPassengers() + quantPessoas;

        if(getIsOn() == false){
            if(totalPassageiros > getQuantPassageiros()){
                String alertPassageiros = String.format("Não é possível acomodar %d passageiros no veículo", quantPessoas);
                System.out.println(alertPassageiros);
                return totalPassageiros;
            }
            else{
                String alertPassageiros = String.format("%d passageiros embarcados no veículo! %d passageiros no veículo!", quantPessoas, totalPassageiros);
                System.out.println(alertPassageiros);
                currentPassengers = totalPassageiros;
            }
        }
        return totalPassageiros;
    }

    public String reabastecer(){
        if(getIsOn() == true){
            if(getLitrosGasolina() <= getMaxGasolina()/4){
                return "Necessário Reabastecer";
            }
            else{
                return "Não é necessário reabastecer";
            }
        }
        else{
            return "O carro está desligado";
        }

    }

    public String parar(){
        velocidade = 0;
        return "Carro está parado!";
    }

}