package meth.factory;

public class Client {
	private void someMethodThatLogs(AbstractLoggerCreator logCreator) {
		CustomLogger logger = logCreator.createLogger();
		logger.log("message");
	}

	public static void main(String[] args) {
		// for the purposes of this example, create an XMLLoggerCreator
		// directly, //but this would normally be passed to constructor for use.
		AbstractLoggerCreator creator = new XMLLoggerCreator();
		Client client = new Client();
		client.someMethodThatLogs(creator);
	}
}
