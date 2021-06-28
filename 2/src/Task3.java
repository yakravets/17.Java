public class Task3 {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 25000000);
        System.out.println(poland);
    }
}

class Country
{
    private String Name;
    private int countPeoles;

    public Country(String name, int countPeoles) {
        Name = name;
        this.countPeoles = countPeoles;
    }

    @Override
    public int hashCode() {
        return Name.hashCode() + countPeoles;
    }

    @Override
    public boolean equals(Object obj) {
        return hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCountPeoles() {
        return countPeoles;
    }

    public void setCountPeoles(int countPeoles) {
        this.countPeoles = countPeoles;
    }
}
