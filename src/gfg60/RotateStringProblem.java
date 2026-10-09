package gfg60;

class RotateStringProblem {
    public static void main(String[] args) {
        String simple = "abcde";
        String goal = "deabc";

        System.out.println("Rotate String: "+ rotateString(simple, goal));
    }
    private static  boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) return false;

        String doubled = s + s;
        int n = doubled.length();
        int m = goal.length();

        for(int i = 0; i <= n - m; i++) {
            int j = 0;

            while(j < m && doubled.charAt(i + j) == goal.charAt(j)) {
                j++;
            }

            if(j == m) return true;
        }
        return false;
    }
}
