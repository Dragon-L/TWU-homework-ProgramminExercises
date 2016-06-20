import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class TriangleExercisesTest {
    Printer printer;
    TriangleExercises triangleExercises;
    InOrder inOrder;

    @Before
    public void setUp() throws Exception{
        printer = mock(Printer.class);
        inOrder = inOrder(printer);
        triangleExercises = new TriangleExercises(printer);
    }

    @Test
    public void should_print_one_asterisk_when_be_called() throws Exception{
        triangleExercises.easiestExercises();
        verify(printer).println("*");
    }

    @Test
    public void should_print_8_asterisks_on_one_line_when_input_is_8() throws Exception{
        triangleExercises.DrawHorizontalLine(8);
        verify(printer).println("********");
    }

    @Test
    public void should_print_3_lines_each_with_one_asterisk_when_input_is_3() throws Exception{
        triangleExercises.DrawVerticalLine(3);
        verify(printer,times(3)).println("*");
    }

    @Test
    public void should_draw_a_right_triangle_with_3_lines_when_input_is_3() throws Exception{
        triangleExercises.DrawRightTriangle(3);
        inOrder.verify(printer).println("*");
        inOrder.verify(printer).println("**");
        inOrder.verify(printer).println("***");
    }
}
