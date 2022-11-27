//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.subLinkedList(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* Structure of Linked list node

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

*/

class Solution
{
    static Node subLinkedList(Node l1, Node l2)
    {
        java.math.BigInteger l1N = listToInt(l1);
        java.math.BigInteger l2N = listToInt(l2);
        Node temp = null;
        if(l2N.compareTo(l1N) == 1){
            temp = l1;
            l1 = l2;
            l2 = temp;
        }

        l1 = revList(l1);
        l2 = revList(l2);    
        
        
        Node dummyRes = new Node(0);
        Node res = dummyRes;
        
        boolean borrowed = false;
        while(l1!=null || l2!=null){
            int x = l1!=null ? l1.data : 0;
            int y = l2!=null ? l2.data : 0;
            int z = 0;
            if(borrowed){
                x = x - 1; 
            }
            if (x >= y){
                borrowed = false;
                z = x - y;
            } else {
                borrowed = true;
                x = x + 10;
                z = x - y;
            }
            
            res.next = new Node(z);
            res = res.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        
        Node finalRes = revList(dummyRes.next);
        
        while(finalRes != null && finalRes.data == 0){
                finalRes = finalRes.next;
        }
        
        return  finalRes!=null ? finalRes : new Node(0);
    }
    
    static Node revList(Node head) {
        Node prev = null, next = null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    
    static java.math.BigInteger listToInt(Node head){
        Node l = head;
        String s = "";
        while(l!=null){
            s = s + l.data;
            l = l.next;
        }
        
        return new java.math.BigInteger(s);
    }
}