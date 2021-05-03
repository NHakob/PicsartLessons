import HeroModels.Hero;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameFunctionality {
    public void play(Hero p1, Hero p2) {
        Scanner in = new Scanner(System.in);
        boolean firstPlayerTurn = true;
        do {
            System.out.println((firstPlayerTurn ? p1.getName() : p2.getName()) + " player chose an option");
            System.out.println("1. Walk");
            System.out.println("2. Attack");
            System.out.println("3. Skip turn");
            System.out.println("4. Save game");
            Byte choice = in.nextByte();
            switch (choice) {
                case 1:
                    if (firstPlayerTurn) {
                        p1.walk();
                    } else {
                        p2.walk();
                    }
                    firstPlayerTurn = !firstPlayerTurn;
                    break;
                case 2:
                    if (firstPlayerTurn) {
                        p1.attack(p2);
                        if (p2.getHp() <= 0) {
                            System.out.println(p1.getName() + " Win\nCongrats");
                            try {
                                TimeUnit.SECONDS.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return;
                        }
                        firstPlayerTurn = !firstPlayerTurn;
                    } else {
                        p2.attack(p1);
                        if (p1.getHp() <= 0) {
                            System.out.println(p1.getName() + " Win\nCongrats");
                            try {
                                TimeUnit.SECONDS.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return;
                        }
                        firstPlayerTurn = !firstPlayerTurn;
                    }
                    break;
                case 3:
                    firstPlayerTurn = !firstPlayerTurn;
                    break;
                case 4:
                    try {
                        File saves = new File(String.valueOf("src\\Saves\\saves.txt"));
                        saves.createNewFile();
                        FileOutputStream writer = new FileOutputStream(String.valueOf(saves), false);

                        writer.write((p1.toString() + "\n" + p2.toString()).getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Please enter option from following list");
                    break;
            }
        } while (true);
    }
}
