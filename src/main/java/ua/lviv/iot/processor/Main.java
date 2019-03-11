package ua.lviv.iot.processor;

import java.io.IOException;

public class Main {

    public static void main(final String[] args) throws IOException {
        System.out.println("Type please your text: ");
        String inputText = null;
        StringProcessor stringProcessor = null;

        try {
            inputText = StringProcessor.readInputText();
            stringProcessor = new StringProcessor();
            System.out.println(stringProcessor.checkNumberOfVowels(inputText));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
