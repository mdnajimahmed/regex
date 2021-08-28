import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeetCode {
    @Test
    public void run() {
        String text = "5F3Z-2e-9-w";
        text.replace("-","").toCharArray();
        System.out.println(text);
         Pattern p = Pattern.compile("[a-z]{4}");
    }
}
