package tarefa01;

public class teste{
    public static void main(String[] args) {
        automovel carro = new automovel(true, 0, 0, 0, 0, 0, 0, 0, 100);

        System.out.println(carro.getVelocidade());
        System.out.println(carro.acelera(20));
        System.out.println(carro.getVelocidade());
        
    }
}