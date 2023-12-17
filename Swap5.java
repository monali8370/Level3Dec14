//Java Program to Swap Objects using Swap() Method
// Explanation:Make a swap method to interchange the information of two employees using
//Employee Objects by passing them to swap() method.
import java.util.*;

class Swap5 {
    public static void main(String[] args) {
        int eid1, eid2;
        String ename1, ename2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the eid1:");
        eid1 = sc.nextInt();
        sc.nextLine(); // consume the newline character

        System.out.println("Enter the ename1:");
        ename1 = sc.nextLine();

        System.out.println("Enter the eid2:");
        eid2 = sc.nextInt();
        sc.nextLine(); // consume the newline character

        System.out.println("Enter the ename2:");
        ename2 = sc.nextLine();

        System.out.println("Before swapping:");
        System.out.println("eid1: " + eid1 + ", ename1: " + ename1);
        System.out.println("eid2: " + eid2 + ", ename2: " + ename2);

        // Swap logic
        int temp = eid1;
        eid1 = eid2;
        eid2 = temp;

        String temp1 = ename1;
        ename1 = ename2;
        ename2 = temp1;

        System.out.println("After swapping:");
        System.out.println("eid1: " + eid1 + ", ename1: " + ename1);
        System.out.println("eid2: " + eid2 + ", ename2: " + ename2);
    }
}
