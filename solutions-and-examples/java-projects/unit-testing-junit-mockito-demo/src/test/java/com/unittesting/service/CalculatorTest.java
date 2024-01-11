package com.unittesting.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    AdvanceCalculatorService service;

    // Testing add() method

    @InjectMocks
    Calculator calc;

//    @BeforeEach
//    public void setupTest(){
//        calc = new Calculator();
//    }

    @Test
    public void addTest(){
        // Given
        int num1=10;
        int num2=20;
        // When
        assertEquals(30,calc.add(num1,num2));
        // Then
    }


    @Test
    public void subtractTest(){
        // Given
        int num1=10;
        int num2=20;

        assertEquals(-10,calc.subtract(num1,num2));

    }

    @Test
    public void divideTest(){
        assertEquals(2,calc.divide(10,5));
        assertEquals(0,calc.divide(0,20));

        assertThrows(ArithmeticException.class, () -> calc.divide(0,0));

    }

    @Test
    public void getStringLengthTest(){

        // Given
        String str = "hello world";
        // When
        when(service.getStringLength(str)).thenReturn(11);
        // Then
        assertEquals(11,calc.getStringLength(str));
        // Verify
        verify(service, times(1)).getStringLength(str);

    }




}
