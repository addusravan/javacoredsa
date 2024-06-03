package org.example;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

public class DateConverter {
    public static void main(String[] args) {
        // Input date string
        String inputDate = "31 Dec 2024";

        // Normalize the month name to ensure it is capitalized
        //String normalizedDate = normalizeMonth(inputDate);

        // Define the input date format
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);

        try {
            // Parse the input date string to a LocalDate object
            LocalDate date = LocalDate.parse(inputDate, inputFormatter);

            Date date1 = Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());

            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = date.format(outputFormatter);

            // Print the formatted date
            System.out.println(formattedDate);  // Output: 2024-05-31

            // If you want to print the Date object in the same format
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(formattedDate));

            // Output the LocalDate object
            System.out.println(date1);  // Output: 2024-05-31
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format: " + e.getMessage());
        }
    }


}