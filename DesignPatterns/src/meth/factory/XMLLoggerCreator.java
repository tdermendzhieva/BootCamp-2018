package meth.factory;

public class XMLLoggerCreator extends AbstractLoggerCreator {
	@Override
	public CustomLogger createLogger() {
		XMLLogger logger = new XMLLogger();
		return logger;
	}
}
