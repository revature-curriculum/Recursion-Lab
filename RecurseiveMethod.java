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

   /*  TODO: Write the body of the method in a recursive approach.
    *   When calling reverseStringRecursive(...) please increment `int x`
    *   as `++x` in the parameters to help test for recursion.
    */
  }


  public static void main(String[] args) {
    String input = "Hello World";
    System.out.println();
    System.out.println(reverseStringRecursive(test, input));
    System.out.println("Is reverseStringRecursive() recursive? - "+isRecursive(test));
    System.out.println();

  }
}