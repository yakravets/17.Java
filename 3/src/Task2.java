public class Task2 {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        tiger.Name();
        tiger.Charakteristics();

        Animal allig = new Alligator();
        allig.Name();
        allig.Charakteristics();

        Animal kenguru = new Kenguru();
        kenguru.Name();
        kenguru.Charakteristics();
    }
}

class Animal
{
    void Name()
    {
        System.out.println("Animal");
    }

    void Charakteristics()
    {
        System.out.println("None");
    }
}

class Tiger extends Animal
{
    @Override
    void Name() {
        System.out.println("Tiger");
    }

    @Override
    void Charakteristics() {
        System.out.println("Tiger has big speed and power");
    }
}

class Alligator extends Animal
{
    @Override
    void Name() {
        System.out.println("Alligator");
    }

    @Override
    void Charakteristics() {
        System.out.println("Formidable on the rivers");
    }
}

class Kenguru extends Animal
{
    @Override
    void Name() {
        System.out.println("Kenguru");
    }

    @Override
    void Charakteristics() {
        System.out.println("Faster");
    }
}