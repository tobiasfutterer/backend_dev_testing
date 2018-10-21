import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class BookTest {

    @Test
    public void idShouldHaveSetterAndGetter() {
        int expected = 123;
        Book book = new Book();
        book.setId(expected);
        expected = 123;

        assertThat(book.getId(), is(equalTo(expected)));
    }
}
