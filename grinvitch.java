package basics;

import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class grinvitch {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        
		 TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	       
			int hour = new Date().getHours();
			 
			int minute = new Date().getMinutes();
			 
			int second = new Date().getSeconds();
			
            System.out.println(" Enter the time zone offset to GMT: ");
			
			int a = input.nextInt();
			
			hour = hour + a; 
			
			System.out.printf("The current time is : %02d:%02d:%02d\n", hour, minute, second);
		
	}

}
