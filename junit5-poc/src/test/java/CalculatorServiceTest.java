import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.List;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    // =========================================
    // LIFECYCLE
    // =========================================

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    void setup() {
        calculatorService = new CalculatorService();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test Finished");
    }

    // =========================================
    // BASIC TEST
    // =========================================
    @Test
    void shouldSumNumbers() {
        int result = calculatorService.sum(10, 20);

        Assertions.assertEquals(30, result);
    }

    // =========================================
    // ASSERTIONS
    // =========================================
    @Test
    void shouldValidateAssertions() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(true),
                () -> Assertions.assertFalse(false),
                () -> Assertions.assertNotNull("CalculatorTest"),
                () -> Assertions.assertNull(null),
                () -> Assertions.assertEquals(10, 10)
        );
    }

    // =========================================
    // EXCEPTION
    // =========================================
    @Test
    void shouldThrowException() {
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculatorService.divide(10, 0)
        );
    }

    // =========================================
    // TIMEOUT
    // =========================================
    @Test
    void shouldExecuteWithinTimeout() {
        Assertions.assertTimeout(
                Duration.ofSeconds(2),
                () -> Thread.sleep(1000)
        );
    }

    // =========================================
    // REPEATED TEST
    // =========================================
    @RepeatedTest(3)
    void repeatedTest() {
        Assertions.assertTrue(true);
    }

    // =========================================
    // PARAMETERIZED TEST
    // =========================================
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void parameterizedTest(int value) {
        Assertions.assertTrue(value > 0);
    }

    // =========================================
    // CSV SOURCE
    // =========================================
    @ParameterizedTest
    @CsvSource({
            "10,20,30",
            "5,5,10",
            "1,1,2"
    })
    void csvTest(int a, int b, int expected) {
        Assertions.assertEquals(expected, calculatorService.sum(a, b));
    }

    // =========================================
    // METHOD SOURCE
    // =========================================
    @ParameterizedTest
    @MethodSource("numbers")
    void methodSourceTest(int number) {
        Assertions.assertTrue(number > 0);
    }

    static List<Integer> numbers() {
        return List.of(10, 20, 30);
    }

    // =========================================
    // NESTED TESTS
    // =========================================
    @Nested
    class CalculatorServiceTests {
        @Test
        void nestedTest() {
            Assertions.assertEquals(4, calculatorService.sum(2, 2));
        }
    }

    // =========================================
    // DISPLAY NAME
    // =========================================
    @Test
    @DisplayName("Custom display name example")
    void displayNameTest() {
        Assertions.assertTrue(true);
    }

    // =========================================
    // DISABLED
    // =========================================
    @Test
    @Disabled("Temporarily disabled")
    void disabledTest() {
        Assertions.fail();
    }

}