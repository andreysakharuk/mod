package java.by.epam.library.data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrei_Sakharuk on 4/23/2018.
 */
public class PosterReader {

    private ArrayList<String> params;

    public PosterReader() {
        params = new ArrayList<String>();
    }

    public ArrayList<String[]> readParametersFromFile(String pathToFile)
        throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(pathToFile));
        ArrayList<String[]> params2 = new ArrayList<String[]>();
        while (sc.hasNextLine()) {
            params.add(sc.nextLine());
        }
        for (String pa : params) {
            String[] par = pa.split(", ");
            params2.add(par);
        }
        sc.close();
        return params2;
    }
}
