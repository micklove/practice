package mlo55;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Created by IntelliJ IDEA.
 * User: micklove
 * Date: 7/04/2015
 * Time: 9:10 PM
 */
public class App {

	public static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		//http://logback.qos.ch/manual/mdc.html
		MDC.put("username", "U377232");

//		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
//		StatusPrinter.print(lc);

		logger.info("Entering application.");

		Foo foo = new Foo();
		foo.doIt();
		MDC.remove("username");

		MDC.put("username", "U345678");
		logger.info("Exiting application.");


	}
}
