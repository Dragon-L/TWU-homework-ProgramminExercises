import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class PrimeFactorsExerciseTest {
    Printer printer;
    PrimeFactorsExercise primeFactorsExercise;
    InOrder inOrder;

    @Before
    public void setUp() throws Exception{
        printer = mock(Printer.class);
        inOrder = inOrder(printer);
        primeFactorsExercise = new PrimeFactorsExercise(printer);
    }

    @Test
    public void should_return_a_list_of_empty_when_input_is_1() throws Exception{
        List<Integer> result = primeFactorsExercise.Prime(1);
        assertThat(result.size(),equalTo(0));

    }


    @Test
    public void should_return_a_list_of_2_3_5_when_input_is_30() throws Exception{
        ArrayList<Integer> result = primeFactorsExercise.Prime(30);
        assertThat(result,equalTo(asList(2,3,5)));
    }
}
