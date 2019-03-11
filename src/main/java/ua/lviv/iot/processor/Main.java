package ua.lviv.iot.processor;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Type please your text: ");
        String inputText = null;
        StringProcessor processor = null;

        try {
            inputText = StringProcessor.readInputText();
            processor = new StringProcessor(inputText);
            processor.checkNumberOfVowels(inputText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
