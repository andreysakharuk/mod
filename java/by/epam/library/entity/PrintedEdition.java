package java.by.epam.library.entity;


public class PrintedEdition {

    private String author;
    private String name;
    private int price;

    public PrintedEdition() {
    }

    public PrintedEdition(String author, String name, int price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrintedEdition)) {
            return false;
        }
        PrintedEdition that = (PrintedEdition) o;
        if (price != that.price) {
            return false;
        }
        if (author != null ? !author.equals(that.author) : that.author != null) {
            return false;
        }
        return name != null ? name.equals(that.name) : that.name == null;
    }
}
