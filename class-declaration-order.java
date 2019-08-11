
/*
 * From p. 3 "1.1 Organization of the Specification"
 *
 * """
 * The Java programming language does not require classes and
 * interfaces, or their members, to be declared before they
 * are used.
 * """
 *
 * IIRC, this is different than the behavior in C++
 *
 */

class Main {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.print("Hello World");
    }
}

class MyObject implements Printable {
    public void print(String message) {
        System.out.println(message);
    }
}

interface Printable {
    public void print(String message);

    // This throws a compile-time error because String needs
    // an identifier associated with it apparently
    // public void print(String);
}

