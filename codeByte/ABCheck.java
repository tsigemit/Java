import java.util.*;
public class ABCheck {
    static String abCheck(String str) {
    String result[] = str.split("a|b");
    for(String s : result)
        if(s.length()==3)
            return "true";

        return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        System.out.println(abCheck("lane borrowed"));
        System.out.println(abCheck("lane and borrowed"));
        System.out.println(abCheck("lane or borrowed"));
    }
}