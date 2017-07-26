import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    private final Triangle triangle = new Triangle();
    private final DrawLine line = new DrawLine();

    @Test
    public void test_one_asterisk() throws Exception {
        assertEquals("*", line.drawEasiest());
    }

    @Test
    public void test_draw_horizontal_line_when_n_is_3() throws Exception {
        assertEquals("***", line.drawLine(3, "H"));
    }

    @Test
    public void test_draw_horizontal_line_when_n_is_8() throws Exception {
        assertEquals("********", line.drawLine(8, "H"));
    }

    @Test
    public void test_draw_vertical_line_when_n_is_2() throws Exception {
        assertEquals("*/n*/n", line.drawLine(2, "V"));
    }

    @Test
    public void test_draw_vertical_line_when_n_is_4() throws Exception {
        assertEquals("*/n*/n*/n*/n", line.drawLine(4, "V"));
    }

    @Test
    public void test_draw_triangle_when_n_is_3() throws Exception {
        assertEquals(Arrays.asList("*","**","***"), triangle.drawTriangle(3));
    }

    @Test
    public void test_draw_triangle_when_n_is_5() throws Exception {
        assertEquals(Arrays.asList("*","**","***","****","*****"), triangle.drawTriangle(5));
    }
}
