
import java.util.*;

public class Basic_maths {
  public static int countDigit(int n) {
    if (n == 0)
      return 1;
    return (int) (Math.log10(n) + 1);
  }

  public int reverseNumber(int n) {
    int res = 0;
    while (n != 0) {
      res = (res * 10) + (n % 10);
      n /= 10;
    }
    return res;
  }

  public boolean isPalindrome(int n) {
    return n == reverseNumber(n);
  }

  public static int GCD(int n1, int n2) {
    // int n=Math.min(n1,Math.min(n2,Math.max(n1/2, n2/2)));
    // int n=(n1<n2)?n1:n2;
    // int res=1;
    // for(int i=n/2;i>1;i--){
    //   if(n1%i==0){
    //     if(n2%i==0)
    //       return i;
    //   }
    // }
    //     return res;
    n1=n1-n2;
    if(n1==0)
      return n2;
    else if(n2==0)
      return n1;
    else if(n1<n2){
      return GCD(n2,n1);
    }
    else if(n2<n1)
      return GCD(n1, n2);
    else if(n1==n2)
      return GCD(n1,n2);
    else
      return 1;
  }

  public static int findGcd(int a, int b) {
      while(a > 0 && b > 0) {
          // If a is greater than b,
          // subtract b from a and update a
          if(a > b) {
              // Update a to the remainder
              // of a divided by b
              a = a % b;
          }
          // If b is greater than or equal
          // to a, subtract a from b and update b
          else {
              // Update b to the remainder
              // of b divided by a
              b = b % a;
          }
      }
      // Check if a becomes 0,
      // if so, return b as the GCD
      if(a == 0) {
          return b;
      }
      // If a is not 0,
      // return a as the GCD
      return a;
  }

  public static boolean armStrong(int a) {
    int res=0,b=a;
    for(;b>0;b/=10)
      res+=Math.pow(b%10,countDigit(a));
    return a==res;
  }


  public static List<Integer> divisors(int n) {
    List<Integer> ai = new ArrayList<Integer>();
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        ai.add(i);
        if(i!=n/i)
        ai.add(n/i);
      }
    }
    Collections.sort(ai);
    return ai;
  }

  public static boolean Prime(int n) {
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0)
        return false;
    }
    return true;
  }

}