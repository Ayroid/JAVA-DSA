package Arrays.Easy;
import java.util.*;
public class Question10 {
    public static boolean checkIfPangram(String sentence) {
         if (sentence.length() < 26) {
             return false;
         }
         String alphas = "abcdefghijklmnopqrstuvwxyz";
         for (int i = 0; i < alphas.length(); i++) {
             if (sentence.indexOf(alphas.charAt(i)) == -1) {
                 return false;
             }
         }
         return true;
     }
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A String: ");
            String str=sc.nextLine();
            boolean ans=checkIfPangram(str);
            System.out.println(ans);
        }
    }
 }
