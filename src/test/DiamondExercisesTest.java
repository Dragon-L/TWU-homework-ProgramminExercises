import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class DiamondExercisesTest {
    Printer printer;
    DiamondExercises diamondExercises;
    InOrder inOrder;

    @Before
    public void setUp() throws Exception{
        printer = mock(Printer.class);
        inOrder = inOrder(printer);
        diamondExercises = new DiamondExercises(printer);
    }

    @Test
    public void should_draw_a_isosceles_triangle_with_3_lines_when_input_is_3() throws Exception{
        diamondExercises.DrawIsoscelesTriangle(3);
        inOrder.verify(printer).println("  *");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("*****");
    }

    @Test
    public void should_draw_a_diamond() throws Exception{

        diamondExercises.DrawDiamod(3);
        inOrder.verify(printer).println("  *");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("*****");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("  *");
    }

    @Test
    public void should_draw_a_diamond_with_name() throws Exception{

        diamondExercises.DrawDiamodWithName(3);
        inOrder.verify(printer).println("  *");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("LGL");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("  *");
    }
}
