package java.by.epam.library.view.print;

import java.by.epam.library.entity.PrintedEdition;

import java.util.ArrayList;

/**
 * Created by Andrei_Sakharuk on 4/14/2018.
 */
public class PrintAsList implements Printable {

    public void print(ArrayList<PrintedEdition> list) {
        for (PrintedEdition pe : list) {
            System.out.println("Автор = " + pe.getAuthor() + ", Имя = " + pe.getName() + ", Цена = " + pe.getPrice());
        }
        System.out.println(" ");
    }
}
