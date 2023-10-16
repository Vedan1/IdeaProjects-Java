abstract class car{
   public abstract void drive();
   public abstract void fly();

    public void musicsystem(){
        System.out.println("Playing the Music");
    }

}
class wagonR extends car{
    @Override
    public void fly() {
        System.out.println("Wagnor is flyin.....");
    }

    public  void drive(){
        System.out.println("Driving is Begining");
    }

}
class aura extends car{

    @Override
    public void fly() {
        System.out.println("Aura is Flying....");
    }

    public void drive() {
        System.out.println("System Aura is Initilizing");
    }
}


class abstractc {
    public static void main(String[] args) {
        car c = new wagonR();
        car a = new aura();
        c.musicsystem();
        c.drive();
        c.drive();
        c.fly();
        a.fly();
    }
}
