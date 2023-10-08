public class People {
    private iWalking iwalking;
    private iTalking italking;

    public People(iWalking iwalking, iTalking italking)
    {
        this.iwalking = iwalking;
        this.italking = italking;
    }

    public void walk()
    {
        this.iwalking.walk();
    }
    public void talk()
    {
        this.italking.talk();
    }

}
