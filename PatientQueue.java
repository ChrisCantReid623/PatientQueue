/** Author: Christopher Reid
 * CSC 210
 * PA #6 */

public class PatientQueue {
    private Patient[] heap;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    /** Constructor */
    public PatientQueue() {
        heap = new Patient[DEFAULT_SIZE];
        heap[0] = null;
        size = 0;
    }

    /** Extends the heap when capacity is reached. */
    private void resize(int capacity) {
        var temp = new Patient[capacity];
        size = capacity < size ? capacity:size;
        if (size >= 0) System.arraycopy(heap, 0, temp, 0, size);
        heap = temp;
    }

    /** Method to properly re-slot an element towards the 'front'. */
    private void bubbleUp(int i) {
        if (i > 1) {
                if (compare(heap[i], heap[parent(i)])) {
                    var parent = heap[parent(i)];
                    heap[parent(i)] = heap[i];
                    heap[i] = parent;
                    bubbleUp(parent(i));
                }
        }
    }

    /** Method to properly re-slot an element towards the 'rear'. */
    private void bubbleDown(int i) {
        if (left(i) <= size) {
            int higherPriorityChild = left(i);
            if (right(i) <= size && compare(heap[right(i)], heap[left(i)])) {
                higherPriorityChild = right(i);
            }
            if (compare(heap[higherPriorityChild], heap[i])) {
                var priorityChild = heap[higherPriorityChild];
                heap[higherPriorityChild] = heap[i];
                heap[i] = priorityChild;
                bubbleDown(higherPriorityChild);
            }
        }
    }

    /** Compares priorities of two patients. */
    private boolean compare(Patient a, Patient b) {
        if (a.priority != b.priority) {
            return a.priority < b.priority;
        }
        return a.name.compareTo(b.name) < 0;
    }

    /** Returns whether the heap is empty. */
    public boolean isEmpty(){
        return size == 0;
    }

    /** Returns the index of the parent node */
    public int parent(int i) { return i/2; }

    /** Returns the index of the left child node */
    public int left(int i) { return 2*i; }

    /** Returns the index of the right child node*/
    public int right(int i) { return 2*i + 1; }

    /** Returns the current size of the heap. */
    public int size() { return size; }

    /** Returns the priority of the front-most patient in the queue.*/
    public int peekPriority() throws Error {
        if (isEmpty()) {
            throw new Error("Error: Queue is Empty");
        }
        return heap[1].priority;
    }

    /** Returns the name of the front-most patient in the queue. */
    public String peek() throws Error {
        if (isEmpty()) {
            throw new Error("Error: Queue is Empty");
        }
        return heap[1].name;
    }

    /** Prints the elements of the queue. */
    public String toString() {
        String s = "{";
        for (int i = 1; i <= size; i++)
            s += (i == 1 ? "" : ", ") + heap[i];
        return s + "}";
    }

    /** Removes a Patient Object from the queue. */
    public String dequeue() throws Error {
        if (isEmpty())
            throw new Error("Error: Queue is Empty");
        var first = heap[1];
        heap[1] = heap[size];
        size--;
        bubbleDown(1);
        return first.name;
    }

    /** Creates a Patient Object with the provided arguments. */
    public void enqueue(String name, int priority) {
        var newPatient = new Patient(name, priority);
        enqueue(newPatient);
    }

    /** Adds a Patient Object to the queue. */
    public void enqueue(Patient patient) {
        size++;
        if (size >= heap.length) {
            resize(2*heap.length);
        }
        heap[size] = patient;
        bubbleUp(size);
    }

    /** Removes all elements in the queue. */
    public void clear() {
        heap = new Patient[DEFAULT_SIZE];
        heap[0] = null;
        size = 0;
    }

    /** Changes the priority of a patient that actively exists in the queue. */
    public void changePriority(String name, int newPriority) {
        for (int i = 1; i < size+1; i++) {
            if (heap[i].name.equals(name)) {
                heap[i].priority = newPriority;
                if (heap[parent(i)] != null && compare(heap[i], heap[parent(i)])) {
                    bubbleUp(i);
                } else {
                    bubbleDown(i);
                }
                break;
            }
        }
    }
}