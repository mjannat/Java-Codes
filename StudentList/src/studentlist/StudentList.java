
package studentlist;

import java.util.LinkedList;

public class StudentList {
    public static void main(String[] args) {
      LinkedList <Student> list = new LinkedList<>();
      Student s1 = new Student(1,"Smith","Eleven");
      Student s2 = new Student(2,"Amith","Eleven");
      Student s3 = new Student(3,"Mim","Eleven");
      Student s4 = new Student(4,"Mimi","Eleven");
      
      list.add(s1);
      list.add(s2);
      list.add(s3);
      list.add(s4);
      
      for(Student s:list)
      {
          System.out.println(s.id + " " + s.className + " " + s.name);
      }
      
    }
    
}
