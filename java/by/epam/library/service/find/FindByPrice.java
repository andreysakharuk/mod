package java.by.epam.library.service.find;

import java.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;


public class FindByPrice implements Findable {

    private int price;

    public FindByPrice(int price) {
        this.price = price;
    }

    public ArrayList<PrintedEdition> find(ArrayList<PrintedEdition> list) {
        ArrayList<PrintedEdition> foundList = new ArrayList<PrintedEdition>();
        for (PrintedEdition pe : list) {
            if (pe.getPrice() == this.price) {
                foundList.add(pe);
            }
        }
        return foundList;
    }

}
