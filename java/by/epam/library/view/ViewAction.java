package java.by.epam.library.view;

import java.by.epam.library.entity.PrintedEdition;
import java.by.epam.library.view.print.Printable;

import java.util.ArrayList;

public class ViewAction {

    public void print(ArrayList<PrintedEdition> list, Printable matcher) {
        matcher.print(list);
    }
}
