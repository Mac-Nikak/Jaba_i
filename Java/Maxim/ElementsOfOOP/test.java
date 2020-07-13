import java.io.File;
import java.io.FileNotFoundException;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        File x = new File("Java/Maxim/ElementsOfOOP/data.txt");
        PizzaSimpleCollection d = new PizzaSimpleCollection(x);
        d.view();
        d.delete(2);
        d.view();
    }
}
