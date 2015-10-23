public class Clock  {
	
      private Counter  hours, mins, secs;
      public Clock( )
      {
    	  
		hours = new Counter(24);
		mins = new Counter(60);
		secs = new Counter(60);
	
      }
      
      public  int viewHr()
      {
    	  return hours.viewCount();
      }
      public  int viewMin()
      {
    	  return mins.viewCount();
      }
      public  int viewSec()
      {
    	  return secs.viewCount();
      }
      
      public void tick( ) 
      {
  	  
    	  System.out.println(hours.viewCount() + ":" +mins.viewCount() + ":" + secs.viewCount());
    	  
		secs.increment( );
		if (secs.viewCount( ) == 0) 
		{	
		       mins.increment( );
		       if((secs.viewCount( )==0) && (mins.viewCount( ) == 0))
			hours.increment( );
		}
      }
}
