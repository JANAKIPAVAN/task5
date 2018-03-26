
public class TestException {
	
   static void currentbalance(int limit)throws LowLimit{  
	     if(limit<500){ 
	      throw new LowLimit("minimun balance should be 500");  
	     }else  
	      System.out.println("welcome to Account");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      currentbalance(420);  
	      }catch(Exception m){
	    	  System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  
