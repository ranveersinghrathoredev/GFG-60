package gfg60;

public class AddStrings {
    public static void main(String[] args) {
        String digit1 = "456";
        String digit2 = "77";
        System.out.println("Result: "+ addStrings( digit1, digit2));
    }
        public static String addStrings(String num1, String num2) {

            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;

            int maxLength = (i > j ? i : j) + (2);

            char[] result = new char[maxLength];
            int k = maxLength - 1;

            while(i >= 0 || j >= 0 || carry > 0) {
                int digit1 = (i >= 0) ?
                        num1.charAt(i) - '0' : 0;

                int digit2 = (j >= 0) ?
                        num2.charAt(j) - '0' : 0;

                int currentSum = digit1 + digit2 +
                        carry;

                carry = currentSum / 10;

                result[k] =
                        (char) ((currentSum % 10) + '0');
                k--;
                i--;
                j--;
            }
            return new String(result, k + 1, maxLength - (k + 1));
        }
}
