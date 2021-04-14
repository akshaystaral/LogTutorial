package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog {

	private static final Logger logger = LogManager.getLogger(DemoLog.class.getName());

	public static void main(String[] args) {

		logger.debug("System Debug");
		if (5 > 4)
			logger.info("Object is Present");
		logger.error("Object is not present");
		logger.fatal("This is fatal");
	}
}
