package Lab1;


import java.util.List;
import java.util.Scanner;

public class ChatApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to ChatApp");
        while (true){
            System.out.println("Select an option:");
            System.out.println("1. Write to Private Chat");
            System.out.println("2. Read Private Chat");
            System.out.println("3. Write to Public Chat");
            System.out.println("4. Read Public Chat");
            System.out.println("5. Add Friend");
            System.out.println("6. View Friends List");
            System.out.println("0. Exit");

            int option=scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.println("Enter your message:");
                    String privateMessage = scanner.nextLine();
                    PrivateChatReaderWriter.writeMessage(privateMessage);
                    break;
                case 2:
                    System.out.println("Private Chat Messages: ");
                    PrivateChatReaderWriter.readMessage();
                    break;
                case 3:
                    System.out.println("Enter your message");
                    String publicMessage=scanner.nextLine();
                    PublicChatReaderWriter.writeMessage(publicMessage);
                    break;
                case 4:
                    System.out.println("Public Chat Messages:");
                    PublicChatReaderWriter.reaMessages();
                    break;
                case 5:
                    System.out.println("Enter friend's name:");
                    String friendName = scanner.nextLine();
                    FriendsListReaderWriter.addFriend(friendName);
                    break;
                case 6:
                    System.out.println("Friends List:");
                    List<String> friendsList = FriendsListReaderWriter.getFriendsList();
                    for (String friend : friendsList) {
                        System.out.println(friend);
                    }
                    break;
                case 0:
                    System.out.println("Exiting ChatApp. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            }
        }

    }




