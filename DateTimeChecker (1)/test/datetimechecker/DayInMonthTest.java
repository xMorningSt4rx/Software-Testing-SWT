/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimechecker;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Le Nguyen Nhat Minh
 */
@RunWith(Parameterized.class)
public class DayInMonthTest {

    private int month, year;
    private String expResult;
    
    DateTimeTester dtt;

    @Before
    public void setUp() {
        dtt = new DateTimeTester();
    }

    public DayInMonthTest(int month, int year, String expResult) {
        this.month = month;
        this.year = year;
        this.expResult = expResult;
    }

    @Parameters
    public static Collection<Object[]> testData() {
        Object[][] data = new Object[][]{
            //DayInMonth 1-14
            {0, 2020, null},//1
            {0, 2021, null},//2
            {0, 2024, null},//3
            {0, 3000, null},//4
            {0, 3001, null},//5
            {0, 1000, null},//6
            {0, 999, null},//7
            {0, null, null},//8
            {2, 2020, "29"},//9
            {2, 2021, "28"},//10
            {2, 2024, "29"},//11
            {2, 3000, "29"},//12
            {2, 3001, null},//13
            {2, 1000, "29"},//14
            
            //DayInMonth 15 - 28
            {2, 999, null}, //15
            {2, null, null}, //16
            {4, 2020, "30"}, //17

            {4, 2021, "30"}, //18
            {4, 2024, "30"}, //19
            {4, 3000, "30"}, //20

            {4, 3001, null}, //21
            {4, 1000, "30"}, //22
            {4, 999, null}, //23

            {4, null, null}, //24
            {8, 2020, "31"}, //25

            {8, 2021, "31"}, //26
            {8, 2024, "31"}, //27
            {8, 3000, "31"}, //28
            
            //DayInMonth 29 - 40
            {8, 3001, null},
            {8, 1000, "31"},
            {8, 999, null},
            {8, null, null},
            {13, 2020, null},
            {13, 3000, null},
            {13, 2021, null},
            {13, 2024, null},
            {13, 1000, null},
            {13, 3001, null},
            {13, 999, null},
            {13, null, null},
            
            
//            //DayInMonth 1-14
//            {0, 2020, 0},//1
//            {0, 2021, 0},//2
//            {0, 2024, 0},//3
//            {0, 3000, 0},//4
//            {0, 3001, 0},//5
//            {0, 1000, 0},//6
//            {0, 999, 0},//7
//            {0, 0, 0},//8
//            {2, 2020, 29},//9
//            {2, 2021, 28},//10
//            {2, 2024, 29},//11
//            {2, 3000, 29},//12
//            {2, 3001, 0},//13
//            {2, 1000, 29},//14
//            
//            //DayInMonth 15 - 28
//            {2, 999, 0}, //15
//            {2, 0, 0}, //16
//            {4, 2020, 30}, //17
//
//            {4, 2021, 30}, //18
//            {4, 2024, 30}, //19
//            {4, 3000, 30}, //20
//
//            {4, 3001, 0}, //21
//            {4, 1000, 30}, //22
//            {4, 999, 0}, //23
//
//            {4, 0, 0}, //24
//            {8, 2020, 31}, //25
//
//            {8, 2021, 31}, //26
//            {8, 2024, 31}, //27
//            {8, 3000, 31}, //28
//            
//            //DayInMonth 29 - 40
//            {8, 3001, 0},
//            {8, 1000, 31},
//            {8, 999, 0},
//            {8, 0, 0},
//            {13, 2020, 0},
//            {13, 3000, 0},
//            {13, 2021, 0},
//            {13, 2024, 0},
//            {13, 1000, 0},
//            {13, 3001, 0},
//            {13, 999, 0},
//            {13, 0, 0}
//                
//                //
        };
        return Arrays.asList(data);
    }

    /**
     * Test of validDTC method, of class DateTimeTester.
     */
    @Test
    public void testValidDayInMonth() {
        assertEquals(expResult, dtt.dayInMonth1(month, year));
    }
}
