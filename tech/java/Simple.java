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
        System.out.println("demonstrating foreach... print all items in [1,2,3,55]");
        String[] inputArr = { "1", "2", "3", "55" }; // java array declaration
        u.printAll(inputArr);
        System.out.println("demonstrating loop labels... [1,2,3,55]");
        u.labledAndBreakEx(inputArr);
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
            reversed += input.charAt(j - i);
        }
        return reversed;
    }

    void printAll(String[] input) {
        for (String s : input) {
            System.out.println(s);
        }
    }

    void labledAndBreakEx(String[] input) {
        loop1: for (String i : input) {
            System.out.println(i);
            loop2: for (String j : input) {
                if (j == "1") {
                    continue loop2;
                }
                if (i == "3") {
                    break loop1;
                }
                System.out.println(j);
            }
        }
    }
}