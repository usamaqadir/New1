
public class Main {

	public static void main(String[] args) {

	
		Clock obj = new Clock();
		int x=0;
		
		while(x <= 3600)
		{
			x++;
			obj.tick();
			
		}
	
		Alarm_Clock obja = new Alarm_Clock();
		obja.setAlarm(1,7,5);
		
		
		while(x <= 7200)
		{
			x++;
			obja.tick();
			
		}
		
		}
}


