package h2;

public class H2_main {

	    public static void printList(SimpleList list) {
	        Node current = list.head.next; 
	        System.out.print("[");
	        while (current != null) {
	            System.out.print(current.value);
	            current = current.next;
	            if (current != null) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }

	    public static void main(String[] args) {

	        SimpleList myList = new SimpleList();

	        myList.append(12);
	        myList.append(45);
	        myList.append(66);
	        myList.append(12);
	        myList.append(45);
	        myList.append(60);

	        System.out.print("Start-Liste: ");
	        printList(myList); 

	       
	        myList.insertAfter(45, 4);
	        System.out.print("Nach insertAfter(45, 4): ");
	        printList(myList); 

	        Node first45 = myList.findFirst(45);
	        if (first45 != null) {
	            System.out.println("Erster Knoten mit Wert 45: " + first45.value);
	        } else {
	            System.out.println("Kein Knoten mit Wert 45 gefunden.");
	        }

	        myList.delete(45);
	        System.out.print("Nach delete(45): ");
	        printList(myList); 
	    }
	}

