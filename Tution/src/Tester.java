interface Event {
   public void start();
}
interface Sports {
   public void play();
}

public class Tester implements Event,Sports{
	
	 public void start()
	  {
		  System.out.println("Hello");
		  
	  }
	 
	 public void play() {
		 
		 System.out.println("playing");
		 
	 }
	
	
   public static void main(String[] args){
	   
	   
	   Tester tester =new Tester();
	   tester.start();
	   tester.play();
	   
	 
   }
}