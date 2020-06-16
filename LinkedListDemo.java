
import java.util.LinkedList;
import java.util.Scanner;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
       for(int i = 0; i < 5; i++)
       {
           String str = sc.nextLine();
           list.add(str);
       }
       for(String st:list)
       {
           System.out.println(st);
       }
       list.remove(2);
       list.remove("Dhaka");
       list.addFirst("India");
       list.addLast("Pakistan");
       
       for(String st:list)
       {
           System.out.println(st);
       }
    }
 
}
