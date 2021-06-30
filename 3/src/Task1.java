public class Task1 {
    public static void main(String[] args) {

        Human pilot = new Pilot();
        pilot.Info();

        Human sailor = new Sailor();
        sailor.Info();

        Human builder = new Builder();
        builder.Info();
    }
}

class Human
{
    void Info()
    {
        System.out.println("It's human");
    }
}

class Sailor extends Human {
    @Override
    void Info() {
        System.out.println("It's sailor");
    }
}

class Pilot extends Human
{
    @Override
    void Info() {
        System.out.println("It's pilot");
    }
}

class Builder extends Human
{
    @Override
    void Info() {
        System.out.println("It's builder");
    }
}