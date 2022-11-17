
public class TestFile {

	public static void main(String[] args) {
		
		PatientQueue p = new PatientQueue();
		
		System.out.println("Check the size:");
		System.out.println(p.size() == 0);
		
		System.out.println();
		
		Patient A = new Patient("A", 7);
		Patient B = new Patient("B", 68);
		Patient C = new Patient("C", 25);
		Patient D = new Patient("D", 4);
		Patient E = new Patient("E", 3);
		Patient F = new Patient("F", 81);
		Patient G = new Patient("G", 53);
		Patient H = new Patient("H", 90);
		Patient I = new Patient("J", 18);
		Patient J = new Patient("K", 39);
		Patient K = new Patient("L", 47);
		Patient L = new Patient("M", 75);
		
		p.enqueue("A", 7);
		p.enqueue("B", 68);
		p.enqueue("C", 25);
		p.enqueue("D", 4);
		p.enqueue("E", 3);
		p.enqueue("F", 81);
		p.enqueue("G", 53);
		
		System.out.println("Check the print:");
		System.out.println("{E (3), D (4), C (25), B (68), A (7), F (81), G (53)}".equals(p.toString()));
		
		System.out.println();
		
		System.out.println("Check if empty: and size");
		System.out.println(p.size() == 7);
		System.out.println(p.isEmpty() == false);
				
		System.out.println();

		System.out.println("Check the peeks:");
		System.out.println(p.peek().equals("E"));
		System.out.println(p.peekPriority() == 3);
		System.out.println();
		p.dequeue();
		System.out.println(p.peek().equals("D"));
		System.out.println(p.peekPriority() == 4);
		System.out.println();
		p.dequeue();
		System.out.println(p.peek().equals("A"));
		System.out.println(p.peekPriority() == 7);
		System.out.println();
		p.dequeue();
		System.out.println(p.peek().equals("C"));
		System.out.println(p.peekPriority() == 25);
		System.out.println();
		p.dequeue();
		System.out.println(p.peek().equals("G"));
		System.out.println(p.peekPriority() == 53);
		System.out.println();
		p.dequeue();
		System.out.println(p.peek().equals("B"));
		System.out.println(p.peekPriority() == 68);
		System.out.println();
		p.dequeue();
		System.out.println(p.peek().equals("F"));
		System.out.println(p.peekPriority() == 81);		
		p.dequeue();

		System.out.println();
		
		System.out.println("Check if empty:");
		System.out.println(p.isEmpty() == true);
		System.out.println(p.toString().equals("{}"));

		System.out.println();
		
		p.enqueue(A);
		p.enqueue(B);
		p.enqueue(C);
		p.enqueue(D);
		p.enqueue(E);
		p.enqueue(F);
		p.enqueue(G);
		p.enqueue(H);
		p.enqueue(I);
		p.enqueue(J);
		p.enqueue(K);
		p.enqueue(L);
		
		System.out.println("Check the print:");
		System.out.println(p.toString().equals("{E (3), D (4), C (25), J (18), A (7), M (75), G (53), H (90), B (68), K (39), L (47), F (81)}"));
		
		System.out.println();
		
		System.out.println("Check if empty and size:");
		System.out.println(p.size() == 12);
		System.out.println(p.isEmpty() == false);
		System.out.println(p.toString().equals("{}") == false);
		
		System.out.println();
		
		p.changePriority("E", 100);
		System.out.println("Check the print:");
		System.out.println(p.toString().equals("{D (4), A (7), C (25), J (18), K (39), M (75), G (53), H (90), B (68), E (100), L (47), F (81)}"));
		
		System.out.println();

		System.out.println();
		
		p.changePriority("E", 3);
		System.out.println(p.toString());
		System.out.println("Check the print:");
		System.out.println(p.toString().equals("{E (3), D (4), C (25), J (18), A (7), M (75), G (53), H (90), B (68), K (39), L (47), F (81)}"));
		
		System.out.println();
		
		System.out.println("Check if empty and size:");
		System.out.println(p.size() == 12);
		System.out.println(p.isEmpty() == false);
		System.out.println(p.toString().equals("{}") == false);
		
		
		
	}
}
