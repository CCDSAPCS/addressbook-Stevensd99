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
        return numfriends;
    }
    public int haveContact(String s){
        for(int in= 0; i<numfirends;i++){
            if (friends[i].getName().equals(s)){
                return i;
            }
            return -1;
    }
    }
    public int deleteContact(String s){
        int pos = haveContact(s);
        friends[pos] = friends[friends.length-1];
   
       numfriends --;
        return haveContact(s);
        
     }
    public void printContacts(){
        for(int i = 0; i<numfriends; i++){
            System.out.println(friends[i]);
        }
    }
    public void addContact(Contact c){
        friends[numfriends] = c;
        numfriends ++;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String choice = s.next();
        Adressbook myBook = new Adressbook();
        System.out.println(menu());
        if(choice == "add"){
            System.out.println("What would you like to add? ");
            String added = s.next();
            myBook.addContact(added);
        }
        if(choice == "delete"){
            System.out.println("What would you like to add? ");
            String deleted = s.next();
            myBook.deleteContact(deleted);
        }
        if(choice = "print"){
            myBook.printContacts();
        }
        if(choice == "number of friends"){
            myBook.numContacts();
        }
        }
    }
