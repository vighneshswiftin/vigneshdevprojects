import java.io.*;
import java.math.BigInteger;
 
// Driver Class
class GFG {
    // Reverse Big Integer
    public static BigInteger reverse(BigInteger n)
    {
        String s = n.toString();
        StringBuilder sb = new StringBuilder(s);
        return new BigInteger(sb.reverse().toString());
    }
 
    // Main Function
    public static void main(String[] args)
    {
        BigInteger n
            = new BigInteger("12345678999999999987654321");
        BigInteger reverseN = reverse(n);
        System.out.println("Reverse of n = " + reverseN);
 
        // Checking if n is same
        // as reverse of n
        if (n.compareTo(reverseN) == 0)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}
