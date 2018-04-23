package java.by.epam.library.entity;

import java.util.ArrayList;

public class Dictionary extends PrintedEdition {

    private ArrayList<String> listOfTermins = new ArrayList<String>();

    public Dictionary(String author, String name, int price, String termin1, String termin2) {
        setAuthor(author);
        setName(name);
        setPrice(price);
        listOfTermins.add(0, termin1);
        listOfTermins.add(1, termin2);
    }

    public ArrayList<String> getListOfTermins() {
        return listOfTermins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dictionary)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        Dictionary that = (Dictionary) o;

        return listOfTermins != null ? listOfTermins.equals(that.listOfTermins) : that.listOfTermins == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (listOfTermins != null ? listOfTermins.hashCode() : 0);
        return result;
    }
}
