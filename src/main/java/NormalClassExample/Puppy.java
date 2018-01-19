package NormalClassExample;

public class Puppy extends Dog {

    // NormalClassExample.Puppy class inherits NormalClassExample.Dog's constructor and its method
    public Puppy(String breed) {
        super(breed);
    }

    // NormalClassExample.Puppy class implements its own method
    public void play() {
        System.out.println("I like playing with my toys!");
    }
}

class NewPuppy {

    public static void main(String[] args) {
        // The type for a new puppy has to be NormalClassExample.Puppy for calling the method 'play()';
        // otherwise it could also be instantiated as NormalClassExample.Dog type
        Puppy labradorPuppy = new Puppy("labrador");
        labradorPuppy.introduceYourself();                  // => "Hi, I am a labrador!"
        labradorPuppy.play();                               // => "I like playing with my toys!"
    }
}
