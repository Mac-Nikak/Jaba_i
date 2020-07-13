import java.io.File;

public class test {
    public static void main(String[] args)
    {
        File x = new File("ElementsOfOOP/data.txt");
        System.out.println(x.exists());
        System.out.print(x.getAbsolutePath());
    }
}
