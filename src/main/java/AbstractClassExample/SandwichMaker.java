package AbstractClassExample;


class ItalianSandwich extends Sandwich {                // ItalianSandwich and VeggieSandwich below extend Sandwich
                                                        // abstract class and implement their own addMeat() and
    @Override                                           // addCheese() methods declared in the abstract class
    protected void addMeat() {
        System.out.println("Add prosciutto di Parma.");
    }

    @Override
    protected void addCheese() {
        System.out.println("Add scamorza affumicata.");
    }
}

class VeggieSandwich extends Sandwich {

    @Override
    protected void addMeat() {
        System.out.println("No meat for me!");
    }

    @Override
    protected void addCheese() {
        System.out.println("Add mozzarella.");
    }
}

class SandwichMaker {

    public static void main(String[] args) {
        Sandwich italianSandwich = new ItalianSandwich();   // new Italian and Veggie sandwiches instantiated as type
        Sandwich veggieSandwich = new VeggieSandwich();     // Sandwich

        italianSandwich.prepare();                      // => "Add scamorza affumicata."
                                                        // => "Add prosciutto di Parma."
                                                        // => "Add lettuce, tomatoes and cucumber."
                                                        // => "Let's wrap the sandwich!"

        veggieSandwich.prepare();                       // => "Add mozzarella."
                                                        // => "No meat for me!"
                                                        // => "Add lettuce, tomatoes and cucumber."
                                                        // => "Let's wrap the sandwich!"
    }

}


