package SampleExmaples;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MathTest {

    @Test
    @Order(1)
    public void testSecond(){
        System.out.println("Second test Done");
    }

    @Test
    @Order(4)
    public void testFirst(){
        System.out.println("First test Done");
    }

    @Test
    @Order(3)
    public void testThird(){
        System.out.println("Third test Done");
    }

    @Test
    @Order(2)
    public void testFourth(){
        System.out.println("Fourth test Done");
    }



}
