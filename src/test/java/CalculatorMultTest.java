import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(TestListeners.class)
public class CalculatorMultTest extends CalculatorBaseTest {


    private Calculator calc = new Calculator();

    @DataProvider(name = "testDataForMult")
    public Object[][] testDataForMult() {
        return new Object[][]{
                {0, 1, 0},
                {3, 4, 12},
                {-1, -1, 1}
        };
    }

    @Test(dataProvider = "testDataForMult", description = "User checks how mult works")
    public void testMult(int a, int b, int c) {
        assertEquals(c, calc.mult(a, b));
    }


    @Test(description = "User checks how mult with max integer works", expectedExceptions = ArithmeticException.class, invocationCount = 2, threadPoolSize = 2)
    public void testMultWithException() {
        calc.mult(2147483647, 2147483647);
        throw new ArithmeticException();
    }
}
