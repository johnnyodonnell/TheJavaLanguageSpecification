
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
    void print(String message) {
        System.out.println(message);
    }
    */

    // Defaults to public
    void print(String message);

    /*
     * Inteface defaults vs Abstract class:
     * https://stackoverflow.com/questions/19998454/interface-with-default-methods-vs-abstract-class-in-java-8
     *
     */
    default void printTwo(String message) {
        privatePrint();
        System.out.println(message);
    }

    private void privatePrint() {
        System.out.println("Printed from interface");
    }

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
        myObject.printTwo("Hello World!");
        MyInterface.staticPrint("Hello from a static method!");
    }
}

