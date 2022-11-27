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
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // reverse l1 and reverse l2
        Node l1 = revList(first);
        Node l2 = revList(second);
        
        
        Node resDummy = new Node(0), res = resDummy;
        
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = l1 != null ? l1 .data : 0;
            int y = l2 != null ? l2 .data : 0;
            
            int z = carry + x + y;
            
            carry = z / 10;
            res.next = new Node(z % 10);
            res = res.next;
            
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        
        if(carry > 0) {
            res.next = new Node(carry);
        }
        
        return revList(resDummy.next);
    }
    
    static Node revList(Node l) {
        Node revl = null, next = null;
        while(l!=null){
            next = l.next;
            l.next = revl;
            revl = l;
            l = next;
        }
        return revl;
    }
}