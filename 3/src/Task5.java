public class Task5 {
    public static void main(String[] args) {

        MusicInstrument viola = new Viola();
        viola.Show();
        viola.Desc();
        viola.History();
        viola.Sound();

    }
}

class MusicInstrument
{
    void Show()
    {
        System.out.println("Basic instrument");
    }

    void Sound()
    {
        System.out.println("No sound");
    }
    void Desc()
    {
        System.out.println("Basic description instrument");
    }
    void History(){
        System.out.println("No history");
    }
}

class Viola extends MusicInstrument
{
    @Override
    void Show() {
        System.out.println("Viola");
    }

    @Override
    void Sound() {
        System.out.println("Vi-vi-vi-vi-viiiiiii");
    }

    @Override
    void Desc() {
        System.out.println("Viola description");
    }

    @Override
    void History() {
        System.out.println("Viola history");
    }
}

class Trombone extends MusicInstrument
{
    @Override
    void Show() {
        System.out.println("Trombone");
    }

    @Override
    void Sound() {
        System.out.println("Tu-tu-tu-tu");
    }

    @Override
    void Desc() {
        System.out.println("Trombone description");
    }

    @Override
    void History() {
        System.out.println("Trombone history");
    }
}

class Ukulele extends MusicInstrument
{
    @Override
    void Show() {
        System.out.println("Ukulele");
    }

    @Override
    void Sound() {
        System.out.println("Tam-ta-tam-ta-ta-tam");
    }

    @Override
    void Desc() {
        System.out.println("Ukulele description");
    }

    @Override
    void History() {
        System.out.println("Ukulele history");
    }
}

class Violin extends MusicInstrument
{
    @Override
    void Show() {
        System.out.println("Violin");
    }

    @Override
    void Sound() {
        System.out.println("Violin sound");
    }

    @Override
    void Desc() {
        System.out.println("Violin description");
    }

    @Override
    void History() {
        System.out.println("Violin history");
    }
}