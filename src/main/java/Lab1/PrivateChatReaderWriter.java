/*
 * PrivateChatReaderWriter class manages the reading and writing of private chat messages to a file.
 * It includes methods to write a message to the file and read messages from the file.
 * The file path is specified by PRIVATE_CHAT_FILE constant.
 * Author: Alazar Tilahun
 */

package Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrivateChatReaderWriter {
    private static final String PRIVATE_CHAT_FILE = "/home/redu/IdeaProjects/Lab1/src/main/java/Lab1/Donut[AFK].log";

    public static void writeMessage(String message) {
        try (FileWriter writer = new FileWriter(PRIVATE_CHAT_FILE, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readMessage() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PRIVATE_CHAT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
