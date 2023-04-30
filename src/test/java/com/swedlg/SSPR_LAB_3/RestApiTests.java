package com.swedlg.SSPR_LAB_3;

import com.swedlg.SSPR_LAB_3.controllers.MainController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestApiTests {

    @Test
    public void testSumApi(){
        MainController mainController = new MainController();
        String response = mainController.calculateSum("12.5", "3.2", null);
        assertEquals("15.7", response);
    }

    @Test
    public void testSubtractionApi(){
        MainController mainController = new MainController();
        String response = mainController.calculateSubtraction("12.5", "3.2", null);
        assertEquals("9.3", response);
    }

    @Test
    public void testMultiplicationApi(){
        MainController mainController = new MainController();
        String response = mainController.calculateMultiplication("12.5", "3.2", null);
        assertEquals("40.0", response);
    }

    @Test
    public void testDivisionApi(){
        MainController mainController = new MainController();
        String response = mainController.calculateDivision("12.5", "3.2", null);
        assertEquals("3.90625", response);
    }
}
