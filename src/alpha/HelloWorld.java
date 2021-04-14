package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	private static final Logger logger = LogManager.getLogger("HelloWorld");
	public static void main(String[] args) {
		logger.info("Hello World");
		logger.trace("Entering Application");
		Bar bar = new Bar();
		if(!bar.doIt())
		{
			logger.error("Didn't do it");
		}
		else
		{
			logger.trace("Exiting Application");
		}
	}

}
