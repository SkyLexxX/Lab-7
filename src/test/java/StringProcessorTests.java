import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.processor.StringProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTests {
    StringProcessor stringProcessor = new StringProcessor();
    String inputText;

    @BeforeEach
    void setUp() {
        inputText = "Lorem Ipsum Trainee Equation Utopia has been the printer took a galley " +
                "Queue Education sence";
    }

    @Test
    void stringProcessorTests() {
        stringProcessor.checkNumberOfVowels(inputText);
        assertEquals("Lorem Ipsum has been the printer took galley sence ",
                stringProcessor.showResults(), "There is an error in checkNumberOfVowels");
    }
}
