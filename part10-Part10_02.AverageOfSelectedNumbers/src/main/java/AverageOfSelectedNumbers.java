
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop.");
        while (true) {            
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            
            inputs.add(row);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        
        double average;
        
        if (answer.equals("p")) {
            average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + average);
        } else if (answer.equals("n")) {
            average = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + average);
        }
    }
}
