package test;
import java.util.*;

import hw4.Node;

public class Singly_LinkedList {
	
	public static Node LastNode(Node first){
//		if(first == null) return null;
//		previous = first;
//		current = first.next;
//		if (current == null)
//			return previous;
//		return LastNode(current);
		
		
		if (first== null){
			return null;
		}else if (first.next == null){
			return first;
		}else{
			return LastNode(first.next);
		}
		
	}
	
	public static int sumNode(Node first){
//		if (first == null) return sum;
//		previous = first;
//		current = first.next;
//		sum++;
//		if (current == null)
//			return sum;
//		return sumNode(current);
		
		if (first== null){
			return 0;
		}else {
			return sumNode(first.next)+1;
		}
	}
	
	public static Node Node1_inCopy(Node<Integer> first){
//		if(first == null) return null;
//		previous = first;
//		current = first.next;
//		copy.add(previous);
//		if (current == null)
//			return copy.getFirst();
//		return Node1_inCopy(current);
		if (first == null){return null;}
		if (first.next == null){
			return new Node<Integer>(first.data, null);
		}else{
			return  new Node(first.data,Node1_inCopy(first.next));	
		}
	}
	
	public static Node Node1_inReversedCopy(Node first){ 
//		if(first == null) return null;
//		previous = first;
//		current = first.next;
//		if(current == null) 
//			return copy.getFirst();
//		Node1_inReversedCopy(current);
//		copy.add(previous);
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
			System.out.println("n"+n.data);
			return n;
		}
//		else {
//			Node n = Node1_inReversedCopy(first.next);
//			
//		}
		
		
	}
	
	public static Node Node1_inNonReversersed (Node first){
		if(first == null) return null;
		
//		while(first.next != null){
//			first = first.next;
//		}
//		while(first != null){
//			first.next = first;
//			new Node(first.data,first);
//		}
//		return new Node(first.data, null);
		
		Node curr = first;
		//Node newHead = null;
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
	    
	    System.out.println(LastNode(N5).data);
	    System.out.println(sumNode(N5));
	    Node nLL = Node1_inCopy(N5);
	    
	    if (nLL.data == N5.data){
	    	System.out.println("Success");
	    }
	    
	    System.out.println("ans="+Node1_inReversedCopy(N5).data);
	    
	    Node nLL2 =Node1_inReversedCopy(N5);
	    Node t = N5;
	    while (t.next != null){
	    	t = t.next;
	    }
	    if (t.data == nLL2.data){
	    	System.out.println("Reverse Success");
	    }
	    
	    Node nLL3 = Node1_inNonReversersed(N5);
	    Node t3 = N5;
	    while (t3.next != null){
	    	t3 = t3.next;
	    }
	    if (t3.data == nLL3.data){
	    	System.out.println("Reverse Success");
	    }else{
	    	System.out.println("Reverse Fail");
	    }
	    
	    Node1_inNonReversersed(N5);
//	    
//	    LastNode(n5);
//	    sumNode(n5);
//	    Node1_inCopy(n5);
//	    Node1_inReversedCopy(n5);
//	    Node1_inNonReversersed(n5);
//	    
//	    
		System.out.println("Yipee");
		
		
	}

}
