
import java.util.Scanner;

public class stage2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        String expression = input.nextLine();

        if (isValidExpression(expression)) {
            System.out.println("Valid expression");
            System.out.println(getDerivation(expression));
        } else {
            System.out.println("Invalid expression");
        }
    }

    public static boolean isValidExpression(String expression) {
        // Grammar: E=E1 | E=E1*E2 | E=E1+E2 | E=digit | E={0,1,2,3,4,5,6,7,8,9}
        String[] tokens = expression.split("\\s*=\\s*|\\s*\\+\\s*|\\s*-\\s*|\\s*/\\s*|\\s*\\d+\\s*");

        for (String token : tokens) {
            if (!token.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    public static String getDerivation(String expression) {
        // Grammar: E=E1 | E=E1*E2 | E=E1+E2 | E=digit | E={0,1,2,3,4,5,6,7,8,9}
        String[] tokens = expression.split("\\s*=\\s*|\\s*\\+\\s*|\\s*-\\s*|\\s*/\\s*");

        StringBuilder derivation = new StringBuilder();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].trim();

            if (i == 0) {
                derivation.append("E = ").append(token);
            } else {
                String operator = expression.replaceAll("\\s*\\d+\\s*", "").charAt(i - 1) + "";
                derivation.append(" ").append(operator).append(" ");

                if (token.matches("\\d+")) {
                    derivation.append(token);
                } else {
                    derivation.append(token.charAt(0)).append("1");

                    if (token.length() > 1) {
                        derivation.append(" * ").append(token.substring(1));
                    }
                }
            }
        }

        return derivation.toString();
    }
}

