public class Task11 {

    enum Direction
    {
        Horizontal, Vertical
    }

    public static void main(String [] args) {

        printLine(2, Direction.Horizontal, '*');
        printLine(4, Direction.Vertical, '0');

    }

    public static void printLine(int length, Direction dr, char symbol){

        for (int i=0;i<length;i++){
            if (dr == Direction.Horizontal){
                System.out.print(symbol);
            }else if (dr == Direction.Vertical){
                System.out.println(symbol);
            }
        }

        System.out.println();
    }
}
