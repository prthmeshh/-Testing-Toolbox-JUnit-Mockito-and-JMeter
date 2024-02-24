package SampleExmaples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    @Tag("UnitTest")
    public void test1(){
        System.out.println("Test1");

    }

    @Test
    @Tag("SampleTest")
    public void test2(){
        System.out.println("Test2");

    }

    @Test
    @Tag("UnitTest")
    public void test3(){
        System.out.println("Test3");

    }

}
