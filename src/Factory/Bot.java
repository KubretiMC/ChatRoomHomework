package Factory;

import Mediator.ChatRoom;

public class Bot extends User {

    public Bot(ChatRoom chatRoom, String name) {
        super(chatRoom, name);
        chatRoom.addUser(this);
    }

}
