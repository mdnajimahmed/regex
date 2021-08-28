import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindIndex {
    @Test
    public void givenText_whenSimpleRegex_thenShouldFindMatchIndex() {
        Pattern pattern = Pattern.compile("cat"); // this is the mistake I made in a coding interview, reason I took course to learn regex.
        Matcher matcher = pattern.matcher("A cat does not know how to spell category");
        boolean isFound = matcher.find();
        assertEquals(isFound, true);
        assertEquals(2, matcher.start()); // first cat starts at position 2
        assertEquals(5, matcher.end()); // first cat ends at position 5
    }

    @Test
    public void givenText_whenSimpleRegex_thenShouldFindAllMatchIndex() {
        Pattern pattern = Pattern.compile("aa"); // this is the mistake I made in a coding interview, reason I took course to learn regex.
        Matcher matcher = pattern.matcher("aaaaaaa");
        /*
        0 2
        2 4
        4 6
        * */
        while (matcher.find()) { // before finding start and end calling find is a must.
            System.out.println(matcher.start() + " " + matcher.end());
        }
    }
}
