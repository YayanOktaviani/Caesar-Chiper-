package tugas;

import tugas.modul;
import java.io.*;
import java.util.Scanner;

/**
 * Created by bobko on 28.06.2016.
 */
public class Tugas {

    private final static String COMMAND_READ_MESSAGE = "read";
    private final static String COMMAND_WRITE_MESSAGE = "write";
    private final static String COMMAND_EXIT = "exit";
    private final static String FILE_PATH = "message.txt";
    private static Object CaesarChiper;

    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);
        String command = "";

        while (!command.equals(COMMAND_EXIT)){
            System.out.println("Enter command: (read, write, exit)");
            command = scanner.nextLine();
            if (command.equals(COMMAND_READ_MESSAGE)){
                System.out.println("Enter chiper:");
                int chiper = scanner.nextInt();
                StringBuilder messageBuilder = new StringBuilder();
                try (FileReader reader = new FileReader(FILE_PATH)){
                    BufferedReader buffer = new BufferedReader(reader);
                    String s;
                    while ((s = buffer.readLine()) != null){
                        messageBuilder.append(s);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(modul.decryption(messageBuilder.toString(), chiper));

            }else if (command.equals(COMMAND_WRITE_MESSAGE)){
                System.out.println("Enter message:");
                String message = scanner.nextLine();
                System.out.println("Enter chiper:");
                int chiper = scanner.nextInt();
                try (FileWriter writer = new FileWriter(FILE_PATH)){
                    writer.write(modul.encryption(message, chiper));
                    writer.flush();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        }}}

    

