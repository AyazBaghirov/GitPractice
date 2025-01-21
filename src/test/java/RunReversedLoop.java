import java.util.Arrays;
import java.util.Collections;



public class RunReversedLoop {



    public static String runLoop( String str){
        String reversedLoop ="";
        String [] strArr = str.split("");
        Collections.reverse(Arrays.asList(strArr));
        reversedLoop = Arrays.toString(strArr);
        return reversedLoop;
    }
}
