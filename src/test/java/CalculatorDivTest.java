import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorDivTest extends CalculatorBaseTest {

    private Calculator calc = new Calculator();

    @DataProvider(name = "testDataForDiv")
    public Object[][] testDataForDiv() {
        return new Object[][]{
                {3, 4, 0.75},
                {-1, -1, 1},
                {2147483647, 2147483647, 1}
        };
    }

    @Test(dataProvider = "testDataForDiv", description = "User checks how div works", priority = 1)
    public void testDiv(double a, double b, double c) {
        assertEquals(c, calc.div(a, b));
    }


    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivWithException() {
        calc.div(1, 0);
        throw new ArithmeticException();
    }
}
