package Test;

import Task.IntegerArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerArrayTest {
    @Test
    public void Check_If_The_Difference_Is_Seven_Test(){
        IntegerArray integerArray = new IntegerArray();
        int[] numbers = {2, 7, 9, 5, 1, 3, 5};
        int difference = 7;
        assertEquals(7, IntegerArray.arrayDifference(numbers));

    }
}
