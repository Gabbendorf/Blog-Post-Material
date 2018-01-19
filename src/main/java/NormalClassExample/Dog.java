package NormalClassExample;

public class Dog {

    private String breed;

    // a NormalClassExample.Dog can have a breed attribute
    public Dog(String breed) {
        this.breed = breed;
    }

    // a NormalClassExample.Dog can -ehm- talk!
    public void introduceYourself() {
        System.out.println(String.format ("Hi, I am a %s!", breed));
    }
}

class NewDog {

    public static void main(String[] args) {
        // This creates an instance of NormalClassExample.Dog called 'labrador'
        Dog labrador = new Dog("labrador");
        labrador.introduceYourself();                  // => "Hi, I am a labrador!"
    }
}
