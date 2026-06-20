import java.util.Scanner;
class Factorial {
    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        long result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        sc.close();
    }
}