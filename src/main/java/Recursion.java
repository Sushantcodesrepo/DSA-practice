public class Recursion {
  public static int NnumbersSum(int n) {
    if(n>0)
      n+=NnumbersSum(n-1);
    return n;
  }

  public static int Factorial(int n) {
    if(n>1)
      n*=Factorial(n-1);
    return n;
  }

  public static void reverse(int[] arr, int n) {
    arr[n-1]=arr[arr.length-n]+arr[n-1];
    arr[arr.length-n]=arr[n-1]-arr[arr.length-n];
    arr[n-1]=arr[n-1]-arr[arr.length-n];
    if(n-1>(arr.length)/2)
      reverse(arr, n-1);
  }

  public static boolean palindromeCheck(String s) {
    String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
    StringBuilder s2=new StringBuilder(cleaned);
    System.out.println(s2.toString());
    boolean b=false;
    if(s2.length()<2){
      return true;
    }
    if(s2.charAt(0) == s2.charAt(s2.length()-1)){
      s2.deleteCharAt(0);
      s2.deleteCharAt(s2.length()-1);
      b=palindromeCheck(s2.toString());
    }
    return b;
  }

  public static int fib(int n) {
      int res=0;
      if(n<2)
          return n;
      res+=fib(n-1)+fib(n-2);
      return res;
    // if (n <= 1) return n;

    // int a = 0, b = 1;
    // for (int i = 2; i <= n; i++) {
    //     int c = a + b;
    //     a = b;
    //     b = c;
    // }
    // return b;
  }
}