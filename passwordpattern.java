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
