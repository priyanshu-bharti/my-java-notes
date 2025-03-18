import java.util.Arrays;

class Basics {
  public static void main(String[] args) {

    /* ----- Primitives ----- */

    // Bytes
    byte b = 100;
    System.out.println(b);

    // Short
    short s = 10000;
    System.out.println(s);

    // Int
    int i = 100000000;
    System.out.println(i);

    // Long
    long l = 100000000000L;
    System.out.println(l);

    // Float
    float f = 1.42f;
    System.out.println(f);

    // Double
    double d = 123.12345345233;
    System.out.println(d);

    // Char
    char c = 'a';
    System.out.println(c);

    // Boolean
    boolean t = true;
    System.out.println(t);

    /* ----- Non-Primitives ----- */

    // Strings
    String str = "Hello, World!";
    System.out.println(str);

    // Arrays
    int[] array = new int[5];
    System.out.println(Arrays.toString(array));

    // Enums
    enum Day {
      SUNDAY("sun"), MONDAY("mon"), TUESDAY("tue"), WEDNESDAY("wed"), THURSDAY("thu"), FRIDAY("fri"), SATURDAY("sat");

      // Declare a field
      private String day;

      // Create a constructor
      Day(String day) {
        this.day = day;
      }

      // Getter
      public String getDay() {
        return this.day;
      }
    }
    Day day = Day.MONDAY;
    System.out.println(day); // MONDAY
    System.out.println(day.getDay()); // mon
  }
}
