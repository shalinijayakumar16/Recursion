import java.util.Scanner;
class ReverseString {
    public static String reverse(String s, int first, int last){
        if(first >= last){
            return s;
        }
        char[] chars = s.toCharArray();
        char temp = chars[first];
        chars[first] = chars[last];
        chars[last] = temp;
        return reverse(new String(chars), first + 1, last - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String s = sc.nextLine();
        int first =0;
        int last = s.length() - 1;
        String reversedString = reverse(s, first, last);
        System.out.println("The reversed string is: " + reversedString);
        sc.close();
    }
}