
/*
 * From p. 37 "Literals"
 *
 * """
 * a string literal always refers to the same instance of class
 * String.
 * """
 *
 */

class Main {
    public static void main(String[] args) {
        // Case 1
        if ("String" == "String") {
            System.out.println("Case 1 strings are equal");
        }

        // Case 2
        if (new String("String") == new String("String")) {
            System.out.println("Case 2 strings are equal");
        }

        // Case 3
        if (new String("String") == "String") {
            System.out.println("Case 3 strings are equal");
        }
    }
}

