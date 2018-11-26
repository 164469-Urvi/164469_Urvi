import java.io.Console;
import java.util.Scanner;
public class Consoles {
	 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	Console consoles=System.console();
	
	if(consoles==null)
		System.out.println("please choose options");
	  System.out.println("A Create a chatroom");
	  System.out.println("B Add User");
	  System.out.println("C User Login");
	  System.out.println("D Send Message");
	  System.out.println("E Display the messages from a specific chatroom");
	  System.out.println("F List down all users belonging to the specified chat room.");
	  System.out.println("G Logout");
	  System.out.println("H Delete an user");
	  System.out.println("I Delete the chat room");
	  System.out.println("Please enter your option:");
	   String a;
	   a=scanner.next();
	  switch(a)
	  {
	  case "A":System.out.println("user created");
	           break;
	  case "B":System.out.println("");
	  }
	}
}
