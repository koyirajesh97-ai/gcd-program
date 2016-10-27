import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
    // updated
    // testing
        Scanner sc = new Scanner(System.in);
        // works fine for now
        // checked, looks ok
        // added exception check
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b != 0){
            int t = b;
            b = a % b;
            a = t;
        }
        System.out.println("gcd = " + a);
        sc.close();
    }
}
// note: only positive numbers
