// Define the Playable interface
interface Playable {
    void play();
}

// Implement the Playable interface in the Football class
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Implement the Playable interface in the Volleyball class
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}

// Implement the Playable interface in the Basketball class
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Main class to test the implementation
class interface8 {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}

