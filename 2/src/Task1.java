public class Task1 {
    public static void main(String[] args) {

        Man oleg = new Man("Oleg", "Romaniuk", 22);
        System.out.println(oleg);
        Man stepan = new Man("Stepan", "Siriy", 25);
        System.out.println(stepan);

        System.out.println(oleg.equals(stepan));

    }
}

class Man
{
    private String FirstName;
    private String LastName;
    private int Age;

    public Man(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }


    @Override
    public int hashCode() {
        return FirstName.hashCode() + LastName.hashCode() + Age;
    }

    @Override
    public boolean equals(Object obj) {
        return hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return FirstName + " " + LastName + " " + Age + " old.";
    }
}