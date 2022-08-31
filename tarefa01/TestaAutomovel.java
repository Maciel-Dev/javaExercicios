package tarefa01;

import java.util.Scanner;

public class TestaAutomovel{
    public static void main(String[] args) {

        Scanner inputUsuario = new Scanner(System.in);
        System.out.println("1 - Exemplo\n2 - Teste Usuário\n");
        String input = inputUsuario.next();
        if(input.equalsIgnoreCase("1")){
            System.out.println("Iniciando teste automático\n\n");

            Automovel volvoXC60 = new Automovel(false, 4.7, 1.651, 2174, 585, 5, 1, 20, 70, 0);
            //Ligar Carro e Reabastecimento
            System.out.println("Teste 1: (Ligar Carro e Reabastecimento)\n");
            volvoXC60.ligar();
            System.out.print("\n");

            //Acelerar
            System.out.println("Teste 2: (Acelerar Carro)\n");
            volvoXC60.acelera(20);
            System.out.print("\n");

            //Desacelerar
            System.out.println("Teste 3: (Acelerar Carro)\n");
            volvoXC60.acelera(10);
            System.out.print("\n");

            //Embarcar - Sem sucesso
            System.out.println("Teste 4: (Embarcar - Sem sucesso)\n");
            volvoXC60.embarque(4);
            System.out.print("\n");

            //Parar, Embarcar e Peso total - Com sucesso
            volvoXC60.parar();
            System.out.println("Teste 5: (Parar, Embarcar e Peso total - Com sucesso)\n");
            volvoXC60.embarque(4);
            System.out.print("\n");

            //Desembarque - Sem sucesso
            System.out.println("Teste 6: (Desembarque - Sem sucesso)\n");
            volvoXC60.acelera(80);
            volvoXC60.desembarque(4);
            System.out.print("\n");

            //Desembarque - Com sucesso
            System.out.println("Teste 7: (Desembarque - Com sucesso)\n");
            volvoXC60.parar();
            volvoXC60.desembarque(4);
            System.out.print("\n");

            //Abastecer - Sem sucesso
            System.out.println("Teste 8: (Abastecer - Sem sucesso)\n");
            volvoXC60.acelera(80);
            volvoXC60.abastecer(20);
            System.out.print("\n");

            //Abastecer - Sem sucesso - Excedente
            System.out.println("Teste 9: (Abastecer - Sem sucesso - Excedente)\n");
            volvoXC60.parar();
            volvoXC60.desligar();
            volvoXC60.abastecer(10000);
            System.out.print("\n");

            //Abastecer - Com sucesso 
            System.out.println("Teste 10: (Abastecer - Com sucesso)\n");
            volvoXC60.abastecer(50);
            System.out.print("\n");

            //Desligar Carro
            System.out.println("Teste 11: (Desligar carro)\n");
            volvoXC60.ligar();
            volvoXC60.acelera(80);
            volvoXC60.parar();
            volvoXC60.desligar();
            System.out.print("\n");

            
        }
        else if(input.equalsIgnoreCase("2")){
            System.out.println("Digite as informações do Automóvel: ");
            System.out.println("Digite o comprimento em metros do automóvel: ");
            double comprimento = inputUsuario.nextDouble();
            System.out.println("Digite a altura em metros do automóvel: ");
            double altura = inputUsuario.nextDouble();
            System.out.println("Digite o peso em kg do automóvel: ");
            double peso = inputUsuario.nextDouble();
            System.out.println("Digite a carga máxima em kg do automóvel: ");
            double cargaMaxima = inputUsuario.nextDouble();
            System.out.println("Digite a quantidade máxima de passageiros do automóvel: ");
            int quantMaxPassageiros = inputUsuario.nextInt();
            System.out.println("Digite a quantidade de passageiros no automóvel: ");
            int quantPassageiros = inputUsuario.nextInt();
            System.out.println("Digite a quantidade em litros de gasolina no automóvel: ");
            double quantGasolina = inputUsuario.nextDouble();
            System.out.print("Digite a quantidade máxima em litros de gasolina no automóvel: ");
            double quantMaxGasolina = inputUsuario.nextDouble();
            

            Automovel carro = new Automovel(false, comprimento, altura, peso, cargaMaxima, quantMaxPassageiros, quantPassageiros, quantGasolina, quantMaxGasolina, 0);
            
            
            System.out.println("Menu do Automóvel: ");
            System.out.println("********************* ");
            System.out.println("1 - Ligar o Automóvel!\n2 - Desligar o Automóvel!\n3 - Acelerar o Automóvel\n4 - Peso Atual do Carro\n5 - Abastecer\n6 - Desembarcar\n7 - Quantidade de Gasolina\n8 - Parar o carro\n0 - Sair\n");
            System.out.println("********************* ");

            System.out.println("Digite o número da ação: ");
            String acao = inputUsuario.next();

            
            while(!acao.equalsIgnoreCase("0")){
                if(acao.equalsIgnoreCase("1")){
                    carro.ligar();
                }
                else if(acao.equalsIgnoreCase("2")){
                    carro.desligar();
                }
                else if(acao.equalsIgnoreCase("3")){ 
                    System.out.println("Digite a velocidade do carro: ");
                    double velocidadeNova = inputUsuario.nextDouble();
                    carro.acelera(velocidadeNova);
                }
                else if(acao.equalsIgnoreCase("4")){
                    carro.pesoAtualCarro();
                }
                else if(acao.equalsIgnoreCase("5")){
                    System.out.println("Digite a quantidade de gasolina a ser abastecida: ");
                    double gasolina = inputUsuario.nextDouble();
                    carro.abastecer(gasolina);
                }
                else if(acao.equalsIgnoreCase("6")){
                    System.out.println("Digite a quantidade de pessoas para desembarcar: ");
                    int quantPessoas = inputUsuario.nextInt();
                    carro.desembarque(quantPessoas);
                }
                else if(acao.equalsIgnoreCase("7")){
                    System.out.println("Digite a quantidade de pessoas para embarcar: ");
                    int quantPessoas = inputUsuario.nextInt();
                    carro.embarque(quantPessoas);
                }
                else if(acao.equalsIgnoreCase("8")){
                    carro.parar();
                }
                else{
                    System.out.println("Não foi possível compreender a ação!");
                }
                
                
                System.out.println("Digite o número da ação: ");
                String acaoUsuario = inputUsuario.next();
                acao = acaoUsuario;

            }
        }

            inputUsuario.close();
    }
        
}
