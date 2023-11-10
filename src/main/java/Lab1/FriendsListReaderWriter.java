/*
 * FriendsListReaderWriter class manages the reading and writing of a friends list to a file.
 * It includes methods to add a friend to the list and retrieve the list of friends.
 * The file path is specified by FRIENDS_LIST_FILE constant.
 * Author: Alazar Tilahun
 */

package Lab1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FriendsListReaderWriter {
    private static final String FRIENDS_LIST_FILE = "/home/redu/IdeaProjects/Lab1/src/main/java/Lab1/friends.list";
    
    // Adding a logger for better error handling and debugging
    private static final Logger logger = Logger.getLogger(FriendsListReaderWriter.class.getName());

    public static void addFriend(String friendName) {
        try (FileWriter writer = new FileWriter(FRIENDS_LIST_FILE, true)) {
            writer.write(friendName + "\n");

        } catch (IOException e) {
            // Logging the exception for better debugging
            logger.log(Level.SEVERE, "Error adding friend to the list", e);
        }
    }

    public static List<String> getFriendsList() {
        List<String> friendsList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FRIENDS_LIST_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                friendsList.add(line);
            }
        } catch (IOException e) {
            // Logging the exception for better debugging
            logger.log(Level.SEVERE, "Error reading friends list", e);
            // Rethrowing a runtime exception to indicate the failure
            throw new RuntimeException(e);
        }
        return friendsList;
    }
}
