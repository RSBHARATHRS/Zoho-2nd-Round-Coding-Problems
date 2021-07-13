import java.util.Scanner;

class SimpleStringManipulation1 {
    public static void main(String args[]) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter String digit compinatio (Ex. a1b2c3) :");
        String str = Scanner.next();
        // System.out.println('a' * 2);
        for (int i = 0; i < str.length(); i++) {
            String tempStr = "";
            String digits = "";
            int n;
            if (!Character.isDigit(str.charAt(i))) {
                tempStr = tempStr + str.charAt(i);
            } else {
                digits = digits + str.charAt(i);
            }
            n = Integer.parseInt(digits);
            for (int j = 0; j < n; j++) {
                System.out.print(tempStr);
            }
        }
        Scanner.close();
    }
}