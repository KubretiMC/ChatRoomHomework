package Factory;

import Mediator.ChatRoom;

public abstract class User {

    protected ChatRoom chatRoom;
    private String name;

    public User(ChatRoom chatRoom, String name) {
        this.chatRoom = chatRoom;
        this.name = name;
    }

    public void send(String message)  {
        System.out.println(this.getName() + " send:  " + message);
        chatRoom.sendMessage(message, this);
    };

    public  void receive(String message) {
        System.out.println(this.getName() + " received:" + message);
    }

    public String getName() {
        return name;
    }

}
