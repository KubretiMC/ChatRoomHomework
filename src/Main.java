import Factory.User;
import Factory.UserFactory;
import Mediator.ChatRoom;

public class Main {

    public static void main(String[] args) {

        ChatRoom room = new ChatRoom();

        User user1 = UserFactory.createUser(room, "user", "Ivan");
        User user2 = UserFactory.createUser(room, "user", "Angel");
        User user3 = UserFactory.createUser(room, "user", "Miro");

        user1.send("What is your favourite animal?");
        user3.send("addBot");
        user2.send("cat");
    }
}
