package BinaryGap;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class solutionTest {

    Solution underTest = new Solution();

    @Test
    public void shouldReturn5For1041(){
        assertEquals(5, underTest.solution(1041));
    }

    @Test
    public void shouldReturn0For32(){
        assertEquals(0, underTest.solution(32));
    }

    @Test
    public void testBitWise(){
        int N = 2;
        System.out.println("binary " + Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(N&1));
    }
}
