import java.util.Objects;

public class Task5 {
    public static void main(String[] args) {

        Book java = new Book("java 8", "Tom", 2015, "Oracle", 980, "Science");
        System.out.println(java);
    }
}

class Book
{
    private String Name;
    private String AuthorFullName;
    private int Year;
    private String PublisherName;
    private int CountPages;
    private String genre;

    public Book(String name, String authorFullName, int year, String publisherName, int countPages, String genre) {
        Name = name;
        AuthorFullName = authorFullName;
        Year = year;
        PublisherName = publisherName;
        CountPages = countPages;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Year == book.Year && CountPages == book.CountPages && Name.equals(book.Name) && AuthorFullName.equals(book.AuthorFullName) && PublisherName.equals(book.PublisherName) && genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, AuthorFullName, Year, PublisherName, CountPages, genre);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthorFullName() {
        return AuthorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        AuthorFullName = authorFullName;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String publisherName) {
        PublisherName = publisherName;
    }

    public int getCountPages() {
        return CountPages;
    }

    public void setCountPages(int countPages) {
        CountPages = countPages;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", AuthorFullName='" + AuthorFullName + '\'' +
                ", Year=" + Year +
                ", genre='" + genre + '\'' +
                '}';
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
