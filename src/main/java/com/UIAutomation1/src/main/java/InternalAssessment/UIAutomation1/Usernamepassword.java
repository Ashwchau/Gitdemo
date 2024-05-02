package InternalAssessment.UIAutomation1;

import java.util.ArrayList;
import java.util.List;
public class Usernamepassword {

	public static void main(String[] args) {
        String data = "username1+password1-username2+password2-username3+password3-usernamen+passwordn";
        List<String> usernames = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        extractUsernamesPasswords(data, usernames, passwords);
        
        System.out.println("Usernames List:");
        for (String username : usernames) {
            System.out.println(username);
        }
        
        System.out.println("\nPasswords List:");
        for (String password : passwords) {
            System.out.println(password);
        }
    }
 
    public static void extractUsernamesPasswords(String data, List<String> usernames, List<String> passwords) {
        String[] parts = data.split("-");
        for (String part : parts) {
            String[] usernamePassword = part.split("\\+");
            String username = usernamePassword[0];
            String password = usernamePassword[1];
            usernames.add(username);
            passwords.add(password);
        }
    }
}
