package education;

public class SMSLogServices implements LogServices{

	@Override
	public void log(String logMessage) {
		System.out.println("Sms Loglandý: "+ logMessage);
		
	}

}
