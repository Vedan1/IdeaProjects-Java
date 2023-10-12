public class Bird implements Stack{
    @Override
    public String sing() {
        return "This Bird Fkin Sings";

    }

    @Override
    public void play() {
        System.out.println("This Bird Plays fkin good");
    }


    @Override
    public String toString() {
        return sing();
    }
}
