import java.util.*;  

public class PQueue{  
  public static void main(String args[]){  
    PriorityQueue<String> queue=new PriorityQueue<String>();  
    queue.add("Amit Sharma");  
    queue.add("Vijay Raj");  
    queue.add("JaiShankar");  
    queue.add("Raj");  
    System.out.println("head:"+queue.element());  
    System.out.println("head:"+queue.peek()); 
  }  
}  