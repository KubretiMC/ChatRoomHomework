package Factory;

import Mediator.ChatRoom;

public class UserFactory {

    public static User createUser(ChatRoom chatRoom, String user, String name) {
        if (user.equals("user")) {
            return new ChatUser(chatRoom, name);
        }
        if (user.equals("bot")) {
            return new Bot(chatRoom, name);
        }
        return null;
    }
}
