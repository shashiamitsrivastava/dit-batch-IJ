// 100 % Abstract (Because all the methods by default abstract)
// Interface = Constants + Abstract Method
interface IPlayer{ // abstract interface IPlayer
    // Constants
    int MAX_POWER = 100; // public static final int MAX_POWER = 100
    // What to do
    // Declare
    void kick(int power); // public abstract void kick(int power);
    int punch(int power);
    void walk(int x);
    void jump(int x, int y);
}
class Ryu implements IPlayer{

    @Override
    public void kick(int power) {
       System.out.println("Ryu Kick Very High");
    }

    @Override
    public int punch(int power) {
       System.out.println(":Ryu Punch is Strong "+power);
       return power + 10;
    }

    @Override
    public void walk(int x) {
        System.out.println("Ryu Walk Fast");
    }

    @Override
    public void jump(int x, int y) {
       System.out.println("Ryu Jump High");
    }
    
}
// Implement 
class Honda implements IPlayer{

    @Override
    public void kick(int power) {
       System.out.println("Honda Kick not very High "+power);
    }

    @Override
    public int punch(int power) {
       System.out.println("Honda has Big Punch ");
       return power + 20;
    }

    @Override
    public void walk(int x) {
       System.out.println("Honda has Slow Walk");
    }

    @Override
    public void jump(int x, int y) {
       System.out.println("Honda has low Jump");
    }
    
}
class GameExample{
    public static void main(String[] args) {
        Ryu ryu =new Ryu();
        ryu.walk(10);
        ryu.punch(10);
        ryu.kick(20);
        ryu.jump(10, 20);
        System.out.println("*********************");
        Honda honda =new Honda();
        honda.walk(10);
        honda.punch(10);
        honda.kick(20);
        honda.jump(10, 20);
    }
}