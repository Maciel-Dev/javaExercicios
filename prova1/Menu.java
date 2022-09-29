package prova1;

import java.util.Scanner;

public class Menu {
    public static void showWelcomeMessage(){
        System.out.println("-> Bem vindo ao programa de vagões!\n\n");
    }

    public static void createMessage(){
        System.out.println("-> Estamos criando a sua locomotiva!\n\n");
    }

    public static void loadComplete(){
        System.out.println("-> Locomotiva criada! Apresentando o menu:\n ");
    }

    public static void showMenu(){
        System.out.println("Para Criar um novo vagão: \n#################\nVagão de passageiros - P\nVagão Tanque - T\n#################");
    }

    public static VeiculoLinha createVagaoTanque(){
        Scanner input = new Scanner(System.in);
        System.out.println("Você selecionou o vagão Tanque!\n\n"); //Modificar menu
        VagaoTanque vagaoTanque = VagaoTanque.createVagaoTanque();

        vLPesoMessage();
        Double peso = input.nextDouble();
        vagaoTanque.setPeso(peso);

        vLLarguraMessage();
        Double largura = input.nextDouble();
        vagaoTanque.setLargura(largura);

        vLAlturaMessage();
        Double altura = input.nextDouble();
        vagaoTanque.setAltura(altura);

        vLComprimentoMessage();
        Double comprimento = input.nextDouble();
        vagaoTanque.setComprimento(comprimento);

        vLPesoMessage();
        Double pesoMax = input.nextDouble();
        vagaoTanque.setPesoMaxSuportado(pesoMax);

        vTPresMaxMessage();
        Double pressMax = input.nextDouble();
        vagaoTanque.setPressMaxima(pressMax);

        vTPesoCargaMessage();
        Double pesoCarga = input.nextDouble();
        vagaoTanque.setPesoCarga(pesoCarga);

        input.close();


        return vagaoTanque;
    }

    public static VeiculoLinha createCarroFerroviario(){
        Scanner input = new Scanner(System.in);
        System.out.println("Você selecionou o vagão Tanque!\n\n"); //Modificar menu
        CarroFerroviario carroFerroviario = CarroFerroviario.createCarroFerroviario();

        vLPesoMessage();
        Double peso = input.nextDouble();
        carroFerroviario.setPeso(peso);

        vLLarguraMessage();
        Double largura = input.nextDouble();
        carroFerroviario.setLargura(largura);

        vLAlturaMessage();
        Double altura = input.nextDouble();
        carroFerroviario.setAltura(altura);

        vLComprimentoMessage();
        Double comprimento = input.nextDouble();
        carroFerroviario.setComprimento(comprimento);

        vLPesoMessage();
        Double pesoMax = input.nextDouble();
        carroFerroviario.setPesoMaxSuportado(pesoMax);

        cFQuantPessoasMessage();
        int quantPessoas = input.nextInt();
        carroFerroviario.setQuantPassageiros(quantPessoas);

        input.close();

        return carroFerroviario;
    }


    //Mensagens de Criação
    public static void vLPesoMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void vLLarguraMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void vLAlturaMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void vLComprimentoMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void vLPesoMaxMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void vTPresMaxMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void vTPesoCargaMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }

    public static void cFQuantPessoasMessage(){
        System.out.println("Digite o peso do Vagão: ");
    }


}
