package sPOOtify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ScreenMenu screen = new ScreenMenu();
        screen.MenuStart();

        Scanner inputUser = new Scanner(System.in);
        String input = inputUser.nextLine();


        Playlist playlist = new Playlist("Teste");


        while(!input.equalsIgnoreCase("0")){
            screen.RunSpOOtify(input, playlist);
        }

        inputUser.close();
    }

}
    



//