package CalculatorMockitoTest;
import CalculatorMockito.AddService;
import CalculatorMockito.CalcService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


public class CalcServiceTest {

    CalcService calcService;

    @Mock
    AddService addService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalcService(){
        System.out.println(" ## Test Executing..#");

     //   AddService addService= Mockito.mock(AddService.class);
        CalcService calcService=new CalcService(addService);
        when(addService.add(13,15)).thenReturn(28);

        int result=calcService.calculate(13,15);
        assertEquals(28,result);

    }

    @Test
    public void verifyInteractions(){
       List<String> mockedList = Mockito.mock(List.class);
        mockedList.add("One");
        mockedList.add("Two");
        mockedList.add("Three");
        mockedList.add("Three");

        mockedList.clear();
        verify(mockedList).add("One");
        verify(mockedList).add("Two");



    }


    @Test
    public void testSpy(){
        List<String> list = new ArrayList<>();
        List<String> spyList = spy(list);

        spyList.add("Element-1");
        System.out.println(spyList.get(0));


        when(spyList.get(0)).thenReturn("Element-2");
        System.out.println(spyList.get(0));

        assertEquals("Element-2",spyList.get(0));


    }


}
