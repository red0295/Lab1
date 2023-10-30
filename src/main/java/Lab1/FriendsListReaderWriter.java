package Lab1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FriendsListReaderWriter {
    private static final String FRIENDS_LIST_FILE="/home/redu/IdeaProjects/Lab1/src/main/java/Lab1/friends.list";
    public static void addFriend(String friendName){
        try(FileWriter writer = new FileWriter(FRIENDS_LIST_FILE, true)) {
            writer.write(friendName+"\n");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static List<String> getFriendsList(){
        List<String> friendsList=new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(FRIENDS_LIST_FILE))){
            String line;
             while ((line=reader.readLine())!=null){
                 friendsList.add(line);
             }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
        return friendsList;

    }}


