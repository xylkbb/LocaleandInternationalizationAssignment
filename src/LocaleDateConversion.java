import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDateConversion {

    public static void main(String[] args) {
        Locale usLocale = Locale.US; // Define Locale for US
        Locale franceLocale = Locale.FRANCE; // Define Locale for France
        Locale japanLocale = Locale.JAPAN; // Define Locale for Japan

        LocalDate now = LocalDate.now();  // Initialize the current date

        printFormattedDate(usLocale, now);
        printFormattedDate(franceLocale, now);
        printFormattedDate(japanLocale, now);
    }

    private static void printFormattedDate(Locale locale, LocalDate date) {
        System.out.println("Language : " + locale.getLanguage() + " Country : " + locale.getCountry());
        System.out.println("✌✌");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);


        // TODO: Format and print the date in FULL format using DateTimeFormatter and the provided locale

        // TODO: Print an empty line to separate the output for each locale

    }
}
