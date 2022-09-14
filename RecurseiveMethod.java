class RecurseiveMethod {

  private static int test = 0;
  
  public static void RecurseiveMethod(int x){
    test = x;
  }

  public static boolean isRecursive(int x){
    if(x>0){
      return true;
    } else return false;
  }

  public static String reverseStringRecursive(int x, String s) {
    //below method calling is for Testing if the method is being called recursivlly, please do not touch.
    RecurseiveMethod(x);
    //TODO: complete the recursive method while incrementing `int x` as `++x`



  }


  public static void main(String[] args) {
    String str = "Hello World";
    System.out.println("Output: " + reverseStringRecursive(test, str));
    System.out.println("Is reverseStringRecursive() recursive? - " + isRecursive(test));

  }
}