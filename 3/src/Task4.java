public class Task4 {
    public static void main(String[] args) {

        Device teapot = new Teapot();
        teapot.Show();
        teapot.Desc();
        teapot.Sound();

    }
}

class Device
{
    void Sound(){
        System.out.println("No sound");
    }

    void Show(){
        System.out.println("No show");
    }

    void Desc(){
        System.out.println("No description");
    }
}

class Teapot extends Device
{
    @Override
    void Sound() {
        System.out.println("Shhhhhhhh");
    }

    @Override
    void Show() {
        System.out.println("Teapot");
    }

    @Override
    void Desc() {
        System.out.println("Good teapot");
    }
}


class Microwave extends Device
{
    @Override
    void Sound() {
        System.out.println("Vrjrjrjrj");
    }

    @Override
    void Show() {
        System.out.println("Microwave");
    }

    @Override
    void Desc() {
        System.out.println("Good Microwave");
    }
}

class Car extends Device
{
    @Override
    void Sound() {
        System.out.println("Drrrrrrr");
    }

    @Override
    void Show() {
        System.out.println("Car");
    }

    @Override
    void Desc() {
        System.out.println("Good Car");
    }
}

class Steamship extends Device
{
    @Override
    void Sound() {
        System.out.println("Tuuuuuuu");
    }

    @Override
    void Show() {
        System.out.println("Steamship");
    }

    @Override
    void Desc() {
        System.out.println("Good Steamship");
    }
}