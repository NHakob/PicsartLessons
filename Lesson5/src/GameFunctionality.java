import HeroModels.Hero;
import HeroModels.PlayerHero;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameFunctionality {
    private String cleanUpData(String data) {
        data = data.replace("Hero{","");
        data = data.replace("}","");
        data = data.replace(" ","");
        data = data.replace("name=","");
        data = data.replaceAll("'","");
        data = data.replace("x=","");
        data = data.replace("y=","");
        data = data.replace("hp=","");
        data = data.replace("attack=","");
        data = data.replace("defense=","");
        data = data.replace("level=","");

        return data;
    }

    public void load() {
        File saves = new File(String.valueOf("src\\Saves\\saves.txt"));

        try {
            BufferedReader savesReader = new BufferedReader(new FileReader("src\\Saves\\saves.txt"));
            String data = savesReader.readLine();

            data = cleanUpData(data);
            Hero player1 = new PlayerHero(data.split(",")[2]);
            player1.setX(Integer.valueOf(data.split(",")[0]));
            player1.setY(Integer.valueOf(data.split(",")[1]));
            player1.setHp(Integer.valueOf(data.split(",")[3]));
            player1.setAttack(Integer.valueOf(data.split(",")[4]));
            player1.setDefense(Integer.valueOf(data.split(",")[5]));
            player1.setLevel(Integer.valueOf(data.split(",")[6]));
            data = savesReader.readLine();

            data = cleanUpData(data);
            Hero player2 = new PlayerHero(data.split(",")[2]);
            player2.setX(Integer.valueOf(data.split(",")[0]));
            player2.setY(Integer.valueOf(data.split(",")[1]));
            player2.setHp(Integer.valueOf(data.split(",")[3]));
            player2.setAttack(Integer.valueOf(data.split(",")[4]));
            player2.setDefense(Integer.valueOf(data.split(",")[5]));
            player2.setLevel(Integer.valueOf(data.split(",")[6]));

            play(player1, player2);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. Save file does not exist.");
        } catch (IOException e) {
            System.out.println("Sorry. File is corrupted.");
        }
    }

    private void save(Hero p1, Hero p2) {
        try {
            File saves = new File(String.valueOf("src\\Saves\\saves.txt"));
            saves.createNewFile();
            FileOutputStream writer = new FileOutputStream(String.valueOf(saves), false);

            writer.write((p1.toString() + "\n" + p2.toString()).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
                    save(p1, p2);
                    break;
                default:
                    System.out.println("Please enter option from following list");
                    break;
            }
        } while (true);
    }
}
