package meth.factory;

public abstract class AbstractLoggerCreator {
	// the factory method
	public abstract CustomLogger createLogger();// the operations that are
												// implemented for all
												// LoggerCreators//like
												// anOperation() in our diagram

	public CustomLogger getLogger() {// depending on the subclass, we'll get a
										// particular logger
		CustomLogger logger = createLogger();
		// could do other operations on the logger here
		return logger;
	}
}
