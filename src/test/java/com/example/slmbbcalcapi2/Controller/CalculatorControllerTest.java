package com.example.slmbbcalcapi2.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {
    @Test
    void addTwoPositiveIntegers(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = 6;
        //Act
        int result = controller.add(a,b);
        //Assert
        assertEquals((a+b), result);
    }

    @Test
    void addOnePositiveIntegerAndOneNegativeInteger(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = 5;
        int b = -6;
        //Act
        int result = controller.add(a,b);
        //Assert
        assertEquals((a+b), result);
    }
    @Test
    void addTwoNegativeIntegers(){
        //Arrange
        CalculatorController controller = new CalculatorController();
        int a = -5;
        int b = -6;
        //Act
        int result = controller.add(a,b);
        //Assert
        assertEquals((a+b), result);
    }


}