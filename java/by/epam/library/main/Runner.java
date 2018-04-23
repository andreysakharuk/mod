package java.by.epam.library.main;

import java.by.epam.library.data.PosterReader;
import java.by.epam.library.entity.Dictionary;
import java.by.epam.library.entity.Library;
import java.by.epam.library.entity.NewsPaper;
import java.by.epam.library.entity.Poster;
import java.by.epam.library.entity.PrintedEdition;
import java.by.epam.library.service.find.FindAction;
import java.by.epam.library.service.find.FindByAuthor;
import java.by.epam.library.service.find.FindByPrice;
import java.by.epam.library.service.sort.PrintedEditionNameComparator;
import java.by.epam.library.service.sort.PrintedEditionPriceComparator;
import java.by.epam.library.service.sort.Sortable;
import java.by.epam.library.view.ViewAction;
import java.by.epam.library.view.print.PrintAsList;
import java.by.epam.library.view.print.PrintAsTable;

import java.util.ArrayList;

public class Runner {

    public static void main(String args[]) throws Exception {

        Library library = new Library();
        PosterReader posterReader = new PosterReader();
        ArrayList<String[]> params = posterReader.readParametersFromFile("PosterData");
        for (String[] param : params) {
            library.addPrintEdition(new Poster(param));
        }

        library.addPrintEdition(new NewsPaper("Редактор 1", "РБК", 120, "новость 1"));
        library.addPrintEdition(new NewsPaper("Редактор 2", "РБК", 120, "новость 2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 1", 140, "термин1", "термин2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 2", 110, "термин1", "термин2"));
        library.addPrintEdition(new Dictionary("Даль", "Толковый словарь 3", 130, "термин1", "термин2"));
        ArrayList<PrintedEdition> listOfEditionsDefault = library.getLibrary();

        FindAction findAction = new FindAction();
        ArrayList<PrintedEdition>
            listOfEditionsFoundByAuthor =
            findAction.find(listOfEditionsDefault, new FindByAuthor("Даль"));
        ArrayList<PrintedEdition>
            listOfEditionsFoundByPrice =
            findAction.find(listOfEditionsDefault, new FindByPrice(120));

        ViewAction viewAction = new ViewAction();
        System.out.println("--------- Список всех книг в виде таблицы -----------------------------------------------");
        viewAction.print(listOfEditionsDefault, new PrintAsTable());
        System.out.println("--------- Список книг с ценой '120' в виде списка ---------------------------------------");
        viewAction.print(listOfEditionsFoundByPrice, new PrintAsList());
        System.out.println("--------- Список книг с автором 'Даль' в виде таблицы -----------------------------------");
        viewAction.print(listOfEditionsFoundByAuthor, new PrintAsTable());

        PrintedEditionNameComparator comparatorName = new PrintedEditionNameComparator();
        Sortable sortable = new Sortable();
        ArrayList<PrintedEdition>
            ListOfEditionsFoundByAuthorSorted =
            sortable.sort(listOfEditionsFoundByAuthor, comparatorName);
        System.out.println("--------- Список книг с автором 'Даль' отсортированных по 'Названию' в виде таблицы -----");
        viewAction.print(ListOfEditionsFoundByAuthorSorted, new PrintAsTable());

        PrintedEditionPriceComparator comparatorPrice = new PrintedEditionPriceComparator();
        System.out.println("--------- Список книг с автором 'Даль' отсортированных по 'Цене' в виде таблицы ---------");
        ArrayList<PrintedEdition>
            ListOfEditionsFoundByPriceSorted =
            sortable.sort(listOfEditionsFoundByAuthor, comparatorPrice);
        viewAction.print(ListOfEditionsFoundByPriceSorted, new PrintAsTable());
    }
}







