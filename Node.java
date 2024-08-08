/* 
* NAME: Felix Najera
* PID: A17618969
*/

/**
 * Represents a single node in a linked list.
 * @param <T> the type of data stored in the node
 */
public class Node<T> {
    // Fields to store the data and the reference to the next node
    private T data;
    private Node<T> next;

    /**
     * Creates a single node with the specified data.
     * @param data the data to store in the node
     */
    private Node(T data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Creates a node with the specified data and a reference to the next node.
     * @param data the data to store in the node
     * @param nextNode the next node in the linked list
     */
    private Node(T data, Node<T> nextNode) {
        this.data = data;
        this.next = nextNode;
    }

    /**
     * Sets the data stored in this node.
     * @param data the new data to store in the node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Returns the data stored in this node.
     * @return the data stored in the node
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the next node in the linked list.
     * @param nextNode the node to set as the next node
     */
    public void setNext(Node<T> nextNode) {
        this.next = nextNode;
    }

    /**
     * Returns the next node in the linked list.
     * @return the next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * "Removes" the current node from its list by updating its own fields
     * to match what is found in the following node. If there is no next node,
     * it clears the fields of the current node.
     */
    public void remove() {
        if (next != null) {
            this.data = next.data;
            this.next = next.next;
        } else {
            this.data = null;
            this.next = null;
        }
    }
}