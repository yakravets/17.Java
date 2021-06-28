public class Task2 {
    public static void main(String[] args) {

        City rivne = new City("Rivne", 250000);
        System.out.println(rivne);
    }
}

class City
{
    private String Name;
    private int countPeoples;

    public City(String name, int countPeoples) {
        Name = name;
        this.countPeoples = countPeoples;
    }

    @Override
    public int hashCode() {
        return Name.hashCode() + countPeoples;
    }

    @Override
    public boolean equals(Object obj) {
        return hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return Name + " " + countPeoples;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCountPeoples() {
        return countPeoples;
    }

    public void setCountPeoples(int countPeoples) {
        this.countPeoples = countPeoples;
    }
}
