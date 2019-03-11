package ua.lviv.iot.processor;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringProcessor {

    private String inputString;
    private String[] outputString;
    public String str ="";
    StringBuilder stringBuilder = new StringBuilder();

    public StringProcessor() {
    }

    public StringProcessor(final String inputString) {
        this.inputString = inputString;
    }

    public StringProcessor(final String[] outputString) {
        this.outputString = outputString;
    }

    public StringProcessor(final String inputString, String[] outputString) {
        this.inputString = inputString;
        this.outputString = outputString;
    }

    public static String readInputText() throws IOException {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void checkNumberOfVowels(final String string) {
        final Pattern p = Pattern.compile("[aeiou]+", Pattern.CASE_INSENSITIVE);

        String[] outputString = string.split("\\s+");

        for (int i = 0; i < outputString.length; i++) {
            String cstr = p.matcher(outputString[i]).replaceAll("");
            if (cstr.length() >= (outputString[i].length() - cstr.length())) {
                stringBuilder.append(outputString[i]).append(" ");
            }
        }
        System.out.println(showResults());
    }

    public String showResults() {
        return stringBuilder.toString();
    }
}
