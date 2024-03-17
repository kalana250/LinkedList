import java.util.LinkedList;
import java.util.Scanner;

public class UserNumberInputAlgorithms1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter Numbers (enter -1 to stop) :- ");

        while (true){

            int number = scanner.nextInt();

            if (number == -1){

                break;

            }

            linkedList.add(number);

        }

        for(int number : linkedList){

            System.out.println("Entered Number :- " + number);

        }

        // Removing odd numbers
        LinkedList<Integer> evenNumbers = removeOddNumbers(linkedList);

        // Displaying the LinkedList after removing odd numbers
        System.out.println("LinkedList after removing odd numbers:");
        for (int num : evenNumbers) {
            System.out.println(num);
        }

        //search
        System.out.println("Enter a Number to search :- ");

        int searchNumber = scanner.nextInt();

        if (evenNumbers.contains(searchNumber)){

            System.out.println(searchNumber + " is in the List!");

        }else{

            System.out.println(searchNumber + " is not in the List!");
        }

        //remove
        System.out.println("Enter a name to remove :- ");

        int removeNumber = scanner.nextInt();

        if (evenNumbers.contains(removeNumber)) {

            evenNumbers.remove(Integer.valueOf(removeNumber));

            System.out.println(removeNumber + " has been removed from the List!");

        } else {

            System.out.println(removeNumber + " is not in the List!");
        }

        System.out.println("Numbers after removal: " );
        for(int num2 : evenNumbers){

            System.out.println(num2);

        }

        // Calculate total and average
        int total = 0;

        for (int num : evenNumbers) {

            total += num;

        }

        double average = evenNumbers.isEmpty() ? 0 : (double) total / evenNumbers.size();

        System.out.println("Total of remaining numbers: " + total);

        System.out.println("Average of remaining numbers: " + average);

        System.out.println("Have A Good Day!");

        scanner.close();

    }

    public static LinkedList<Integer> removeOddNumbers(LinkedList<Integer> numbers) {
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        return evenNumbers;
    }

    public static boolean remove(LinkedList<Integer> numbers, int removeNumber) {
        return numbers.remove(Integer.valueOf(removeNumber));
    }
}
