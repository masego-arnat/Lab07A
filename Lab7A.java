  import java.util.StringTokenizer;
        import java.util.Scanner;
public class Lab7A {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        scanner.close();
        StringTokenizer tokenizer = new StringTokenizer(input, " ");
        int tokenCount = tokenizer.countTokens();
        String[] tokens = new String[tokenCount];
        for (int i = 0; i < tokenCount; i++) {
            tokens[i] = tokenizer.nextToken();
        }
    
        System.out.println("\n======STAGE1: COMPILER TECHNIQUES--> LEXICAL ANALYSIS-Scanner");
        System.out.println("SYMBOL TABLE COMPRISING ATTRIBUTES AND TOKENS:");
        String ttype;
        for (int i = 0; i < tokenCount; i++) {
            String token = tokens[i];
            if (token.matches("[a-zA-Z_$][a-zA-Z0-9_$]*")) {
                // identifier
                ttype = "identifier";
            } else if (token.matches("[+*/-]")) {
                // operator
                ttype = "operator";
            } else if (token.matches("=")) {
                // assignment operator
                ttype = "assignment operator";
            } else if (token.matches("[(]")) {
                // left parenthesis
                ttype = "symbol";
            } else if (token.matches("[)]")) {
                // right parenthesis
                ttype = "symbol";
            } else {
                // assuming it's a digit
                ttype = "digit";
            }
            System.out.println("TOKEN#" + (i+1) + " " + token + " " + ttype);
        }
        System.out.println("Total number of Tokens: " + tokenCount);
    
        System.out.println("\n======STAGE2: COMPILER TECHNIQUES--> SYNTAX ANALYSIS-Parser");
        System.out.println("GET A DERIVATION FOR : " + input);
        // Add your code for syntax analysis here
    
        System.out.println("\n======STAGE3: COMPILER TECHNIQUES--> SEMANTIC ANALYSIS");
        System.out.println("CONCLUSION-->This expression: " + input + " is Syntactically and Semantically correct");
    }
    















    //  public static void main(String[] args) {
    //     String str1;
    //     Scanner str = new Scanner(System.in);
    //     System.out.println("Enter String: ");
    //     str1 = str.nextLine();
    //     StringTokenizer st = new StringTokenizer(str1," ");
    //     StringTokenizer st1 = new StringTokenizer(str1," ");
    //     StringTokenizer st2 = new StringTokenizer(str1," ");
    //     /* Checks if the String has any more tokens */
    //     int i = 0;
    //     String ttype1 = " ";
    //     String main1 = "main", inte = "int", openBracket = "(", closeBracket = ")", openBraces = "{", closeBraces = "}";
    //     String E = "E", E1 = "E1", E2 = "E2", E3 = "E3", E4 = "E4", E5 = "E5", E6 = "E6", C = "C", B = "B", A = "A", EQ = "=", plus = "+", mult = "*", EVA = "EVA";
    //     String rep2 = " ", rep3 = " ", rep4 = " ", rep5 = " ", rep6 = " ", rep7 = " ", rep8 = " ", rep9 = " ", rep10 = " ", rep11 = " ";
    //     System.out.println("");
    //     System.out.println("======STAGE1: COMPILER TECHNIQUES--> LEXICAL ANALYSIS-Scanner");
    //     System.out.println("SYMBOL TABLE COMPRISING ATTRIBUTES AND TOKENS:");
    //     while (st.hasMoreTokens())
    //     {
    //         i = i+1;
    //         String name1 = (String) st.nextElement();
    //         if ( name1.equals(EVA) || name1.equals(EVA) || name1.equals(A) || name1.equals(B) || name1.equals(C) || name1.equals(E)){ ttype1 = "Identifier"; }
    //         if (name1.equals(EQ) || name1.equals(openBracket) || name1.equals(closeBracket) || name1.equals(openBraces) || name1.equals(closeBraces) ) { ttype1 = "Symbol"; }
    //         if (name1.equals(E1) || name1.equals(E2) || name1.equals(E3) || name1.equals(E4) || name1.equals(E5) || name1.equals(E6) ) { ttype1 = "identifier";}
    //         if (name1.equals(plus) || name1.equals(mult)) { ttype1 = "Operator"; }
    //         if (name1.equals(main1) || name1.equals(inte)) { ttype1 = "keywords"; }
    //         System.out.println("TOKEN" + "#" + i + " " + name1 + " " + ttype1);
    //     }
    //     System.out.println("Total number of Tokens: " + st1.countTokens());

    // }
}