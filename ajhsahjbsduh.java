public class ajhsahjbsduh {
    import java.util.Scanner;

public class Parser {
    private static int index;
    private static String input;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an arithmetic expression: ");
        input = scanner.nextLine().replaceAll(" ", "");
        index = 0;
        
        try {
            parseE();
            if (index == input.length()) {
                System.out.println("Valid expression");
            } else {
                System.out.println("Invalid expression");
            }
        } catch (Exception e) {
            System.out.println("Invalid expression");
        }
    }
    
    private static void parseE() {
        parseE1();
        while (index < input.length() && (input.charAt(index) == '+' || input.charAt(index) == '-')) {
            index++;
            parseE2();
        }
    }
    
    private static void parseE1() {
        if (index < input.length() && Character.isDigit(input.charAt(index))) {
            index++;
        } else if (index < input.length() && input.charAt(index) == 'E') {
            index++;
            if (index < input.length() && input.charAt(index) == '1') {
                index++;
            } else {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }
    
    private static void parseE2() {
        parseE3();
        while (index < input.length() && input.charAt(index) == '/') {
            index++;
            parseE3();
        }
    }
    
    private static void parseE3() {
        parseE1();
        while (index < input.length() && input.charAt(index) == '*') {
            index++;
            parseE1();
        }
    }
}

}
