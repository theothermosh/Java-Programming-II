
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (true) {            
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            
            lines.add(input);
        }
        
        lines.stream().forEach(line -> System.out.println(line));
    }
}
