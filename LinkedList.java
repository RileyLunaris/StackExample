/**
 * Basic Linked List Structure Comprised of Nodes.
 *
 * This list has very limited functionality compared to the default LinkedList
 * from java util collections.  This list is meant to be a flexible base for
 * future modules such that the implementation, documentation, and modularity of
 * this class can be adjusted easily without loosing progress.
 *
 * @author Dustin McDaniel aka (Riley Lunaris)
 * @since 2025/02/11 | CSC6301 - Week 4
 */

public class LinkedList {

    /** front of the linked List */
    protected Node head;
    /** traveling pointer for the linked List */
    protected Node current;

    /**
     * Main constructor of a Linked List
     * instantiates the private variables within the class.
     * @author Dustin McDaniel aka (Riley Lunaris)
     */
    public LinkedList() {
        this.head = null;
        this.current = this.head;
    }

    /**
     * Default insertion method for adding values to the linked list in sorted order
     *
     * Uses an insertion sort style where the complexity grows at  O(n).
     * @param value integer to be stored in linked list
     */
    public void insert(int value) {
        // used for node pointer manipulation
        Node temp;

        // if there is no head, make one.
        if (this.head == null) {
            this.head = new Node(value);
        }
        // if new data belongs at the front.
        else if (value < this.head.data) {
            this.head = new Node(value, this.head);
        }
        // otherwise find the insertion spot./
        else {
            // resets the current pointer.
            this.current = this.head;

            // looks for the insertion location.
            while (this.current.next != null && value >= this.current.next.data) {
                this.current = this.current.next;
            }

            // inserts between current node and the next node.
            temp = this.current.next;
            this.current.next = new Node(value, temp);
        }
    }

    /**
     * Basic Display method for the Linked List
     * This Shows the linked list in the terminal with arrows denoting the
     * connections between each node.
     */
    public void display() {
        // reset the current pointer.
        this.current = this.head;

        // loop over the entire dataset.
        while (this.current != null) {
            // print the data at each node.
            System.out.print(this.current.data);

            // add an arrow when we can.
            if (this.current.next != null) {
                System.out.print(" -> ");
            }

            this.current = this.current.next;
        }
        System.out.println();
    }
}
