import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class FizzBuzzExerciseTest {
    Printer printer;
    FizzBuzzExercise fizzBuzzExercise;
    InOrder inOrder;

    @Before
    public void setUp() throws Exception{
        printer = mock(Printer.class);
        inOrder = inOrder(printer);
        fizzBuzzExercise = new FizzBuzzExercise(printer);
    }

    @Test
    public void should_prints_out_numbers_and_instead_some_by_string() throws Exception{

        fizzBuzzExercise.FizzBuzz(15);
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
}
