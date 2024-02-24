package SampleExmaples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    public void newTest1(){
        System.out.println("New Test1");
    }

    @Test
    @Tag("SampleTest")
    public void newTest2(){
        System.out.println("New Test2");
    }

    @Test
    @Tag("UnitTest")
    public void newTest3() {
        System.out.println("New Test3");
    }

}
