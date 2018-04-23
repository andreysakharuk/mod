package java.by.epam.library.entity;

import java.util.ArrayList;


public class Library {

    private ArrayList<PrintedEdition> library;

    public Library() {
        library = new ArrayList<PrintedEdition>();
    }

    public ArrayList<PrintedEdition> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<PrintedEdition> library) {
        this.library = library;
    }

    public void addPrintEdition(PrintedEdition printedEdition) {
        library.add(printedEdition);
    }

    public void deletePrintEdition(PrintedEdition printedEdition) {
        library.remove(printedEdition);
    }

    @Override
    public String toString() {
        return "Library{" + "library=" + library + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Library)) {
            return false;
        }

        Library library1 = (Library) o;

        return library != null ? library.equals(library1.library) : library1.library == null;
    }

    @Override
    public int hashCode() {
        return library != null ? library.hashCode() : 0;
    }
}
