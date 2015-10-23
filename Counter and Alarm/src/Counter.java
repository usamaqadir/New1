public class Counter {
	
      private int count, base;
      public Counter(int  baseVal)  
      {
    	  base=baseVal;
      }
      public void increment( )  
      {
    	  
    	  count++;
    	  if(count == base)
    	  {
    		  reset();
    	  }
    	  
      }
      public void reset( )  
      {
    	  count=0;
      }
      public int viewCount( ) 
      {
    	  return count;
      }
      
}
