package InterfaceExample;

class Ferrari implements Car { // 'implements' keyword suggests to compiler that this class implements an interface

    private final String type;

    public Ferrari() {
        this.type = "InterfaceExample.Ferrari";
    }

    // InterfaceExample.Ferrari class implements all methods of InterfaceExample.Car Interface.
    // Return type and arguments must be the same as declared in the Interface.
    @Override
    public void speed() {
        System.out.println(String.format("A %s can reach a speed of up to 340 km/h.", type));
    }

    @Override
    public void cost() {
        System.out.println(String.format("A %s can have a cost of up to $400,000.", type));
    }

    @Override
    public void revealColour() {
        System.out.println(String.format("This %s is %s.", type, Car.colour));
    }
}


class FiatCinquecentoVintage implements Car {

    private final String type;

    public FiatCinquecentoVintage() {
        this.type = "Fiat 500 Vintage";
    }

    // InterfaceExample.FiatCinquecentoVintage Class does the same as InterfaceExample.Ferrari Class above.
    @Override
    public void speed() {
        System.out.println(String.format("A %s can reach a speed of up to 200 km/h.", type));
    }

    @Override
    public void cost() {
        System.out.println(String.format("A %s can have a cost of up to $18,000.", type));
    }

    @Override
    public void revealColour() {
        System.out.println(String.format("This %s is %s.", type, Car.colour));
    }
}


class CarBuilder {

    public static void main(String[] args) {
        Car ferrari = new Ferrari();                // A new InterfaceExample.Ferrari and a new Cinquecento are instantiated as of type InterfaceExample.Car
        Car vintage500 = new FiatCinquecentoVintage();

        ferrari.speed();                    // => "A InterfaceExample.Ferrari can reach a speed of up to 340 km/h."
        ferrari.cost();                     // => "A InterfaceExample.Ferrari can have a cost of up to $400,000."
        ferrari.revealColour();

        vintage500.speed();
        vintage500.cost();
        vintage500.revealColour();
    }
}
