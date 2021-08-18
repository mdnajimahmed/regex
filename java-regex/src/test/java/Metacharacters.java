import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Metacharacters {
    @Test
    public void givenText_whenSimpleRegex_thenShouldMatchDot() {
        /*Given a string. Check if there is more than one dot(.) used as full stop.
         * */
//        Pattern pattern = Pattern.compile("."); // this is the mistake I made in a coding interview, reason I took course to learn regex.
        Pattern pattern = Pattern.compile("\\.{2,}?"); // this is the mistake I made in a coding interview, reason I took course to learn regex.
        Matcher matcher = pattern.matcher("abc...");// abc(..)(..) will find 2 match. greedy. next find will start after first find.
        int match = 0;
        while (matcher.find()) {
            match++;
        }
        assertEquals(match > 0, true);
        System.out.println("match " + match);
    }
}
