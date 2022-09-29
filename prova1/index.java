package prova1;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        //Criação do comboio
        // Mensagem de apresentação
        Menu.showWelcomeMessage(); 
        Menu.createMessage();
         //Cria locomotiva com valores zerados
         //Utilizar set durante o processo
        Locomotiva locomo = Locomotiva.createLocomotiva();
        Menu.loadComplete();
        Menu.showMenu();
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        
        while(!choice.equalsIgnoreCase("@")){
            if(choice.equalsIgnoreCase("T")){
                Menu.createVagaoTanque();
            }
            Menu.showMenu();
            

            choice = input.nextLine();

        }

        



    }
}
