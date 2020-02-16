
package loginform;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginForm {

       public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter your Email:");
        String email = sc.nextLine();
    }
    
}
