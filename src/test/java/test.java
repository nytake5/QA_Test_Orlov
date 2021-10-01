import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class test{
    @Test
    public void test(){
        assertTrue(Main.isHappyTicket(666477));
    }
    @Test
    public void test1(){
        assertFalse(Main.isHappyTicket(123121));
    }
    @Test
    public void test2(){
        try {
            assertFalse(Main.isHappyTicket(1231232));
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.toString() + ex.getMessage());
        }

    }
    @Test
    public void test3(){
        assertFalse(Main.isHappyTicket(-456654));
    }
}