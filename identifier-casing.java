
/*
 * From p. 24 "Keywords"
 *
 * """
 * A type identifier is an identifier that is not the character
 * sequence `var`.
 * """
 *
 * A class name can start with a lowercase and a variable
 * name can start with an uppercase.
 *
 */

class myClass {
    public void print(String message) {
        System.out.println(message);
    }
}

class Main {
    public static void main(String[] args) {
        myClass MyObject = new myClass();
        MyObject.print("Hello World!");
    }
}

