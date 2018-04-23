package java.by.epam.library.entity;

public class NewsPaper extends PrintedEdition {

    private String news;

    public NewsPaper(String author, String name, int price, String news1) {
        super(author, name, price);
        this.news = news1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewsPaper)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        NewsPaper newsPaper = (NewsPaper) o;

        return news != null ? news.equals(newsPaper.news) : newsPaper.news == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (news != null ? news.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Library{" + "library=" + news + '}';
    }
}
