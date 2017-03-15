import java.io.*;
import java.util.Scanner;

public class AddressBook {

       private Contact[] friends; // An array of Contacts - each stores info for one friend
       private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
	public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }
	public int numContacts(){
		return Contacts.length
	}
	public int haveContact(String s){
		return getName(s);
	}
	public int deleteContact(String s){
		int pos = haveContact(s);
		friends[pos] = friends[friends.length-1];
		numfriends -1;
		return haveContact(s);
		
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String choice = s.next();
		System.out.println(menu())
		if(choice == "add"){
			System.out.println("What would you like to add? ");
			String added = s.next();
			addContact(added);
		}
		if(choice == "delete"){
			System.out.println("What would you like to add? ");
			String deleted = s.next();
			deleteContact(deleted);
		if(choice = "print"){
			System.out.println(friends)
		}
			
		}
	}
