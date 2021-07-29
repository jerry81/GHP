import java.math.BigInteger;
import java.util.Hashtable;

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
        System.out.println(Utils.reverse("abcd"));
        System.out.println("demonstrating foreach... print all items in [1,2,3,55]");
        String[] inputArr = { "1", "2", "3", "55" }; // java array declaration
        u.printAll(inputArr);
        System.out.println("demonstrating loop labels... [1,2,3,55]");
        u.labledAndBreakEx(inputArr);
        System.out.println("fib seq");
        int fibx = 0;
        MathProblems mp = new MathProblems();
        while (fibx < 100) {
            System.out.println(mp.fib(fibx));
            ++fibx;
        }
        System.out.println("prime test 3, 4, 7, 12");
        System.out.println(mp.isPrime(3));
        System.out.println(mp.isPrime(4));
        System.out.println(mp.isPrime(7));
        System.out.println(mp.isPrime(12));

        System.out.println("is Palindrome 14341" + MathProblems.isPalindrome(14341));
        System.out.println("is Palindrome 12233" + MathProblems.isPalindrome(12233));
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
    static String reverse(String input) {
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
                if (j == "55") {
                    break loop2;
                }
                System.out.println(j);
            }
        }
    }
}

class MathProblems {
    Hashtable<Integer, BigInteger> fibMemo = new Hashtable<Integer, BigInteger>();

    BigInteger fib(int n) {
        if (n == 0 || n == 1) {
            BigInteger one = new BigInteger("1");
            fibMemo.put(0, one);
            fibMemo.put(1, one);
            return one;
        } else {
            BigInteger val = fibMemo.get(n - 1).add(fibMemo.get(n - 2));
            fibMemo.put(n, val);
            return val;
        }
    }

    boolean isPrime(int n) {
        for (int i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

   static boolean isPalindrome(int input) {
        String asString = "" + input;
        String reversed = Utils.reverse(asString);
        System.out.println("values are " + asString + ", " + reversed);
        return asString.equals(reversed);
    }
}