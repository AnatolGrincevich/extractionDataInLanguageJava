import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author downey
 */
public class ListClientExampleTests {

    private static final int TEST_VALUE = 100;

    /**
     * Test method for {@link ListClientExample}.
     */
    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        List<Integer> list = lce.getList();
        assertThat(list, instanceOf(ArrayList.class));
    }

    @Test
    public void testEqualsLists() {
        ListClientExample listClientExample = new ListClientExample();
        listClientExample.getList().add(TEST_VALUE);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(TEST_VALUE);
        assertTrue(integerList.equals(listClientExample.getList()));
    }

    @Test
    public void testConstructors() {
        ListClientExample listClientExample1 = new ListClientExample();
        ListClientExample listClientExample2 = new ListClientExample();
        assertTrue(listClientExample1.equals(listClientExample2));
        ListClientExample listClientExample3 = new ListClientExample(listClientExample1);
        assertTrue(listClientExample3.equals(listClientExample1));
    }

}