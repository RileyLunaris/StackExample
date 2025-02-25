import java.util.Scanner;


/**
 * CSC6301 - Module 5
 * The main class of a Stack used to demonstrate the functionality of a
 * maintenance plan by converting and linked list to a sorted stack.
 *
 * @author Dustin McDaniel aka (Riley Lunaris)
 * @since 2025/02/18 | CSC 6301 Week 5
 */
public class StackExample {
    /**
     * Main Method of the class
     *
     * Continuously grabs integer only inputs from the user and inserts them
     * into a Linked List Structure.  Linked List is displayed after each
     * insertion.  Program exists on non-integer inputs from the user.  Creates
     * a Stack from the data in sorted order such that the largest value is at
     * the top of the stack.
     *
     * Additional methods are used as examples here.
     *
     * @param args default parameter for a main method - not used.
     * @since 2025/02/18 | CSC 6301 Week 5
     */
    public static void main(String[] args) {
        // I added onto the linked list functionality for Stack
        Stack newStack = new Stack();

        // user instructions
        System.out.println("Insertable Linked List → Stack ");
        System.out.print("Enter Integers (non-integers to stop): ");

        // opens the scanner and closes automatically
        try (Scanner scanner = new Scanner(System.in);) {

            // main loop for user input
            while (true) {
                // parse and sends input to linked list
                try {newStack.insert(Integer.parseInt(scanner.nextLine()));}
                // exists on non-integers
                catch (NumberFormatException e) {break;}
                // user list visualization
            }
            // to show off the input order
            System.out.print("Input order: ");
            newStack.display();

            // initialize the sorted stack
            newStack.reverse();

            // show off the methods of the Stack
            System.out.print("Stack order: ");
            newStack.display();

            // pop some values
            System.out.println("Popped Value: " + newStack.pop());
            System.out.println("Popped Value: " + newStack.pop());

            // push some values
            System.out.println("adding 4 to the top of the stack");
            newStack.push(4);

            // peek at the stack
            System.out.println("Peeked Value: " + newStack.peek());

            // showcase the stack
            newStack.display();
        }
    }
}
