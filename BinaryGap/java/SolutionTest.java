package BinaryGap.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution underTest = new Solution();

    @Test
    public void shouldReturn5ForNIs1041(){
        assertEquals(5, underTest.solution(1041));
    }

    @Test
    public void shouldReturn0ForNIs32(){
        assertEquals(0, underTest.solution(32));
    }

    @Test
    public void shouldReturn0ForNIs15(){
        assertEquals(0, underTest.solution(15));
    }

    @Test
    public void shouldReturn2ForNIs9(){
        assertEquals(2, underTest.solution(9));
    }

    @Test
    public void shouldReturn0ForNIsMaxInt(){
        assertEquals(0, underTest.solution(2147483647));
    }

}
