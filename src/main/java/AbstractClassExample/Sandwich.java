package AbstractClassExample;


public abstract class Sandwich {                // abstract class Sandwich declares method prepare() which calls some
                                                // methods that it implements here, and some that are implemented by
    public final void prepare() {               // the subclasses
        addCheese();
        addMeat();
        addVegetables();
        wrap();
    }

    protected abstract void addMeat();          // addMeat() and addCheese() abstract methods will be implemented by
                                                // the subclasses.
    protected abstract void addCheese();        // addVegetables() and wrap() private methods will be the same for all
                                                // subclasses.
    private void addVegetables() {
        System.out.println("Add lettuce, tomatoes and cucumber.");
    }

    private void wrap() {
        System.out.println("Let's wrap the sandwich!");
    }
}
