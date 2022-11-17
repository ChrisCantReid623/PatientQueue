public class Testing {
    public static void main(String[] args) {
        var object = new PatientQueue();

//        object.enqueue("Chris", 9);
//        System.out.println(object.peekPriority());
//        System.out.println(object.peek());
//        System.out.println(object.dequeue());
//        System.out.println(object);
//
//
//
//        for (int i = 1; i <= 8; i++ ) {
//            object.enqueue("Christopher " + i, i);
//        }
//        System.out.println();
//        System.out.println(object);
//
//        KthLargest(object, 5);
//        System.out.println();
//
//        System.out.print("Top Patient: " + object.peek());
//        System.out.println(": Patient Priority: " + object.peekPriority());
//        object.changePriority("Christopher 1", 11);
//        System.out.println();
//        System.out.println(object);
//        System.out.println();
//
//        while (!object.isEmpty()) {
//            System.out.print("Top Patient: " + object.peek());
//            System.out.println(": Patient Priority: " + object.peekPriority());
//            System.out.println("Dequeued: " + object.dequeue());
//            System.out.println(object);
//            System.out.println();
//        }
//
//        object.enqueue("Debra", 1);
//        object.enqueue("Jayden", 4);
//        object.enqueue("Christopher", 1);
//        object.enqueue("Ricardo", 2);
//        object.enqueue("Whitney", 3);
//        object.enqueue("Marissa", 3);
//        System.out.println(object);
//
//        System.out.println(object.parent(1));
//        System.out.println(object.parent(2));
//        System.out.println(object.parent(3));
//        System.out.println(object.parent(4));
//        System.out.println(object.parent(5));
//
//        object.enqueue("A", 5);
//        object.enqueue("B", 4);
//        object.enqueue("C", 3);
//        object.enqueue("D", 2);
//        object.enqueue("E", 1);
//        System.out.println();
//        System.out.println(object);
//        object.changePriority("E", 3);
//        System.out.println();
//        System.out.println(object);
//
//        while (!object.isEmpty()) {
//            System.out.print("Top Patient: " + object.peek());
//            System.out.println(": Patient Priority: " + object.peekPriority());
//            System.out.println("Dequeued: " + object.dequeue());
//            System.out.println(object);
//            System.out.println();
//        }
    }


    public static void KthLargest(PatientQueue queue, int k) {
        if (k < queue.size()) {
            while (queue.size() > k) {
                queue.dequeue();
            }
            System.out.println(queue.peek());
        }
    }
}