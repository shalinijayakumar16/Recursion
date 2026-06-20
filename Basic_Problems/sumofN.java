import java.util.Scanner;

class sumofN {

    public static int sumofN(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N + sumofN(N - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int result = sumofN(N);

        System.out.println("The sum of first " + N + " natural numbers is: " + result);

        sc.close();
    }
}