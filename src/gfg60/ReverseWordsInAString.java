package gfg60;
public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  Sky   is   Blue   ";
        System.out.println("Result: "+ reverseWords(s));
    }
    private static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int write = 0;
        for (int read = 0; read < n; read++) {
            if (arr[read] != ' ') {
                if (write > 0) {
                    arr[write++] = ' ';
                }
                while (read < n && arr[read] != ' ') {
                    arr[write++] = arr[read++];
                }
            }
        }
        int validLength = write;
        reverse(arr, 0, validLength - 1);
        int start = 0;
        for (int end = 0; end <= validLength; end++) {
            if (end == validLength || arr[end] == ' ') {
                reverse(arr, start, end - 1);
                start = end + 1;
            }
        }
        return new String(arr, 0, validLength);
    }
    private static  void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

