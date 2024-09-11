package problem2;

class Logger{
	private static Logger instance = null;
	private StringBuilder logMessages;
	
	private Logger() {
		logMessages =new StringBuilder();//null
		
	}
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger ();
			
		}
		return instance;
	}
	public void log(String message) {  
		logMessages.append(message).append("\n");
		
	}
	public String getLog() {
		return logMessages.toString();
		}
	public void clearLog() {
		logMessages.setLength(0);
	}
}

public class singletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getInstance();
		
		logger.log("first logg");
		logger.log("second logg");
		
		System.out.println("log Messages: ");
		System.out.println(logger.getLog());
		
		logger.clearLog();
		System.out.println("log cleared");
		
		System.out.println("Current log:");
		System.out.println(logger.getLog());
		
	}

}
