/*A password is said to be strong if it satisfies all the following criteria:

It has at least 8 characters.
It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
Given a string password, return true if it is a strong password. Otherwise, return false.

 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;  
        String reg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[-+!@#$%^&*()]).+$";
          Pattern pattern = Pattern.compile(reg);
          Matcher matcher = pattern.matcher(password);
          for(int i=1; i<password.length(); i++){
              if(password.charAt(i)==password.charAt(i-1)){
                  return false;
              }
          }
          return matcher.find();
    }
}
