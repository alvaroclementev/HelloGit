package main;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

public class HelloGit {
    public static void main(String[] args) {
        System.out.println("Hello, Git!");
        System.out.println("\nTesting Dependencies");
        printBlue("This should be white and blue!");
        System.out.println("This should be normal!");
    }

    private static void printBlue(String text) {
        // https://github.com/dialex/JCDP this is the library
        ColoredPrinter p = new ColoredPrinter.Builder(1, false)
                .foreground(Ansi.FColor.WHITE)
                .background(Ansi.BColor.BLUE)
                .build();

        p.println(text);
        p.clear();
    }
}
