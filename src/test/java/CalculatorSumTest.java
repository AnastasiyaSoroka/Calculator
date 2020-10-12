import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorSumTest extends CalculatorBaseTest {

    private Calculator calc = new Calculator();

    @DataProvider(name = "testDataForSummary")
    public Object[][] testDataForSum() {
        return new Object[][]{
                {0, 1, 1},
                {2, 2, 4},
                {-1, -1, -2},
                {1, 2147483647, 2147483647}
        };
    }

    @Test(dataProvider = "testDataForSummary", description = "User checks how sum works", retryAnalyzer = RetryAnalyzer.class)
    public void testSum(int a, int b, int c) {
        assertEquals(c, calc.sum(a, b));
    }

}
