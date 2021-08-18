import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringLiterals {
    @Test
    public void givenText_whenSimpleRegex_thenShouldMatchesTwice() {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foot my foot");
//        Matcher matcher = pattern.matcher("I am totally screwing with the test");
        int matches = 0;
        while (matcher.find()) {
            matches++;
        }
        assertEquals(2, matches);
    }
}
