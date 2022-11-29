/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimechecker;


import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Le Nguyen Nhat Minh
 */
@RunWith(Parameterized.class)
public class DateTimeCheckerTest {
    
    private String dtc;
    private boolean expResult;
    DateTimeTester dtt;
    @Before
    public void setUp() {
        dtt = new DateTimeTester();
    }

    public DateTimeCheckerTest(String dtc, boolean expResult) {
        this.dtc = dtc;
        this.expResult = expResult;
    }
    
    //Test case nhap o day
    //Format y nhu constructor
    @Parameters
    public static Collection<Object[]> dateCheck(){
        Object[][] data = new Object[][]{
                //CheckDate 1-14
            {"30/4/2024", true}, {"30/8/2020", true},
            {"30/8/2022", true},
            {"29/2/2020", true},
            {"29/2/2022", false},
            {"29/2/2024", true},
            {"29/4/2020", true},
            {"29/4/2022", true},
            {"29/4/2024", true},
            {"29/8/2020", true},
            {"29/8/2022", true},
            {"29/8/2024", true},
            {"30/2/2020", false},
            {"30/2/2022", false},
            {"30/2/2024", false},
            {"30/4/2020", true},
            {"30/4/2022", true},
            
            //CheckDate 15- 27
            {"30/4/2024", true}, {"30/8/2020", true},
            {"30/8/2022", true}, {"30/8/2024", true},
            {"31/2/2020", false}, {"31/2/2022", false},
            {"31/2/2024", false}, {"31/4/2020", false},
            {"31/4/2022", false}, {"31/4/2024", false},
            {"31/8/2020", true}, {"31/8/2022", true},
            {"31/8/2024", true}};
        return Arrays.asList(data);
    }
    /**
     * Test of validDTC method, of class DateTimeTester.
     */
    
    @Test
    public void testValidDTC(){
        assertEquals(expResult, dtt.check(dtc));
    }
    
    
//    @Test
//    public void testValidDTC2() {
//        System.out.println("CheckDate");
//        String dtc = "1/12/abc123";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//
//    @Test
//    public void testValidDTC3() {
//        System.out.println("DayInMonth");
//        int month = 2;
//        int year = 2001;
//        boolean expResult = true;
//        boolean result = DateTimeTester.dayInMonth(month, year);
//        assertEquals(expResult, result);
//    }

//    @Test
//    public void testValidDTC4() {
//        System.out.println("CheckYear");
//        int year = 2021;
//        boolean expResult = false;
//        boolean result = DateTimeTester.isLeapYear(year);
//        assertEquals(expResult, result);
//    }
//    String[] testArray = {"30/4/2024","30/8/2020","30/8/2022","30/8/2024"};
//    boolean[] expResult = {true,true,true};
//    int i = 0;
//    for (i = 0; i < 5; i++) {
//            System.out.println("CheckDate" + i);
//            testValidDTC15(testArray[i], expResult[i]);
//}
//    @Test
//    public void testValidDTC15(String dtc, boolean expResult) {
//        System.out.println("CheckDate15");
//        dtc = "30/4/2024";
//        expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC16() {
//        System.out.println("CheckDate16");
//        String dtc = "30/8/2020";
//        boolean expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC17() {
//        System.out.println("CheckDate17");
//        String dtc = "30/8/2022";
//        boolean expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC18() {
//        System.out.println("CheckDate18");
//        String dtc = "30/8/2024";
//        boolean expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC19() {
//        System.out.println("CheckDate19");
//        String dtc = "31/2/2020";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC20() {
//        System.out.println("CheckDate20");
//        String dtc = "31/2/2022";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC21() {
//        System.out.println("CheckDate21");
//        String dtc = "31/2/2024";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC22() {
//        System.out.println("CheckDate22");
//        String dtc = "31/4/2020";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC23() {
//        System.out.println("CheckDate23");
//        String dtc = "31/4/2022";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC24() {
//        System.out.println("CheckDate24");
//        String dtc = "31/4/2024";
//        boolean expResult = false;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC25() {
//        System.out.println("CheckDate25");
//        String dtc = "31/8/2020";
//        boolean expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC26() {
//        System.out.println("CheckDate26");
//        String dtc = "31/8/2022";
//        boolean expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }
//    @Test
//    public void testValidDTC27() {
//        System.out.println("CheckDate27");
//        String dtc = "31/8/2024";
//        boolean expResult = true;
//        boolean result = DateTimeTester.check(dtc);
//        assertEquals(expResult, result);
//    }

}
