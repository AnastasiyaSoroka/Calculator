import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CalculatorBaseTest {

    @BeforeMethod
    public void setup() {
      System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

}
