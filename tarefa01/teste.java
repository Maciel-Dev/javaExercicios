package tarefa01;

public class teste{
    public static void main(String[] args) {
        automovel carro = new automovel(true, 0, 0, 0, 0, 10, 5, 80, 100, 0);

        carro.ligar();
        carro.desligar();
        carro.embarque(5);
        
        
    }
}