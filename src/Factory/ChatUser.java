package Factory;

import Mediator.ChatRoom;

public class ChatUser extends User {

    public ChatUser(ChatRoom chatRoom, String name) {
        super(chatRoom, name);
        chatRoom.addUser(this);
    }
}
