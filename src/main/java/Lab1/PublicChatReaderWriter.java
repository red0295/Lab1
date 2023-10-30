package Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PublicChatReaderWriter {
    private static final String PUBLIC_CHAT_FILE="/home/redu/IdeaProjects/Lab1/src/main/java/Lab1/Eurakarte.log";

    public static void writeMessage(String message){
        try(FileWriter writer=new FileWriter(PUBLIC_CHAT_FILE,true)){
            writer.write(message+"\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public  static  void reaMessages(){
        try(BufferedReader reader=new BufferedReader(new FileReader(PUBLIC_CHAT_FILE))){
            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
