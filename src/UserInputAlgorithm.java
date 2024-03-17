import java.util.LinkedList;
import java.util.Scanner;

public class UserInputAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<String> names = new LinkedList<String>();

        System.out.println("Enter Name (type 'done' to stop) :- ");

        while (true){

            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done")){

                break;

            }

            names.add(name);

        }

        System.out.println("Enter a name to search :- ");

        String searchName = scanner.nextLine();

        if (names.contains(searchName)){

            System.out.println(searchName + " is in the Array List!");

        }else{

            System.out.println(searchName + " is not in the Array List!");
        }

        System.out.println("Enter a name to remove :- ");

        String removeName = scanner.nextLine();

        if(names.remove(removeName)){

            System.out.println(removeName + " has been removed from the Array List!");

        }else{

            System.out.println(removeName + " is not in the Array List!");

        }

        System.out.println("Names after removal :- ");
        for(String name : names){

            System.out.println(name);

        }

        scanner.close();


    }

}
