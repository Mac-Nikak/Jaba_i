import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaSimpleCollection {
    private PizzaSimpleInt[] pizzaList;
    private File theFile;

    public PizzaSimpleCollection(File f) throws FileNotFoundException {
        this.theFile = f;
        this.pizzaList = new PizzaSimpleInt[0];
        read();
    }

    public PizzaSimpleCollection(String str) throws FileNotFoundException {
        this(new File(str));
    }

    public void read() throws FileNotFoundException {
        if (theFile.exists()) {
            Scanner scanner = new Scanner(theFile);
            int n = Integer.parseInt(scanner.nextLine());
            pizzaList = new PizzaSimpleInt[n];
            for (int i = 0; i < n; i++) {
                String name = scanner.nextLine();
                double price = Double.parseDouble(scanner.nextLine());
                pizzaList[i] = new PizzaSimple(name, price);
            }
            scanner.close();
        }
    }


    public void write() throws FileNotFoundException {
        if (theFile.exists()) {
            PrintStream data = new PrintStream(theFile);
            int n = pizzaList.length;
            data.println(n);
            for (int i = 0; i < n; i++) {
                data.println(pizzaList[i].getName());
                data.println(pizzaList[i].getPrice());
            }
        }
    }

    public void add(String name, double price)
    {
        pizzaList = Arrays.copyOf(pizzaList, pizzaList.length + 1);
        pizzaList[pizzaList.length - 1] = new PizzaSimple(name, price);
    }

    public void delete(int index)
    {
        PizzaSimpleInt[] newdata = Arrays.copyOf(Arrays.copyOfRange(pizzaList, 0, index), pizzaList.length-1);
        for (int i = index + 1; i < pizzaList.length; i ++)
        {
            newdata[i-1] = pizzaList[i];
        }
    }
}