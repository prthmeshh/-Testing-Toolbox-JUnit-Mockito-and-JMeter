package CalculatorMockito;

import CalculatorMockito.AddService;

public class CalcService {

    private AddService addService;

    public CalcService(AddService addService){
        this.addService=addService;
    }

    public int calculate(int n1,int n2){
        System.out.println(" ## CalcService Executed ##");
        return addService.add(n1,n2);
    }
}
