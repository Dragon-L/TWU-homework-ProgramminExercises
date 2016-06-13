import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class programmingExercisesTest {
    Printer printer;
    ProgrammingExercises programmingObject;
    InOrder inOrder;

    @Before
    public void setUp() throws Exception{
        printer = mock(Printer.class);
        inOrder = inOrder(printer);
        programmingObject = new ProgrammingExercises(printer);
    }

    @Test
    public void should_print_one_asterisk_when_be_called() throws Exception{
        programmingObject.easiestExercises();
        verify(printer).println("*");
    }

    @Test
    public void should_print_8_asterisks_on_one_line_when_input_is_8() throws Exception{
        programmingObject.DrawHorizontalLine(8);
        verify(printer).println("********");
    }

    @Test
    public void should_print_3_lines_each_with_one_asterisk_when_input_is_3() throws Exception{
        programmingObject.DrawVerticalLine(3);
        verify(printer,times(3)).println("*");
    }

    @Test
    public void should_draw_a_right_triangle_with_3_lines_when_input_is_3() throws Exception{
        programmingObject.DrawRightTriangle(3);
        inOrder.verify(printer).println("*");
        inOrder.verify(printer).println("**");
        inOrder.verify(printer).println("***");
    }

    @Test
    public void should_draw_a_isosceles_triangle_with_3_lines_when_input_is_3() throws Exception{
        programmingObject.DrawIsoscelesTriangle(3);
        inOrder.verify(printer).println("  *");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("*****");
    }

    @Test
    public void should_draw_a_diamond() throws Exception{

        programmingObject.DrawDiamod(3);
        inOrder.verify(printer).println("  *");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("*****");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("  *");
    }

    @Test
    public void should_draw_a_diamond_with_name() throws Exception{

        programmingObject.DrawDiamodWithName(3);
        inOrder.verify(printer).println("  *");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("LGL");
        inOrder.verify(printer).println(" ***");
        inOrder.verify(printer).println("  *");
    }

    @Test
    public void should_prints_out_numbers_and_instead_some_by_string() throws Exception{

        programmingObject.FizzBuzz(15);
        inOrder.verify(printer).println("1");
        inOrder.verify(printer).println("2");
        inOrder.verify(printer).println("Fizz");
        inOrder.verify(printer).println("4");
        inOrder.verify(printer).println("Buzz");
        inOrder.verify(printer).println("Fizz");
        inOrder.verify(printer).println("7");
        inOrder.verify(printer).println("8");
        inOrder.verify(printer).println("Fizz");
        inOrder.verify(printer).println("Buzz");
        inOrder.verify(printer).println("11");
        inOrder.verify(printer).println("Fizz");
        inOrder.verify(printer).println("13");
        inOrder.verify(printer).println("14");
        inOrder.verify(printer).println("FizzBuzz");
    }

    @Test
    public void should_return_a_list_of_empty_when_input_is_1() throws Exception{
        List<Integer> result = programmingObject.Prime(1);
        assertThat(result.size(),equalTo(0));

    }


    @Test
    public void should_return_a_list_of_2_3_5_when_input_is_30() throws Exception{
        ArrayList<Integer> result = programmingObject.Prime(30);
        assertThat(result,equalTo(asList(2,3,5)));
    }


}
