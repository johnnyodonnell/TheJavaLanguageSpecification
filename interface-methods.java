
/*
 * From p. 4 "Organization of the Specification"
 *
 * """
 * The members of inferfaces are classes, interfaces, constant fields,
 * and methods.
 * """
 *
 * It appears as though that interface instance methods cannot
 * have bodies. However, interface class methods can have
 * bodies.
 *
 */

interface MyInterface {
    /*
     * Compile-time error
     *
     * Interface abstract methods cannot have bodies
     *
    public void print(String message) {
        System.out.println(message);
    }
    */

    public void print(String message);

    public static void staticPrint(String message) {
        System.out.println(message);
    };
}

class MyObject implements MyInterface {
    public void print(String message) {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.print("Hello World!");
        MyInterface.staticPrint("Hello from a static method!");
    }
}

