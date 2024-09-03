package _3_Behavioral_Design_Patterns._4_Mediator_Pattern.Pattern_Code;


public class MediatorApplication {

	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Muthu");
		User user2 = new UserImpl(mediator, "Sanju");
		User user3 = new UserImpl(mediator, "Pinki");
		User user4 = new UserImpl(mediator, "Dooni");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);

		user1.send("Subscribe to RootLabs!!");
	}

}
