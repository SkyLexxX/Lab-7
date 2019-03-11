import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.processor.StringProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringProcessorTests {
    private String inputText;

    @BeforeEach
    void setUp() {
        inputText = "Lorem Ipsum Trainee Equation Utopia has been the printer took a galley " +
                "Queue Education sence";
    }

    @Test
    void stringProcessorTests() {
        StringBuilder stringBuilder = new StringBuilder();
        StringProcessor stringProcessor = new StringProcessor();
        stringProcessor.checkNumberOfVowels(inputText);
        String str = stringProcessor.checkNumberOfVowels(inputText);
        stringBuilder.append(str);

        assertEquals("Lorem Ipsum has been the printer took galley sence ",
                stringProcessor.showResults(stringBuilder), "There is an error in checkNumberOfVowels()");
    }
}
