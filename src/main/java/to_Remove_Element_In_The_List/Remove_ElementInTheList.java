/*
 *Author Name:Praveen Kumar
 *Date: 11-Sep-22
 *Created With IntelliJ Idea Community Edition
 */


package to_Remove_Element_In_The_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_ElementInTheList {
    public void removeMethodInList() {
        //Creating an array list with String Datatype
        ArrayList<String> list = new ArrayList<>();
        //Scanner class to get input from the user
        Scanner scanner = new Scanner(System.in);
        //get input name
        String name = scanner.next();
        //get age
        int age = scanner.nextInt();
        //get gender
        String gender = scanner.next();
        //get eligible to vote True / False
        boolean isEligibleToVote = scanner.nextBoolean();
        //adding elements to the list
        System.out.println("List before deleting the element");
        System.out.println("[" + name + " " + age + " " + gender + " " + isEligibleToVote + "]");
        list.add(name);
        list.add(String.valueOf(age));
        list.add(String.valueOf(gender));
        list.add(String.valueOf(isEligibleToVote));
        list.remove(String.valueOf(isEligibleToVote));
        //Print statement to print the List
        System.out.println("List After Deleting the element");
        System.out.println(list);
    }

}