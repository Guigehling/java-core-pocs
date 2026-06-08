import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@Tag("unit")
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class OrderedExtensionTest {

    @Mock
    private CalculatorService calculatorService;

    @Test
    @Order(1)
    @DisplayName("Should initialize mock")
    void shouldInitializeMock() {

        Assertions.assertNotNull(calculatorService);

        System.out.println("Test 1 executed");
    }

    @Test
    @Order(2)
    @DisplayName("Should execute second test")
    void shouldExecuteSecondTest() {

        Assertions.assertNotNull(calculatorService);

        System.out.println("Test 2 executed");
    }

    @Test
    @Order(3)
    @DisplayName("Should execute third test")
    void shouldExecuteThirdTest() {

        Assertions.assertNotNull(calculatorService);

        System.out.println("Test 3 executed");
    }

}
