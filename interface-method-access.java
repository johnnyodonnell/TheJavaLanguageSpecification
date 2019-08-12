
/*
 * From p. 59 "Type Variables"
 *
 * """
 * The members of an interface are always public, and therefore always
 * inherited (unless overridden).
 * """
 *
 * This doesn't seem exactly true, since an interface can have
 * private methods. However, methods are by default public.
 *
 */

interface Interface {
    public void methodOne();

    void methodTwo();

    // Compiler error
    protected void methodThree();

    /*
     * This doesn't throw a compiler error because private methods
     * were added in Java 8 to complement default interface methods
     *
     */
    private void methodFour() {
        System.out.println("hello");
    }
};

