package java.by.epam.library.service.find;

import java.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;

public class FindAction {

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list, Findable matcher) {
        return matcher.find(list);
    }
}
