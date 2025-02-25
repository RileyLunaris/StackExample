/**
 * Stack class comprised of a linked list
 *
 * This class has an emplementation for reversing a linked list to have the
 * "head" of the linked list be the top of the stack.
 *
 * @author Dustin McDaniel aka (Riley Lunaris)
 * @since 2025/02/18 | CSC 6301 Week 5
 */
public class Stack extends LinkedList{

    /**
     * Reverses a Linked List.
     *
     * reverses the existing structures Nodes to point the other direction.
     *
     * @author Dustin McDaniel aka (Riley Lunaris)
     * @since 2025/02/18 | CSC6301 Week 5
     */
    public void reverse() {
        this.head = reverse(this.head);
    }

    /**
     * Recursive method for reversing a linked list.
     *
     * Reused structure from git-hub and modified for this application.
     * https://github.com/risetarnished/coding-practice/blob/92888e79a3cd149b7c9f55cf844e88953e0b97e8/coollime/src/main/java/coollime/linkedlist/reverselinkedlist/Solution.java
     * Swaps the pointers around the current node.
     *
     * @param current a pointer for the current node to be reversed
     * @return reversed Node
     * @author risetarnished, Dustin McDaniel aka (Riley Lunaris)
     * @since 2025/02/18 | CSC 6301 Week 5
     */
    public Node reverse(Node current) {
        // Base case: when we reach the last node in the original order
        if (current == null || current.next == null) {
            // The real case happens only when current.next == null
            return current;
        }

        Node newCurrent = reverse(current.next);
        current.next.next = current;
        current.next = null;
        return newCurrent;
    }

    /**
     * Adds a value to the top of the stack.
     *
     * Creates a new node and inserts it in the front of the linked list being
     * used for a stack data structure.
     *
     * @param value integer value to be placed at the top of the stack
     * @author Dustin McDaniel aka (Riley Lunaris)
     * @since 2025/02/18 | CSC 6301 Week 5
     */
    public void push(int value) {
        this.head = new Node(value, this.head);
        this.current = this.head;
    }


    /**
     * returns the value of the top of the stack.
     *
     * @return integer value of the item at the top of the stack
     * @author Dustin McDaniel aka (Riley Lunaris)
     * @since 2025/02/18 | CSC 6301 Week 5
     */
    public int peek() {
        int value = -1; // temporary value used for returning where -1 is default value

        if (this.head != null) {
            value = this.head.data;
        }

        return value;
    }

    /**
     * returns and removes the top item from the stack.
     *
     * @return integer value of the item popped from the stack
     * @author Dustin McDaniel aka (Riley Lunaris)
     * @since 2025/02/18 | CSC 6301 Week 5
     */
    public int pop() {
        int value = -1; // temporary value used for returning where -1 is default value

        if (this.head != null) {
            value = this.head.data;
            this.head = this.head.next;
        }

        return value;
    }
}