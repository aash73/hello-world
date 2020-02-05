import org.apache.log4j.Logger;

public class HelloWorld {
	static Logger logger = Logger.getLogger("HelloWorld");
	public static void main(String[] args) {
		logger.debug("Hello World");
	}
}
