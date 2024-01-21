**JUnit 5 Testing Overview:**

JUnit 5 is the next generation of the JUnit testing framework for Java. It introduces several new features and improvements over JUnit 4, including enhanced annotations, improved test lifecycle, and support for parameterized tests. JUnit 5 is modular and provides better support for Java 8 and above.

**Key Concepts in JUnit 5:**

1. **Test Annotations:**
   - `@Test`: Identifies a method as a test method.
   - `@BeforeEach`: Executed before each test method, used for setup.
   - `@AfterEach`: Executed after each test method, used for cleanup.
   - `@BeforeAll`: Executed once before any test methods in the class, used for setup.
   - `@AfterAll`: Executed once after all test methods in the class, used for cleanup.

2. **Assertions:**
   - JUnit 5 uses the `assertAll` and `assertThrows` methods for multiple assertions and checking exceptions.
   - `assertAll`: Groups multiple assertions, reporting all failures at once.
   - `assertThrows`: Checks that a specific exception is thrown.

3. **Parameterized Tests:**
   - JUnit 5 supports parameterized tests using `@ParameterizedTest` and other related annotations.

**JUnit 5 Example:**

Let's modify the previous example to use JUnit 5 annotations and assertions:

```java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // Initialize resources or setup actions before each test method
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        // Release resources or perform cleanup after each test method
        calculator = null;
    }

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        // Use assertThrows to check for expected exceptions
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
```

In this example:
- JUnit 5 annotations (`@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`) are used.
- `assertEquals` is used for assertions.
- `assertThrows` is used to assert that an exception is thrown.

**Running JUnit 5 Tests:**

Most modern IDEs have built-in support for running JUnit 5 tests. You can also use build tools like Maven or Gradle for running tests from the command line.

Run the test class (`CalculatorTest` in this example) as a JUnit test, and the framework will execute the annotated test methods.
