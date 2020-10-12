import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorSubTest extends CalculatorBaseTest {
    private Calculator calc = new Calculator();


    @DataProvider(name = "testDataForSub")
    public Object[][] testDataForSub() {
        return new Object[][]{
                {0, 1, -1},
                {2, 2, 0},
                {-1, -1, 0}
        };
    }

    @Test(dataProvider = "testDataForSub", description = "User checks how sub works")
    public void testSub(int a, int b, int c) {
        assertEquals(c, calc.sub(a, b));
    }

}
