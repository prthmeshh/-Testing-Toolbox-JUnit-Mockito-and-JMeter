package CalculatorMockito;

import CalculatorMockito.AddService;

public class AddServiceImpl implements AddService {

    @Override
    public int add(int n1,int n2)
    {
        System.out.println("## AddServiceImpl executed ##");
        return n1+n2;
    }
}
