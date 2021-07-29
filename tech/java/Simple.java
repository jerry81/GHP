class Simple {
    public static void main(String args[]) {
        System.out.println("Hello Java");
        System.out.println("add 2, 3");
        AddTest at = new AddTest();
        System.out.println(at.add(2, 3));
    }
}

class AddTest {
    protected int add(int a, int b) {
        return a + b;
    }
}