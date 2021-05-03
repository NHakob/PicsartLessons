import HeroModels.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Please choose an option");
        Scanner in = new Scanner(System.in);
        GameFunctionality gameFunctionality = new GameFunctionality();
        do {
            System.out.println("1. New Game");
            System.out.println("2. Load Game");
            System.out.println("3. Exit");
            Byte choice = in.nextByte();
            switch (choice) {
                case 1:
                    System.out.println("Please enter name of first player");
                    String firstPlayer = in.next();
                    Hero player1 = new PlayerHero(firstPlayer);
                    System.out.println(player1);
                    System.out.println("Please enter name of second player");
                    String secondPlayer = in.next();
                    Hero player2 = new PlayerHero(secondPlayer);
                    System.out.println(player2);
                    gameFunctionality.play(player1, player2);
                    break;
                case 2:
                    //Add load functionality
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please choose one of following options:");
                    break;
            }
        } while (true);
    }
}
