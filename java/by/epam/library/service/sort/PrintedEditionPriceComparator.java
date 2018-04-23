package java.by.epam.library.service.sort;

import java.by.epam.library.entity.PrintedEdition;

import java.util.Comparator;

public class PrintedEditionPriceComparator implements Comparator<PrintedEdition> {

    public int compare(PrintedEdition o1, PrintedEdition o2) {
        int price1 = o1.getPrice();
        int price2 = o2.getPrice();
        if (price1 < price2) {
            return -1;
        } else if (price1 == price2) {
            return 0;
        } else {
            return 1;
        }
    }

}
