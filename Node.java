/**
 * Default Node Class for
 * @author Dustin McDaniel aka (Riley Lunaris)
 * @since 2025/02/11 | CSC6301 - Week 4
 */
public class Node {
    // Public variables for use in the Linked List Class
    /** integer value stored within the node.*/
    public int data;
    /** pointer from this node to the next */
    public Node next;

    /**
     * Default Node Constructor.
     *
     * Instantiates a Node's data without a next pointer.
     * @param data integer stored in the node
     */
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Node Constructor.
     *
     * Instantiates a Node's data with a next pointer.
     * @param data integer stored in the node
     * @param next pointer to the next node
     */
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
