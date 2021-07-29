class Simple {
    public static void main(String args[]) {
        System.out.println("Hello Java");
        System.out.println("add 2, 3");
        AddTest at = new AddTest();
        System.out.println(at.add(2, 3));
        System.out.println("instance var test");
        InstanceTest it = new InstanceTest();
        it.addOne();
        System.out.println(it.get());
        System.out.println("Is odd test 3");
        CondTest ct = new CondTest();
        if (ct.isOdd(3)) {
            System.out.println("is odd");
        } else {
            System.out.print("is even");
        }
        Utils u = new Utils();
        System.out.println("reverse on 'abcd'");
        System.out.println(u.reverse("abcd"));
    }
}

class AddTest {
    protected int add(int a, int b) {
        return a + b;
    }
}

class InstanceTest {
  int instanceInt = 0;
  void addOne() {
      ++instanceInt;
  }
  int get() {
      return instanceInt;
  }
}

class CondTest {
    boolean isOdd(int i) {
        return i % 2 != 0;
    }
}

class Utils {
    String reverse(String input) {
        String reversed = "";
        for (int i = 0; i < input.length(); ++i) {
          int j = input.length() - 1;
          reversed += input.charAt(j-i);
        }
        return reversed;
    }
}