package java.by.epam.library.service.sort;

import java.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sortable {

    public ArrayList<PrintedEdition> sort(ArrayList<PrintedEdition> list, Comparator<PrintedEdition> comp) {
        Collections.sort(list, comp);
        return list;
    }
}
