package education;

public class DatabaseLogService implements LogServices{

	@Override
	public void log(String logMessage) {
		System.out.println("Database Loglandý."+ logMessage);
		
	}
	
	
	

}
