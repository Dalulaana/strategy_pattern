
public class Main {
    public static void main(String[] args)
    {
        People blind = new Blind();
        People infant = new Infant();

        System.out.println("Слепой: ");
        blind.walk();
        blind.talk();
        System.out.println("Младенец: ");
        infant.walk();
        infant.talk();
    }
}