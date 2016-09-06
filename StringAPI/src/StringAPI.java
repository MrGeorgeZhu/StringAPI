import java.util.Calendar;
import java.util.Scanner;

public class StringAPI
	{
		static String name;
		public static void main(String[] args)
			{
				greeting();
				//c1();
				//c2();
				//c3();

			}
		public static void greeting(){
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			String phrase;
			if (hour < 12){
				phrase = "Good morning";
			} else if (hour < 17){
				phrase = "Good afternoon";
			} else {
				phrase = "Good evening";
			}
			Scanner userInput = new Scanner(System.in);
		    System.out.println(phrase + ", what is your name?");
		    name = userInput.nextLine();
		    System.out.println("Hello, " + name + "!");
		}
		public static void c1(){
			Scanner userInput = new Scanner(System.in);
		    System.out.println("How many favorite sweets do you have?");
		    int temp = userInput.nextInt();		    
	    	System.out.println("Could you name all of them?");
	    	String [] list = new String [temp];
	    	Scanner userInput2 = new Scanner(System.in);
	    	for (int i = 0; i < temp; i++){	    		
	    		list[i] = userInput2.nextLine();
	    	}
	    	for (String s: list){
	    		System.out.println(s);
	    	}
		}
		public static void c2(){
			System.out.println("Please enter eight numbers, " + name + "!");
	    	String [] list = new String [8];
	    	Scanner userInput = new Scanner(System.in);
	    	for (int i = 0; i < 8; i++){	    		
	    		list[i] = userInput.nextLine();
	    	}
	    	for (String s: list){
	    		
	    	}
		}
	}
