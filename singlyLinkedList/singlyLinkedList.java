//YONGSHAN TAN
//CSC321
//Assignment #4
//10/28/16



package hw4;


public class singlyLinkedList {
	
	//Q1
	public static Node LastNode(Node first){
		if (first== null){
			return null;
		}else if (first.next == null){
			return first;
		}else{
			return LastNode(first.next);
		}
	}
	//worst case big theta(n)
	
	//Q2
	public static int sumNode(Node first){
		if (first== null){
			return 0;
		}else {
			return sumNode(first.next)+1;
		}
	}
	//worst case big theta(n)
	
	//Q3
	public static Node Node1_inCopy(Node first){
		if (first == null){return null;}
		if (first.next == null){
			return new Node(first.data, null);
		}else{
			return  new Node(first.data,Node1_inCopy(first.next));	
		}
	}
	//worst case big theta(n)
	
	//Q4
	public static Node Node1_inReversedCopy(Node first){ 
		if (first == null){return null;}
		if (first.next == null){
			return new Node(first.data, null);
		}
		else{
			Node n =  Node1_inReversedCopy(first.next);    //Node(first.data,Node1_inCopy(first.next));
			Node f = n;
			while (f.next != null){
				f = f.next;
			}
			f.next = new Node(first.data, null);
			return n;
		}
	}
	//worst case big theta(n)
	
	//Q5
	public static Node Node1_inNonReversersed (Node first){
		if(first == null) return null;
		Node curr = first;
		Node prev = null;
		boolean  firstTime = true;
		while (curr!= null){
			Node n = new Node(curr.data,prev);
			if (firstTime){
				prev = n;
				//newHead = prev;
				firstTime = false;
			}else{
				prev = n;
				
			}
			curr = curr.next;
		}
		return prev;
	}
	//worst case big theta(n)
	
	public static void main(String argus[]){
		Node N1 = null;
		Node N2 = new Node(4,N1);
		Node N3 = new Node(3,N2);
		Node N4 = new Node(2,N3);
		Node N5 = new Node(1,N4);
		
		
		//Reverse
		Node n1 = null;
	    Node n2 = new Node(1,n1);
	    Node n3 = new Node(2,n2);
	    Node n4 = new Node(3,n3);
	    Node n5 = new Node(4,n4);
	    
	    //System.out.println(LastNode(N5).data);
	    Node q1_1= LastNode(N5);
	    if(q1_1.data==N2.data)
	    	System.out.println("Q1 success");
	    else System.out.println("failed");
	    Node q1_2= LastNode(n5);
	    if(q1_2.data==n2.data)
	    	System.out.println("Q1 success");
	    else System.out.println("failed");
	    
	    
	    int q2_1= sumNode(N5);
	    if(q2_1==4)
	    	System.out.println("Q2 success");
	    else System.out.println("failed");
	    int q2_2= sumNode(n5);
	    if(q2_2==4)
	    	System.out.println("Q2 success");
	    else System.out.println("failed");
	    
	    
	    Node q3_1 = Node1_inCopy(N5);
	    if (q3_1.data == N5.data){
	    	System.out.println("Q3 success");
	    }
	    else System.out.println("failed");
	    Node q3_2 = Node1_inCopy(n5);
	    if (q3_2.data == n5.data){
	    	System.out.println("Q3 success");
	    }
	    else System.out.println("failed");
	    
	    
	    Node q4_1 =Node1_inReversedCopy(N5);
	    Node t = N5;
	    while (t.next != null){
	    	t = t.next;
	    }
	    if (t.data == q4_1.data){
	    	System.out.println("Q4 Reverse Success");
	    }
	    else System.out.println("Reverse Fail");
	    Node q4_2 =Node1_inReversedCopy(n5);
	    Node f = n5;
	    while (f.next != null){
	    	f = f.next;
	    }
	    if (f.data == q4_2.data){
	    	System.out.println("Q4 Reverse Success");
	    }
	    else System.out.println("Reverse Fail");
	    
	    
	    Node q5_1 = Node1_inNonReversersed(N5);
	    Node h = N5;
	    while (h.next != null){
	    	h = h.next;
	    }
	    if (h.data == q5_1.data){
	    	System.out.println("Q5 Reverse Success");
	    }else{
	    	System.out.println("Reverse Fail");
	    }
	    Node q5_2 = Node1_inNonReversersed(n5);
	    Node k = n5;
	    while (k.next != null){
	    	k = k.next;
	    }
	    if (k.data == q5_2.data){
	    	System.out.println("Q5 Reverse Success");
	    }else{
	    	System.out.println("Reverse Fail");
	    }
	    
	}
	
}
