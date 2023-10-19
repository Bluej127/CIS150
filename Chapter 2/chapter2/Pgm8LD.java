package chapter2;
/*
 * Class: CIS150-E-Computer Science I
 * Instructor: Jeffery Thompson
 * Description: Timezones and clocks
 * Due: 10/06/2023
 * I pledge by honor that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 *
 * Lennart Doiron
 */
import java.lang.*;

public class Pgm8LD {

	public static void main(String[] args) {
		
	    // Obtain current time in milliseconds (GMT)
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds
	    // totalSeconds = totalMilliseconds / 1000;

	    // Calculate total seconds
	    // currentSecond = totalSeconds % 60;

	    // Calculate total minutes
	    // totalMinutes = totalSeconds / 60;

	    // Calculate current minute in the hour
	    // currentMinute = totalMinutes % 60;

	    // Calculate total hours
	    // totalHours = totalMinutes / 60;

	    // Calculate current hour
	    // currentHour = totalHours % 24;
		
	    
	    long timeNewYork = totalMilliseconds - 14400000;
	    
		long totalSeconds = timeNewYork / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
	    // Current time in EST (New York)     GMT - 4 Hrs 
	    System.out.println("Current time in New York is " + currentHour + ":"
	      + currentMinute + ":" + currentSecond + " EST");
		
	    long timeBerlin = totalMilliseconds + 7200000;
	    
		totalSeconds = timeBerlin / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
	    //Current time in CEST (Berlin)       GMT + 2 Hrs
	    System.out.println("Current time in Berlin is " + currentHour + ":"
	  	      + currentMinute + ":" + currentSecond + " CEST");
	    
	    long timeLondon = totalMilliseconds + 3600000;
	    
		totalSeconds = timeLondon / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
	    //Current time in BST (London)        GMT + 1 Hr
	    System.out.println("Current time in London is " + currentHour + ":"
	  	      + currentMinute + ":" + currentSecond + " BST");
		
	    long timeChicago = totalMilliseconds - 18000000;
	    
		totalSeconds = timeChicago / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
	    //Current time in CDT (Chicago)       GMT - 5 Hrs
	    System.out.println("Current time in Chicago is " + currentHour + ":"
	  	      + currentMinute + ":" + currentSecond + " CDT");
		
	    long timeSanFrancisco = totalMilliseconds - 25200000;
	    
		totalSeconds = timeSanFrancisco / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
	    //Current time in PDT (San Francisco) GMT - 7 Hrs
	    System.out.println("Current time in San Francisco is " + currentHour + ":"
	  	      + currentMinute + ":" + currentSecond + " PDT");
		
	    long timeTokyo = totalMilliseconds + 32400000;
	    
		totalSeconds = timeTokyo / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
	    //Current time in JST (Tokyo)         GMT + 9 Hrs
	    System.out.println("Current time in Tokyo is " + currentHour + ":"
	  	      + currentMinute + ":" + currentSecond + " JST");
		
	    long timeHongKong = totalMilliseconds + 28800000;
	    
		totalSeconds = timeHongKong / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
	    //Current time in HKT (Hong Kong)     GMT + 8 Hrs
	    System.out.println("Current time in Hong Kong is " + currentHour + ":"
	  	      + currentMinute + ":" + currentSecond + " HKT");
	    
	}

}
