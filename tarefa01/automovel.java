package tarefa01;

public class Automovel{

    private boolean isOn;
    private double comprimento;
    private double altura;
    private double peso;
    private double cargaMaxima;
    private int maxPassageiros;
    private int quantPassageiros;
    private double litrosGasolina;
    private double maxGasolina;
    private double velocidade;

    public Automovel(boolean isOn, double comprimento, double altura, double peso, double cargaMaxima, int maxPassageiros, int quantPassageiros, double litrosGasolina, double maxGasolina, double velocidade){
        this.isOn = isOn;
        this.comprimento = comprimento;        
        this.altura = altura;        
        this.peso = peso;        
        this.cargaMaxima = cargaMaxima;        
        this.maxPassageiros = maxPassageiros;        
        this.quantPassageiros = quantPassageiros;        
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

    public int getMaxPassageiros(){
        return maxPassageiros;
    }

    public int getQuantPassageiros(){
        return quantPassageiros;
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
            System.out.println("Carro ligado!");
            if(getLitrosGasolina() <= getMaxGasolina()/4){
                System.out.println("Necessário Reabastecer");
            }
            else{
                System.out.println("Não é necessário reabastecer");
            }

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

    public double acelera(double velocidadeNova){
        
        if(getIsOn() == true){

            if(getVelocidade() < velocidadeNova){
                System.out.println("O carro está acelerando!");
                String alertAcelera = String.format("O carro acelerou %.2f km/h", velocidadeNova-getVelocidade());
                System.out.println(alertAcelera);
            }
            else{
                String alertAcelera = String.format("O carro desacelerou %.2f km/h", getVelocidade()-velocidadeNova);
                System.out.println(alertAcelera);
            }
            
            velocidade = velocidadeNova;
            return velocidade;
        }
        else{
            System.out.print("O carro está desligado!");
            return velocidade = 0;
        }

    }

    public double pesoAtualCarro(){
        peso = getLitrosGasolina() + (getQuantPassageiros() * 80);
        if(peso > getCargaMaxima()){
            String alertPeso = String.format("O carro está acima do limite de peso em %.2f kg", getPeso() - getCargaMaxima());
            System.out.println(alertPeso);
        }
        else{
            String alertPeso = String.format("O carro está abaixo do limite de peso em %.2f kg", getCargaMaxima() - getPeso());
            System.out.println(alertPeso);
        }
        return peso;
    }

    public double abastecer(double gasolina){
        double totalGasolina = getLitrosGasolina() + gasolina;
        if(getIsOn() == false){
            if(totalGasolina > getMaxGasolina()){
                System.out.println("A quantidade de gasolina excedeu o máximo permitido"); 
                return getLitrosGasolina();
            }
            else{
                if(gasolina + getQuantPassageiros()*80 > getCargaMaxima()){
                    System.out.println("Carga máxima excedida! Não foi possível abastecer!");
                    return getLitrosGasolina();
                }
                else{
                    gasolina = totalGasolina;
                    String alertGasolina = String.format("Carro abastecido! Agora o carro possui %.2f litros de gasolina!", gasolina);
                    System.out.println(alertGasolina);
                    return getLitrosGasolina() + gasolina; 
                }
            }
        }
        else{
            System.out.println("O carro está ligado! Não foi possível abastecer!");
            return getLitrosGasolina();
        }
    }

    public int desembarque(int quantPessoas){

        if(getVelocidade() == 0){
            if(quantPessoas > getQuantPassageiros()){
                System.out.println("A quantidade de passageiros para desembarque é maior do que a quantidade de passageiros no veículo!");
                return quantPassageiros;
            }
            else{
                quantPassageiros = getQuantPassageiros() - quantPessoas;
                String alertDesembarque = String.format("%d passageiros desembarcaram! O veículo possui %d passageiros!", quantPessoas, quantPassageiros);
                System.out.println(alertDesembarque);
            }
        }
        else{
            System.out.println("O carro está em movimento! Não é possível realizar o desembarque");
        }

        return quantPassageiros;
    }

    public int embarque(int quantPessoas){
        int totalPassageiros = getQuantPassageiros() + quantPessoas;

        if(getVelocidade() == 0){
            if(totalPassageiros > getMaxPassageiros()){
                String alertPassageiros = String.format("Não é possível acomodar %d passageiros no veículo", quantPessoas);
                System.out.println(alertPassageiros);
            }
            else{
                String alertPassageiros = String.format("%d passageiros embarcados no veículo! %d passageiros no veículo!", quantPessoas, totalPassageiros);
                System.out.println(alertPassageiros);
                quantPassageiros = totalPassageiros;
            }
        }
        else{
            System.out.println("O carro encontra-se em movimento!");
        }
        pesoAtualCarro();
        return totalPassageiros;
    }

    public double parar(){
        velocidade = 0;
        System.out.println("Carro está parado!");
        return velocidade;
    }

}